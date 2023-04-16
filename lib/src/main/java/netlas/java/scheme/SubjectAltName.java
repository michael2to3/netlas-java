package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"dns_names", "ip_addresses"})
public class SubjectAltName {

  @JsonProperty("dns_names")
  private List<String> dnsNames = new ArrayList<String>();

  @JsonProperty("ip_addresses")
  private List<String> ipAddresses = new ArrayList<String>();

  @JsonProperty("dns_names")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  @JsonProperty("dns_names")
  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }

  @JsonProperty("ip_addresses")
  public List<String> getIpAddresses() {
    return ipAddresses;
  }

  @JsonProperty("ip_addresses")
  public void setIpAddresses(List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
  }
}
