package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Issuer {

  @JsonProperty("country")
  private List<String> country = new ArrayList<String>();

  @JsonProperty("organization")
  private List<String> organization = new ArrayList<String>();

  @JsonProperty("common_name")
  private List<String> commonName = new ArrayList<String>();

  @JsonProperty("organizational_unit")
  private List<String> organizationalUnit = new ArrayList<String>();

  @JsonProperty("province")
  private List<String> province = new ArrayList<String>();

  @JsonProperty("locality")
  private List<String> locality = new ArrayList<String>();

  @JsonProperty("serial_number")
  private List<String> serialNumber = new ArrayList<String>();

  @JsonProperty("email_address")
  private List<String> emailAddress = new ArrayList<String>();

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

  @JsonProperty("organizational_unit")
  public List<String> getOrganizationalUnit() {
    return organizationalUnit;
  }

  @JsonProperty("organizational_unit")
  public void setOrganizationalUnit(List<String> organizationalUnit) {
    this.organizationalUnit = organizationalUnit;
  }

  @JsonProperty("province")
  public List<String> getProvince() {
    return province;
  }

  @JsonProperty("province")
  public void setProvince(List<String> province) {
    this.province = province;
  }

  @JsonProperty("locality")
  public List<String> getLocality() {
    return locality;
  }

  @JsonProperty("locality")
  public void setLocality(List<String> locality) {
    this.locality = locality;
  }

  @JsonProperty("serial_number")
  public List<String> getSerialNumber() {
    return serialNumber;
  }

  @JsonProperty("serial_number")
  public void setSerialNumber(List<String> serialNumber) {
    this.serialNumber = serialNumber;
  }

  @JsonProperty("email_address")
  public List<String> getEmailAddress() {
    return emailAddress;
  }

  @JsonProperty("email_address")
  public void setEmailAddress(List<String> emailAddress) {
    this.emailAddress = emailAddress;
  }
}
