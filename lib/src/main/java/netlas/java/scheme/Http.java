package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "headers",
  "status_code",
  "http_version",
  "unknown_headers",
  "status_line",
  "favicon",
  "body_sha256",
  "description",
  "title",
  "body",
  "transfer_encoding",
  "meta",
  "content_length"
})
public class Http {

  @JsonProperty("headers")
  private Headers headers;

  @JsonProperty("status_code")
  private Integer statusCode;

  @JsonProperty("http_version")
  private HttpVersion httpVersion;

  @JsonProperty("unknown_headers")
  private List<UnknownHeader> unknownHeaders = new ArrayList<UnknownHeader>();

  @JsonProperty("status_line")
  private String statusLine;

  @JsonProperty("favicon")
  private Favicon favicon;

  @JsonProperty("body_sha256")
  private String bodySha256;

  @JsonProperty("description")
  private String description;

  @JsonProperty("title")
  private String title;

  @JsonProperty("body")
  private String body;

  @JsonProperty("transfer_encoding")
  private List<String> transferEncoding = new ArrayList<String>();

  @JsonProperty("meta")
  private List<String> meta = new ArrayList<String>();

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

  @JsonProperty("http_version")
  public HttpVersion getHttpVersion() {
    return httpVersion;
  }

  @JsonProperty("http_version")
  public void setHttpVersion(HttpVersion httpVersion) {
    this.httpVersion = httpVersion;
  }

  @JsonProperty("unknown_headers")
  public List<UnknownHeader> getUnknownHeaders() {
    return unknownHeaders;
  }

  @JsonProperty("unknown_headers")
  public void setUnknownHeaders(List<UnknownHeader> unknownHeaders) {
    this.unknownHeaders = unknownHeaders;
  }

  @JsonProperty("status_line")
  public String getStatusLine() {
    return statusLine;
  }

  @JsonProperty("status_line")
  public void setStatusLine(String statusLine) {
    this.statusLine = statusLine;
  }

  @JsonProperty("favicon")
  public Favicon getFavicon() {
    return favicon;
  }

  @JsonProperty("favicon")
  public void setFavicon(Favicon favicon) {
    this.favicon = favicon;
  }

  @JsonProperty("body_sha256")
  public String getBodySha256() {
    return bodySha256;
  }

  @JsonProperty("body_sha256")
  public void setBodySha256(String bodySha256) {
    this.bodySha256 = bodySha256;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
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

  @JsonProperty("transfer_encoding")
  public List<String> getTransferEncoding() {
    return transferEncoding;
  }

  @JsonProperty("transfer_encoding")
  public void setTransferEncoding(List<String> transferEncoding) {
    this.transferEncoding = transferEncoding;
  }

  @JsonProperty("meta")
  public List<String> getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(List<String> meta) {
    this.meta = meta;
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
