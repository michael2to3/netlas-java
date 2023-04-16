package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "headers",
  "status_code",
  "body_sha256",
  "http_version",
  "status_line",
  "title",
  "body",
  "content_length"
})
public class Http {

  @JsonProperty("headers")
  private Headers headers;

  @JsonProperty("status_code")
  private Integer statusCode;

  @JsonProperty("body_sha256")
  private String bodySha256;

  @JsonProperty("http_version")
  private HttpVersion httpVersion;

  @JsonProperty("status_line")
  private String statusLine;

  @JsonProperty("title")
  private String title;

  @JsonProperty("body")
  private String body;

  @JsonProperty("content_length")
  private Integer contentLength;

  @JsonProperty("headers")
  public Headers getHeaders() {
    return headers;
  }

  @JsonProperty("headers")
  public void setHeaders(Headers headers) {
    this.headers = headers;
  }

  @JsonProperty("status_code")
  public Integer getStatusCode() {
    return statusCode;
  }

  @JsonProperty("status_code")
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  @JsonProperty("body_sha256")
  public String getBodySha256() {
    return bodySha256;
  }

  @JsonProperty("body_sha256")
  public void setBodySha256(String bodySha256) {
    this.bodySha256 = bodySha256;
  }

  @JsonProperty("http_version")
  public HttpVersion getHttpVersion() {
    return httpVersion;
  }

  @JsonProperty("http_version")
  public void setHttpVersion(HttpVersion httpVersion) {
    this.httpVersion = httpVersion;
  }

  @JsonProperty("status_line")
  public String getStatusLine() {
    return statusLine;
  }

  @JsonProperty("status_line")
  public void setStatusLine(String statusLine) {
    this.statusLine = statusLine;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  @JsonProperty("body")
  public void setBody(String body) {
    this.body = body;
  }

  @JsonProperty("content_length")
  public Integer getContentLength() {
    return contentLength;
  }

  @JsonProperty("content_length")
  public void setContentLength(Integer contentLength) {
    this.contentLength = contentLength;
  }
}
