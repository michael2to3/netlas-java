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

public class Netlas {
  private String apiKey;
  private String apiBase;
  private OkHttpClient client;
  private ObjectMapper objectMapper;

  private Netlas() {
    this.apiBase = "https://app.netlas.io";
    this.client = new OkHttpClient();
    this.objectMapper = new ObjectMapper();
  }

  public Netlas(String apiKey, String apiBase) {
    this.apiKey = apiKey;
    this.apiBase = apiBase;
    this.client = new OkHttpClient();
    this.objectMapper = new ObjectMapper();
  }

  private JsonNode request(String endpoint, HttpUrl.Builder urlBuilder) throws IOException {
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
      JsonNode request = request(datatype.getValue(), urlBuilder);
      return objectMapper.convertValue(request, netlas.java.scheme.Response.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  public Count count(String query, DataType datatype, String indices)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/" + datatype.getValue() + "_count/")
            .newBuilder()
            .addQueryParameter("q", query)
            .addQueryParameter("indices", indices);

    try {
      JsonNode request = request(datatype.getValue(), urlBuilder);
      return objectMapper.convertValue(request, Count.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

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
      JsonNode request = request("stat", urlBuilder);
      return objectMapper.convertValue(request, Stat.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  public Profile profile() throws NetlasRequestException {
    HttpUrl.Builder urlBuilder = HttpUrl.parse(apiBase + "/api/users/current/").newBuilder();
    try {
      JsonNode request = request("profile", urlBuilder);
      return objectMapper.convertValue(request, Profile.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  public Host host(String query, String fields, boolean excludeFields)
      throws NetlasRequestException {
    HttpUrl.Builder urlBuilder =
        HttpUrl.parse(apiBase + "/api/host/" + query)
            .newBuilder()
            .addQueryParameter("fields", fields)
            .addQueryParameter("source_type", excludeFields ? "exclude" : "include");

    try {
      JsonNode request = request("host", urlBuilder);
      return objectMapper.convertValue(request, Host.class);
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

  public List<Index> indices() throws NetlasRequestException {
    HttpUrl.Builder urlBuilder = HttpUrl.parse(apiBase + "/api/indices/").newBuilder();

    try {
      JsonNode request = request("indices", urlBuilder);
      return objectMapper.readValue(
          request.toString(),
          objectMapper.getTypeFactory().constructCollectionType(List.class, Index.class));
    } catch (IOException e) {
      throw new NetlasRequestException(e.getMessage(), e);
    }
  }

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

  public void setClient(OkHttpClient client) {
    this.client = client;
  }

  public static Builder newBuilder() {
    return new Netlas().new Builder();
  }

  public final class Builder {
    public Builder setApiKey(String apiKey) {
      Netlas.this.apiKey = apiKey;
      return this;
    }

    public Builder setApiBase(String apiBase) {
      Netlas.this.apiBase = apiBase;
      return this;
    }

    public Builder setClient(OkHttpClient client) {
      Netlas.this.client = client;
      return this;
    }

    public Netlas build() {
      return Netlas.this;
    }
  }
}
