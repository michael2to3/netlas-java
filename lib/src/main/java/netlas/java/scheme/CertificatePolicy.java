package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "cps"})
public class CertificatePolicy {

  @JsonProperty("id")
  private String id;

  @JsonProperty("cps")
  private List<String> cps = new ArrayList<String>();

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("cps")
  public List<String> getCps() {
    return cps;
  }

  @JsonProperty("cps")
  public void setCps(List<String> cps) {
    this.cps = cps;
  }
}
