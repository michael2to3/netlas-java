package netlas.java.scheme.host;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"country", "province", "city", "street", "organization", "name", "postal_code"})
public class Registrant {

  @JsonProperty("country")
  private String country;

  @JsonProperty("province")
  private String province;

  @JsonProperty("city")
  private String city;

  @JsonProperty("street")
  private String street;

  @JsonProperty("organization")
  private String organization;

  @JsonProperty("name")
  private String name;

  @JsonProperty("postal_code")
  private String postalCode;

  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country) {
    this.country = country;
  }

  @JsonProperty("province")
  public String getProvince() {
    return province;
  }

  @JsonProperty("province")
  public void setProvince(String province) {
    this.province = province;
  }

  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  @JsonProperty("street")
  public void setStreet(String street) {
    this.street = street;
  }

  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }

  @JsonProperty("organization")
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("postal_code")
  public String getPostalCode() {
    return postalCode;
  }

  @JsonProperty("postal_code")
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }
}
