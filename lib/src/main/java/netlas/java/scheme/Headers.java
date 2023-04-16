package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"date", "server", "content_type", "connection", "content_length"})
public class Headers {

  @JsonProperty("date")
  private List<String> date = new ArrayList<String>();

  @JsonProperty("server")
  private List<String> server = new ArrayList<String>();

  @JsonProperty("content_type")
  private List<String> contentType = new ArrayList<String>();

  @JsonProperty("connection")
  private List<String> connection = new ArrayList<String>();

  @JsonProperty("content_length")
  private List<String> contentLength = new ArrayList<String>();

  @JsonProperty("date")
  public List<String> getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(List<String> date) {
    this.date = date;
  }

  @JsonProperty("server")
  public List<String> getServer() {
    return server;
  }

  @JsonProperty("server")
  public void setServer(List<String> server) {
    this.server = server;
  }

  @JsonProperty("content_type")
  public List<String> getContentType() {
    return contentType;
  }

  @JsonProperty("content_type")
  public void setContentType(List<String> contentType) {
    this.contentType = contentType;
  }

  @JsonProperty("connection")
  public List<String> getConnection() {
    return connection;
  }

  @JsonProperty("connection")
  public void setConnection(List<String> connection) {
    this.connection = connection;
  }

  @JsonProperty("content_length")
  public List<String> getContentLength() {
    return contentLength;
  }

  @JsonProperty("content_length")
  public void setContentLength(List<String> contentLength) {
    this.contentLength = contentLength;
  }
}
