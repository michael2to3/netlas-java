package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"server_public"})
public class Curve25519Sha256Params {

  @JsonProperty("server_public")
  private String serverPublic;

  @JsonProperty("server_public")
  public String getServerPublic() {
    return serverPublic;
  }

  @JsonProperty("server_public")
  public void setServerPublic(String serverPublic) {
    this.serverPublic = serverPublic;
  }
}
