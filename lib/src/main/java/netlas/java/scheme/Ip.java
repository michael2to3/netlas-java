package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ip {
  @JsonProperty("gte")
  private String gte;

  @JsonProperty("lte")
  private String lte;

  public String getGte() {
    return gte;
  }

  public void setGte(String gte) {
    this.gte = gte;
  }

  public String getLte() {
    return lte;
  }

  public void setLte(String lte) {
    this.lte = lte;
  }
}
