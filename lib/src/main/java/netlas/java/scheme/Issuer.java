package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"country", "organization", "common_name"})
public class Issuer {

  @JsonProperty("country")
  private List<String> country = new ArrayList<String>();

  @JsonProperty("organization")
  private List<String> organization = new ArrayList<String>();

  @JsonProperty("common_name")
  private List<String> commonName = new ArrayList<String>();

  @JsonProperty("country")
  public List<String> getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(List<String> country) {
    this.country = country;
  }

  @JsonProperty("organization")
  public List<String> getOrganization() {
    return organization;
  }

  @JsonProperty("organization")
  public void setOrganization(List<String> organization) {
    this.organization = organization;
  }

  @JsonProperty("common_name")
  public List<String> getCommonName() {
    return commonName;
  }

  @JsonProperty("common_name")
  public void setCommonName(List<String> commonName) {
    this.commonName = commonName;
  }
}
