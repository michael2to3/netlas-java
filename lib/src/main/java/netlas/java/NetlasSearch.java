package netlas.java;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;

/**
 * NetlasSearch class provides a simple interface for searching Netlas API.
 */
public class NetlasSearch {
    private String api_key;
    private String apibase;
    private boolean debug;
    private boolean verify_ssl;
    private Map<String, String> headers;

    /**
     * Constructor for NetlasSearch.
     * 
     * @param api_key The Netlas API key to be used for making requests.
     * @param apibase The base URL of the Netlas API.
     * @param debug   Whether debug mode is enabled.
     */
    public NetlasSearch(String api_key, String apibase, boolean debug) {
        this.api_key = api_key;
        this.apibase = apibase.endsWith("/") ? apibase.substring(0, apibase.length() - 1) : apibase;
        this.debug = debug;
        this.verify_ssl = this.apibase.equals("https://app.netlas.io");
        this.headers = new HashMap<String, String>();
        this.headers.put("Content-Type", "application/json");
        this.headers.put("X-Api-Key", this.api_key);
    }

    /**
     * Makes an API request to the given endpoint with the given parameters.
     * 
     * @param endpoint The API endpoint to make the request to.
     * @param params   The parameters to include in the request.
     * @return A Map containing the response data from the API.
     * @throws IOException If an error occurs while making the request.
     */
    private Map<String, Object> _request(String endpoint, Map<String, Object> params) throws IOException {
        Map<String, Object> ret = new HashMap<String, Object>();
        URL url = new URL(this.apibase + endpoint + "?" + params.entrySet().stream()
                .map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining("&")));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            conn.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (this.verify_ssl && conn instanceof HttpsURLConnection) {
            ((HttpsURLConnection) conn).setSSLSocketFactory(HttpsURLConnection.getDefaultSSLSocketFactory());
        }
        int status = conn.getResponseCode();
        if (status < 200 || status > 299) {
            ret.put("error", status + ": " + conn.getResponseMessage());
        }
        MapType type = new ObjectMapper().getTypeFactory().constructMapType(Map.class, String.class, Object.class);
        Map<String, Object> response_data = new ObjectMapper().readValue(new InputStreamReader(conn.getInputStream()),
                type);
        ret = response_data;
        return ret;
    }

    /**
     * Sends a search query to the Netlas API and returns the response data as a
     * Map.
     *
     * @param query          The search query to send.
     * @param datatype       The type of data to search for.
     * @param page           The page of results to retrieve.
     * @param indices        The Netlas indices to search within.
     * @param fields         The specific fields to include in the search results.
     * @param exclude_fields Whether or not to exclude certain fields from the
     *                       search results.
     * @return A Map containing the response data from the Netlas API.
     * @throws IOException If there is an error making the HTTP request.
     */
    public Map<String, Object> search(String query, String datatype, int page, String indices, String fields,
            boolean exclude_fields) throws IOException {
        String endpoint = "/api/responses/";
        if (datatype.equals("cert")) {
            endpoint = "/api/certs/";
        } else if (datatype.equals("domain")) {
            endpoint = "/api/domains/";
        } else if (datatype.equals("whois-ip")) {
            endpoint = "/api/whois_ip/";
        } else if (datatype.equals("whois-domain")) {
            endpoint = "/api/whois_domain/";
        }
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("q", query);
        params.put("page", page);
        if (!indices.isEmpty()) {
            params.put("indices", indices);
        }
        if (fields != null) {
            params.put("fields", fields);
        }
        if (exclude_fields) {
            params.put("exclude_fields", "1");
        }
        return _request(endpoint, params);
    }
}
