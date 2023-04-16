package netlas.java.scheme.host;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "related_domains_count",
  "related_domains",
  "dns",
  "whois",
  "related_domains_query",
  "domain",
  "type"
})
public class Host {

  @JsonProperty("related_domains_count")
  private Integer relatedDomainsCount;

  @JsonProperty("related_domains")
  private List<String> relatedDomains = new ArrayList<String>();

  @JsonProperty("dns")
  private Dns dns;

  @JsonProperty("whois")
  private Whois whois;

  @JsonProperty("related_domains_query")
  private String relatedDomainsQuery;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("type")
  private String type;

  @JsonProperty("related_domains_count")
  public Integer getRelatedDomainsCount() {
    return relatedDomainsCount;
  }

  @JsonProperty("related_domains_count")
  public void setRelatedDomainsCount(Integer relatedDomainsCount) {
    this.relatedDomainsCount = relatedDomainsCount;
  }

  @JsonProperty("related_domains")
  public List<String> getRelatedDomains() {
    return relatedDomains;
  }

  @JsonProperty("related_domains")
  public void setRelatedDomains(List<String> relatedDomains) {
    this.relatedDomains = relatedDomains;
  }

  @JsonProperty("dns")
  public Dns getDns() {
    return dns;
  }

  @JsonProperty("dns")
  public void setDns(Dns dns) {
    this.dns = dns;
  }

  @JsonProperty("whois")
  public Whois getWhois() {
    return whois;
  }

  @JsonProperty("whois")
  public void setWhois(Whois whois) {
    this.whois = whois;
  }

  @JsonProperty("related_domains_query")
  public String getRelatedDomainsQuery() {
    return relatedDomainsQuery;
  }

  @JsonProperty("related_domains_query")
  public void setRelatedDomainsQuery(String relatedDomainsQuery) {
    this.relatedDomainsQuery = relatedDomainsQuery;
  }

  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  @JsonProperty("domain")
  public void setDomain(String domain) {
    this.domain = domain;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }
}
