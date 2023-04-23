package netlas.java;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import netlas.java.datatype.DataType;
import netlas.java.exception.NetlasRequestException;
import netlas.java.scheme.CertificateResponse;
import netlas.java.scheme.Count;
import netlas.java.scheme.DnsResponse;
import netlas.java.scheme.Host;
import netlas.java.scheme.Stat;
import netlas.java.scheme.WhoisResponse;
import netlas.java.scheme.indices.Index;
import netlas.java.scheme.profile.Profile;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/** A class for interacting with the Netlas API. */
public class Netlas {
  private static int TIMEOUT_S = 120;
  private String apiKey;
  private String apiBase;
  private OkHttpClient client;
  private ObjectMapper objectMapper;

  /**
   * Public constructor to initialize the API key, API base, client, and object mapper.
   *
   * @param apiKey The API key for authentication
   * @param apiBase The base URL of the Netlas API
   */
  public Netlas(String apiKey, String apiBase) {
    this();
    this.apiKey = apiKey;
    this.apiBase = apiBase;
  }

  /** Private constructor to initialize default values for API base, client, and object mapper. */
  private Netlas() {
    this.apiBase = "https://app.netlas.io";
    this.client =
        new OkHttpClient()
            .newBuilder()
            .connectTimeout(TIMEOUT_S, TimeUnit.SECONDS)
            .readTimeout(TIMEOUT_S, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT_S, TimeUnit.SECONDS)
            .build();
    this.objectMapper =
        new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    ;
  }

  public netlas.java.scheme.Response response(
      String query, int page, String indices, String fields, boolean excludeFields)
      throws NetlasRequestException {
    return deserializeResponse(
        query,
        DataType.RESPONSE,
        page,
        indices,
        fields,
        excludeFields,
        netlas.java.scheme.Response.class);
  }

  public DnsResponse domain(
      String query, int page, String indices, String fields, boolean excludeFields)
      throws NetlasRequestException {
    return deserializeResponse(
        query, DataType.DOMAIN, page, indices, fields, excludeFields, DnsResponse.class);
  }

  public WhoisResponse whoisIp(
      String query, int page, String indices, String fields, boolean excludeFields)
      throws NetlasRequestException {
    return deserializeResponse(
        query, DataType.WHOIS_IP, page, indices, fields, excludeFields, WhoisResponse.class);
  }

  public WhoisResponse whoisDomain(
      String query, int page, String indices, String fields, boolean excludeFields)
      throws NetlasRequestException {
    return deserializeResponse(
        query, DataType.WHOIS_DOMAIN, page, indices, fields, excludeFields, WhoisResponse.class);
  }

  public CertificateResponse cert(
      String query, int page, String indices, String fields, boolean excludeFields)
      throws NetlasRequestException {
    return deserializeResponse(
        query, DataType.CERT, page, indices, fields, excludeFields, CertificateResponse.class);
  }

  /**
   * Counts the number of matching results for the specified query and datatype.
   *
   * @param query The search query
   * @param indices The indices to search in
   * @return A Count object containing the count of matching results
   * @throws NetlasRequestException If there is an error while making the request
   */
  public Count count(String query, DataType dataType, String indices)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/" + dataType.getValue() + "_count/")
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("indices", indices);

