package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Whois {

  @JsonProperty("related_nets")
  private List<RelatedNet> relatedNets = new ArrayList<RelatedNet>();

  @JsonProperty("net")
  private Net net;

  @JsonProperty("asn")
  private Asn asn;

  @JsonProperty("server")
  private String server;

  @JsonProperty("extension")
  private String extension;

  @JsonProperty("last_updated")
  private String lastUpdated;

  @JsonProperty("registrar")
  private Registrar registrar;

  @JsonProperty("technical")
  private Technical technical;

  @JsonProperty("whois_server")
  private String whoisServer;

  @JsonProperty("level")
  private Integer level;

  @JsonProperty("name_servers")
  private List<String> nameServers = new ArrayList<String>();

  @JsonProperty("expiration_date")
  private String expirationDate;

  @JsonProperty("punycode")
  private String punycode;

  @JsonProperty("zone")
  private String zone;

  @JsonProperty("stats")
  private Stats stats;

  @JsonProperty("administrative")
  private Administrative administrative;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  @JsonProperty("created_date")
  private String createdDate;

  @JsonProperty("registrant")
  private Registrant registrant;

  @JsonProperty("updated_date")
  private String updatedDate;

  @JsonProperty("extracted_domain")
  private String extractedDomain;

  @JsonProperty("status")
  private List<String> status = new ArrayList<String>();

  @JsonProperty("@timestamp")
  private String timestamp;

  @JsonProperty("ip")
  private Ip ip;

  @JsonProperty("dnssec")
  private Boolean dnssec;

  @JsonProperty("billing")
  private Billing billing;

  @JsonProperty("server")
  public String getServer() {
    return server;
  }

  @JsonProperty("server")
  public void setServer(String server) {
    this.server = server;
  }

  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }

  @JsonProperty("extension")
  public void setExtension(String extension) {
    this.extension = extension;
  }

  @JsonProperty("last_updated")
  public String getLastUpdated() {
    return lastUpdated;
  }

  @JsonProperty("last_updated")
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @JsonProperty("registrar")
  public Registrar getRegistrar() {
    return registrar;
  }

  @JsonProperty("registrar")
  public void setRegistrar(Registrar registrar) {
    this.registrar = registrar;
  }

  @JsonProperty("technical")
  public Technical getTechnical() {
    return technical;
  }

  @JsonProperty("technical")
  public void setTechnical(Technical technical) {
    this.technical = technical;
  }

  @JsonProperty("whois_server")
  public String getWhoisServer() {
    return whoisServer;
  }

  @JsonProperty("whois_server")
  public void setWhoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
  }

  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(Integer level) {
    this.level = level;
  }

  @JsonProperty("name_servers")
  public List<String> getNameServers() {
    return nameServers;
  }

  @JsonProperty("name_servers")
  public void setNameServers(List<String> nameServers) {
    this.nameServers = nameServers;
  }

  @JsonProperty("expiration_date")
  public String getExpirationDate() {
    return expirationDate;
  }

  @JsonProperty("expiration_date")
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  @JsonProperty("punycode")
  public String getPunycode() {
    return punycode;
  }

  @JsonProperty("punycode")
  public void setPunycode(String punycode) {
    this.punycode = punycode;
  }

  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }

  @JsonProperty("zone")
  public void setZone(String zone) {
    this.zone = zone;
  }

  @JsonProperty("stats")
  public Stats getStats() {
    return stats;
  }

  @JsonProperty("stats")
  public void setStats(Stats stats) {
    this.stats = stats;
  }

  @JsonProperty("administrative")
  public Administrative getAdministrative() {
    return administrative;
  }

  @JsonProperty("administrative")
  public void setAdministrative(Administrative administrative) {
    this.administrative = administrative;
  }

  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  @JsonProperty("domain")
  public void setDomain(String domain) {
    this.domain = domain;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  @JsonProperty("created_date")
  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  @JsonProperty("registrant")
  public Registrant getRegistrant() {
    return registrant;
  }

  @JsonProperty("registrant")
  public void setRegistrant(Registrant registrant) {
    this.registrant = registrant;
  }

  @JsonProperty("updated_date")
  public String getUpdatedDate() {
    return updatedDate;
  }

  @JsonProperty("updated_date")
  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }

  @JsonProperty("extracted_domain")
  public String getExtractedDomain() {
    return extractedDomain;
  }

  @JsonProperty("extracted_domain")
  public void setExtractedDomain(String extractedDomain) {
    this.extractedDomain = extractedDomain;
  }

  @JsonProperty("status")
  public List<String> getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(List<String> status) {
    this.status = status;
  }

  @JsonProperty("related_nets")
  public List<RelatedNet> getRelatedNets() {
    return relatedNets;
  }

  @JsonProperty("related_nets")
  public void setRelatedNets(List<RelatedNet> relatedNets) {
    this.relatedNets = relatedNets;
  }

  @JsonProperty("net")
  public Net getNet() {
    return net;
  }

  @JsonProperty("net")
  public void setNet(Net net) {
    this.net = net;
  }

  @JsonProperty("asn")
  public Asn getAsn() {
    return asn;
  }

  @JsonProperty("asn")
  public void setAsn(Asn asn) {
    this.asn = asn;
  }

  @JsonProperty("@timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  @JsonProperty("@timestamp")
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @JsonProperty("ip")
  public Ip getIp() {
    return ip;
  }

  @JsonProperty("ip")
  public void setIp(Ip ip) {
    this.ip = ip;
  }

  @JsonProperty("dnssec")
  public Boolean getDnssec() {
    return dnssec;
  }

  @JsonProperty("dnssec")
  public void setDnssec(Boolean dnssec) {
    this.dnssec = dnssec;
  }

  @JsonProperty("billing")
  public Billing getBilling() {
    return billing;
  }

  @JsonProperty("billing")
  public void setBilling(Billing billing) {
    this.billing = billing;
  }
}
