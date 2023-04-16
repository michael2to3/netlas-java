package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "hash_sha256",
  "image",
  "path",
  "cert_md5",
  "perceptual_hash",
  "ip",
  "host",
  "uri",
  "last_modified"
})
public class Favicon {

  @JsonProperty("hash_sha256")
  private String hashSha256;

  @JsonProperty("image")
  private String image;

  @JsonProperty("path")
  private String path;

  @JsonProperty("cert_md5")
  private String certMd5;

  @JsonProperty("perceptual_hash")
  private String perceptualHash;

  @JsonProperty("ip")
  private String ip;

  @JsonProperty("host")
  private String host;

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("last_modified")
  private List<String> lastModified = new ArrayList<String>();

  @JsonProperty("hash_sha256")
  public String getHashSha256() {
    return hashSha256;
  }

  @JsonProperty("hash_sha256")
  public void setHashSha256(String hashSha256) {
    this.hashSha256 = hashSha256;
  }

  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  @JsonProperty("image")
  public void setImage(String image) {
    this.image = image;
  }

  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(String path) {
    this.path = path;
  }

  @JsonProperty("cert_md5")
  public String getCertMd5() {
    return certMd5;
  }

  @JsonProperty("cert_md5")
  public void setCertMd5(String certMd5) {
    this.certMd5 = certMd5;
  }

  @JsonProperty("perceptual_hash")
  public String getPerceptualHash() {
    return perceptualHash;
  }

  @JsonProperty("perceptual_hash")
  public void setPerceptualHash(String perceptualHash) {
    this.perceptualHash = perceptualHash;
  }

  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  @JsonProperty("ip")
  public void setIp(String ip) {
    this.ip = ip;
  }

  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  @JsonProperty("host")
  public void setHost(String host) {
    this.host = host;
  }

  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  @JsonProperty("uri")
  public void setUri(String uri) {
    this.uri = uri;
  }

  @JsonProperty("last_modified")
  public List<String> getLastModified() {
    return lastModified;
  }

  @JsonProperty("last_modified")
  public void setLastModified(List<String> lastModified) {
    this.lastModified = lastModified;
  }
}
