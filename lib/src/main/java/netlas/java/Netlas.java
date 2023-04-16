package netlas.java;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import netlas.java.datatype.DataType;
import netlas.java.exception.NetlasRequestException;
import netlas.java.scheme.Count;
import netlas.java.scheme.Stat;
import netlas.java.scheme.host.Host;
import netlas.java.scheme.indices.Index;
import netlas.java.scheme.profile.Profile;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/** A class for interacting with the Netlas API. */
public class Netlas {
  private String apiKey;
  private String apiBase;
  private OkHttpClient client;
  private ObjectMapper objectMapper;

  /** Private constructor to initialize default values for API base, client, and object mapper. */
  private Netlas() {
    this.apiBase = "https://app.netlas.io";
    this.client = new OkHttpClient();
    this.objectMapper = new ObjectMapper();
  }

  /**
   * Public constructor to initialize the API key, API base, client, and object mapper.
   *
   * @param apiKey The API key for authentication
   * @param apiBase The base URL of the Netlas API
   */
  public Netlas(String apiKey, String apiBase) {
    this.apiKey = apiKey;
    this.apiBase = apiBase;
    this.client = new OkHttpClient();
    this.objectMapper = new ObjectMapper();
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

  /**
   * Searches for data matching the specified query and returns a Response object.
   *
   * @param query The search query
   * @param datatype The type of data to search for
   * @param page The page number to start from
   * @param indices The indices to search in
   * @param fields The fields to include or exclude in the response
   * @param excludeFields Whether to exclude the specified fields from the response
   * @return A Response object containing the search results
   * @throws NetlasRequestException If there is an error while making the request
   */
  public netlas.java.scheme.Response search(
      String query,
      DataType datatype,
      int page,
      String indices,
      String fields,
      boolean excludeFields)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/" + datatype.getValue() + "/")
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("start", Integer.toString(page * 20))
            .addQueryParameter("indices", indices)
            .addQueryParameter("fields", fields)
            .addQueryParameter("source_type", excludeFields ? "exclude" : "include");

    try {
      JsonNode request = request(urlBuilder);
      return objectMapper.convertValue(request, netlas.java.scheme.Response.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  /**
   * Counts the number of matching results for the specified query and datatype.
   *
   * @param query The search query
   * @param datatype The type of data to count
   * @param indices The indices to search in
   * @return A Count object containing the count of matching results
   * @throws NetlasRequestException If there is an error while making the request
   */
  public Count count(String query, DataType datatype, String indices)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/" + datatype.getValue() + "_count/")
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
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/" + datatype.getValue() + "/download/")
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("size", Integer.toString(size))
            .addQueryParameter("indices", indices)
            .addQueryParameter("raw", "true")
            .addQueryParameter("fields", fields)
            .addQueryParameter("source_type", excludeFields ? "exclude" : "include");

    OkHttpClient client = new OkHttpClient();

    Request request =
        new Request.Builder()
            .url(urlBuilder.build())
            .addHeader("Authorization", "Bearer " + apiKey)
            .build();

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
}
