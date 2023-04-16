package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"country", "number", "registry", "name", "cidr", "updated"})
public class Asn {

  @JsonProperty("country")
  private String country;

  @JsonProperty("number")
  private List<String> number = new ArrayList<String>();

  @JsonProperty("registry")
  private String registry;

  @JsonProperty("name")
  private String name;

  @JsonProperty("cidr")
  private String cidr;

  @JsonProperty("updated")
  private String updated;

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("number")
  public List<String> getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(List<String> number) {
    this.number = number;
  }

  @JsonProperty("registry")
  public String getRegistry() {
    return registry;
  }

  @JsonProperty("registry")
  public void setRegistry(String registry) {
    this.registry = registry;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("cidr")
  public String getCidr() {
    return cidr;
  }

  @JsonProperty("cidr")
  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }

  @JsonProperty("updated")
  public void setUpdated(String updated) {
    this.updated = updated;
  }
}
