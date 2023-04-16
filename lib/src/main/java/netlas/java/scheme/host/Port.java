package netlas.java.scheme.host;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"prot4", "protocol", "port", "prot7"})
public class Port {

  @JsonProperty("prot4")
  private String prot4;

  @JsonProperty("protocol")
  private String protocol;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("prot7")
  private String prot7;

  @JsonProperty("prot4")
  public String getProt4() {
    return prot4;
  }

  @JsonProperty("prot4")
  public void setProt4(String prot4) {
    this.prot4 = prot4;
  }

  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  @JsonProperty("protocol")
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  @JsonProperty("port")
  public void setPort(Integer port) {
    this.port = port;
  }

  @JsonProperty("prot7")
  public String getProt7() {
    return prot7;
  }

  @JsonProperty("prot7")
  public void setProt7(String prot7) {
    this.prot7 = prot7;
  }
}
