package netlas.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/** A class for interacting with the Netlas API. */
public class Netlas {
  private final String apiKey;
  private final String apiBase;
  private final boolean debug;
  private final int connectionTimeout;

  private final OkHttpClient client;

  /**
   * Constructs a new Netlas instance with the given API key.
   *
   * @param apiKey The API key to use for requests.
   */
  public Netlas(String apiKey) {
    this(apiKey, "https://app.netlas.io", false, 120);
  }

  /**
   * Constructs a new Netlas instance with the given API key and options.
   *
   * @param apiKey The API key to use for requests.
   * @param apiBase The base URL for the Netlas API.
   * @param debug Whether to enable debug mode.
   * @param connectionTimeout The connection timeout in seconds.
   */
  public Netlas(String apiKey, String apiBase, boolean debug, int connectionTimeout) {
    this.apiKey = apiKey;
    this.apiBase = apiBase.endsWith("/") ? apiBase.substring(0, apiBase.length() - 1) : apiBase;
    this.debug = debug;
    this.connectionTimeout = connectionTimeout;
    var builder =
        new OkHttpClient.Builder()
            .writeTimeout(this.connectionTimeout, TimeUnit.SECONDS)
            .readTimeout(this.connectionTimeout, TimeUnit.SECONDS)
            .connectTimeout(this.connectionTimeout, TimeUnit.SECONDS);
    this.client = builder.build();
  }

  /**
   * Returns the API key used by this instance.
   *
   * @return The API key.
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Returns the base URL for the Netlas API used by this instance.
   *
   * @return The base URL.
   */
  public String getApiBase() {
    return apiBase;
  }

  /**
   * Returns whether debug mode is enabled for this instance.
   *
   * @return Whether debug mode is enabled.
   */
  public boolean isDebug() {
    return debug;
  }

  /**
   * Returns the connection timeout in seconds used by this instance.
   *
   * @return The connection timeout in seconds.
   */
  public int getConnectionTimeout() {
    return connectionTimeout;
  }

  /**
   * Returns the OkHttpClient instance used by this instance.
   *
   * @return The OkHttpClient instance.
   */
  public OkHttpClient getClient() {
    return client;
  }

  /**
   * Searches the Netlas API and returns the results as a JsonNode.
   *
   * @param query The search query.
   * @param datatype The type of data to search for (e.g. "cert").
   * @param page The page number of the search results.
   * @param indices The indices to search in (e.g. "certs_prod").
   * @param fields The fields to include in the search results (optional).
   * @param excludeFields Whether to exclude fields from the search results (optional).
   * @return The search results as a JsonNode.
   * @throws ApiException If an error occurs while making the request.
   * @throws JsonMappingException If an error occurs while parsing the response.
   * @throws JsonProcessingException If an error occurs while parsing the response.
   */
  public JsonNode search(
      String query, String datatype, int page, String indices, String fields, boolean excludeFields)
      throws ApiException, JsonMappingException, JsonProcessingException {
    String response = searchAsString(query, datatype, page, indices, fields, excludeFields);
    ObjectMapper mapper = new ObjectMapper();
    JsonNode root = mapper.readTree(response);
    return root;
  }

  /**
   * Searches the Netlas API and returns the results as a string.
   *
   * @param query The search query.
   * @param datatype The type of data to search for (e.g. "cert").
   * @param page The page number of the search results.
   * @param indices The indices to search in (e.g. "certs_prod").
   * @param fields The fields to include in the search results (optional).
   * @param excludeFields Whether to exclude fields from the search results (optional).
   * @return The search results as a string.
   * @throws ApiException If an error occurs while making the request.
   */
  public String searchAsString(
      String query, String datatype, int page, String indices, String fields, boolean excludeFields)
      throws ApiException {
    String endpoint = "/api/responses/";
    if (datatype.equals("cert")) {
      endpoint = "/api/certs/";
    } else if (datatype.equals("domain")) {
      endpoint = "/api/domains/";
    } else if (datatype.equals("whois-ip")) {
      endpoint = "/api/whois_ip/";
    } else if (datatype.equals("whois-domain")) {
      endpoint = "/api/whois_domains/";
    }
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(buildEndpointUrl(endpoint))
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("page", String.valueOf(page))
            .addQueryParameter("indices", indices);
    if (fields != null) {
      urlBuilder.addQueryParameter("fields", fields);
    }
    if (excludeFields) {
      urlBuilder.addQueryParameter("exclude_fields", "true");
    }
    String responseBody = getRequest(urlBuilder);
    return responseBody;
  }

  private String getRequest(HttpUrl.Builder urlBuilder) throws ApiException {
    try {
      Request request = buildRequest(urlBuilder);
      Response response = sendRequest(request);
      return response.body().string();
    } catch (IOException e) {
      throw new ApiException("Error sending HTTP request", e);
    }
  }

  private byte[] getStreamRequest(HttpUrl.Builder urlBuilder) throws ApiException {
    try {
      Request request = buildRequest(urlBuilder);
      Response response = sendRequest(request);
      return response.body().bytes();
    } catch (IOException e) {
      throw new ApiException("Error sending HTTP request", e);
    }
  }

  private String buildEndpointUrl(String endpoint) {
    return apiBase + endpoint;
  }

  private Request buildRequest(HttpUrl.Builder urlBuilder) {
    HttpUrl url = urlBuilder.build();
    Request.Builder requestBuilder =
        new Request.Builder()
            .url(url)
            .header("Content-Type", "application/json")
            .header("X-Api-Key", apiKey)
            .get();
    return requestBuilder.build();
  }

  private Response sendRequest(Request request) throws IOException, ApiException {
    Response response = client.newCall(request).execute();
    if (!response.isSuccessful()) {
      throw new ApiException(response.code() + ": " + response.message());
    }
    return response;
  }
}
