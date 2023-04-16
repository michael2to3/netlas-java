package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"client_auth", "server_auth"})
public class ExtendedKeyUsage__1 {

  @JsonProperty("client_auth")
  private Boolean clientAuth;

  @JsonProperty("server_auth")
  private Boolean serverAuth;

  @JsonProperty("client_auth")
  public Boolean getClientAuth() {
    return clientAuth;
  }

  @JsonProperty("client_auth")
  public void setClientAuth(Boolean clientAuth) {
    this.clientAuth = clientAuth;
  }

  @JsonProperty("server_auth")
  public Boolean getServerAuth() {
    return serverAuth;
  }

  @JsonProperty("server_auth")
  public void setServerAuth(Boolean serverAuth) {
    this.serverAuth = serverAuth;
  }
}
