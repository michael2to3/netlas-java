package netlas.java;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Netlas {

  private final String apiKey;
  private final String apiBase;
  private final boolean debug;
  private final OkHttpClient client;

  public Netlas(String apiKey, String apiBase, boolean debug) {
    this.apiKey = apiKey;
    this.apiBase = apiBase.endsWith("/") ? apiBase.substring(0, apiBase.length() - 1) : apiBase;
    this.debug = debug;
    this.client = new OkHttpClient.Builder().build();
  }

  private String buildEndpointUrl(String endpoint) {
    return apiBase + endpoint;
  }

  private Request buildRequest(String endpoint, HttpUrl.Builder urlBuilder) {
    HttpUrl url = urlBuilder.build();
    Request.Builder requestBuilder = new Request.Builder()
        .url(buildEndpointUrl(endpoint))
        .header("Content-Type", "application/json")
        .header("X-Api-Key", apiKey)
        .get();
    return requestBuilder.build();
  }

  private Response sendRequest(Request request) throws IOException, APIException {
    Response response = client.newCall(request).execute();
    if (!response.isSuccessful()) {
      throw new APIException(response.code() + ": " + response.message());
    }
    return response;
  }

  public String getRequest(String endpoint, HttpUrl.Builder urlBuilder) throws APIException {
    try {
      Request request = buildRequest(endpoint, urlBuilder);
      Response response = sendRequest(request);
      return response.body().string();
    } catch (IOException e) {
      throw new APIException("Error sending HTTP request", e);
    }
  }

  public byte[] getStreamRequest(String endpoint, HttpUrl.Builder urlBuilder) throws APIException {
    try {
      Request request = buildRequest(endpoint, urlBuilder);
      Response response = sendRequest(request);
      return response.body().bytes();
    } catch (IOException e) {
      throw new APIException("Error sending HTTP request", e);
    }
  }

  public String search(String query, String datatype, int page, String indices, String fields, boolean excludeFields)
      throws APIException {
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
    HttpUrl.Builder urlBuilder = HttpUrl.parse(buildEndpointUrl(endpoint)).newBuilder()
        .addQueryParameter("q", query)
        .addQueryParameter("page", String.valueOf(page))
        .addQueryParameter("indices", indices);
    if (fields != null) {
      urlBuilder.addQueryParameter("fields", fields);
    }
    if (excludeFields) {
      urlBuilder.addQueryParameter("exclude_fields", "true");
    }
    String responseBody = getRequest(endpoint, urlBuilder);
    return responseBody;
  }

}