    try {
      JsonNode request = request(urlBuilder);
      return objectMapper.convertValue(request, Count.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /**
   * Retrieves statistics for the specified query, grouped by the specified fields.
   *
   * @param query The search query
   * @param groupFields The fields to group the results by
   * @param indices The indices to search in
   * @param size The number of results to return per group
   * @param indexType The type of index to search
   * @return A Stat object containing the statistics
   * @throws NetlasRequestException If there is an error while making the request
   */
  public Stat stat(String query, String groupFields, String indices, int size, String indexType)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/stat/")
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("fields", groupFields)
            .addQueryParameter("indices", indices)
            .addQueryParameter("size", Integer.toString(size))
            .addQueryParameter("index_type", indexType);

    try {
      JsonNode request = request(urlBuilder);
      return objectMapper.convertValue(request, Stat.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /**
   * Retrieves the profile information of the current user.
   *
   * @return A Profile object containing the user's profile information
   * @throws NetlasRequestException If there is an error while making the request
   */
  public Profile profile() throws NetlasRequestException {
    HttpUrl.Builder urlBuilder = HttpUrl.parse(apiBase + "/api/users/current/").newBuilder();
    try {
      JsonNode request = request(urlBuilder);
      return objectMapper.convertValue(request, Profile.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /**
   * Retrieves information about the specified host.
   *
   * @param query The host query
   * @param fields The fields to include or exclude in the response
   * @param excludeFields Whether to exclude the specified fields from the response
   * @return A Host object containing the host information
   * @throws NetlasRequestException If there is an error while making the request
   */
  public Host host(String query, String fields, boolean excludeFields)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/host/" + query)
            .newBuilder()
            .addQueryParameter("fields", fields)
            .addQueryParameter("source_type", excludeFields ? "exclude" : "include");

    try {
      JsonNode request = request(urlBuilder);
      return objectMapper.convertValue(request, Host.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /*
   * Retrieves the list of indices available for the current user.
   *
   * @return A list of Index objects containing the indices information
   *
   * @throws NetlasRequestException If there is an error while making the request
   */
  public List<Index> indices() throws NetlasRequestException {
    HttpUrl.Builder urlBuilder = HttpUrl.parse(apiBase + "/api/indices/").newBuilder();

    try {
      JsonNode request = request(urlBuilder);
      return objectMapper.readValue(
          request.toString(),
          objectMapper.getTypeFactory().constructCollectionType(List.class, Index.class));
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /**
   * Downloads data matching the specified query and parameters as an InputStream.
   *
   * @param query The search query
   * @param fields The fields to include or exclude in the response
   * @param excludeFields Whether to exclude the specified fields from the response
   * @param datatype The type of data to download
   * @param size The number of results to download
   * @param indices The indices to search in
   * @return An InputStream containing the downloaded data
   * @throws NetlasRequestException If there is an error while making the request
   */
  public InputStream download(
      String query,
      String fields,
      boolean excludeFields,
      DataType datatype,
      int size,
      String indices)
      throws NetlasRequestException {
    String endpoint = apiBase + "/api/" + datatype.getValue() + "/download/";

    ObjectMapper objectMapper = new ObjectMapper();
    ObjectNode payload = objectMapper.createObjectNode();
    payload.put("q", query);
    payload.put("size", size);
    payload.put("indices", indices);
    payload.put("raw", true);
    payload.put("fields", fields);
    payload.put("source_type", excludeFields ? "exclude" : "include");

    String jsonPayload;
    try {
      jsonPayload = objectMapper.writeValueAsString(payload);
    } catch (JsonProcessingException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }

    MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    RequestBody body = RequestBody.create(jsonPayload, JSON);

    Request request =
        new Request.Builder().url(endpoint).post(body).addHeader("X-Api-Key", apiKey).build();

    try {
      Response response = client.newCall(request).execute();
      ResponseBody responseBody = response.body();

      if (!response.isSuccessful() || responseBody == null) {
        throw new NetlasRequestException(
            "Error: " + response.code() + " " + response.message(),
            new IOException("Error: " + response.code() + " " + response.message()));
      }

      return responseBody.byteStream();
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /**
   * Sets the OkHttpClient instance to be used for making requests.
   *
   * @param client The OkHttpClient instance
   */
  public void setClient(OkHttpClient client) {
    this.client = client;
  }

  /**
   * Returns a new Builder instance for configuring and creating a Netlas instance.
   *
   * @return A new Builder instance
   */
  public static Builder newBuilder() {
    return new Netlas().new Builder();
  }

  /** A builder class for creating a Netlas instance with custom configurations. */
  public final class Builder {
    /**
     * Sets the API key to be used for authenticating requests.
     *
     * @param apiKey The API key
     * @return The current Builder instance
     */
    public Builder setApiKey(String apiKey) {
      Netlas.this.apiKey = apiKey;
      return this;
    }

    /**
     * Sets the base URL for the Netlas API.
     *
     * @param apiBase The base URL
     * @return The current Builder instance
     */
    public Builder setApiBase(String apiBase) {
      Netlas.this.apiBase = apiBase;
      return this;
    }

    /**
     * Sets the OkHttpClient instance to be used for making requests.
     *
     * @param client The OkHttpClient instance
     * @return The current Builder instance
     */
    public Builder setClient(OkHttpClient client) {
      Netlas.this.client = client;
      return this;
    }

    /**
     * Creates a new Netlas instance with the configured settings.
     *
     * @return A new Netlas instance
     */
    public Netlas build() {
      return Netlas.this;
    }
  }

  /**
   * Makes an HTTP request to the specified URL and returns the response as a JsonNode.
   *
   * @param urlBuilder The HttpUrl.Builder instance used to build the request URL
   * @return The response body as a JsonNode
   * @throws IOException If there is an error while making the request or processing the response
   */
  private JsonNode request(HttpUrl.Builder urlBuilder) throws IOException {
    Request request =
        new Request.Builder()
            .url(urlBuilder.build())
            .addHeader("Content-Type", "application/json")
            .addHeader("X-Api-Key", apiKey)
            .build();

    try (Response response = client.newCall(request).execute()) {
      String responseBody = response.body().string();
      return objectMapper.readTree(responseBody);
    }
  }

  private JsonNode request(
      String query,
      DataType dataType,
      int page,
      String indices,
      String fields,
      boolean excludeFields)
      throws IOException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/" + dataType.getValue() + "/")
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("start", Integer.toString(page * 20))
            .addQueryParameter("indices", indices)
            .addQueryParameter("fields", fields)
            .addQueryParameter("source_type", excludeFields ? "exclude" : "include");

    return request(urlBuilder);
  }

  private <T> T deserializeResponse(
      String query,
      DataType dataType,
      int page,
      String indices,
      String fields,
      boolean excludeFields,
      Class<T> responseType)
      throws NetlasRequestException {
    try {
      JsonNode request = request(query, dataType, page, indices, fields, excludeFields);
      return objectMapper.convertValue(request, responseType);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }
}
