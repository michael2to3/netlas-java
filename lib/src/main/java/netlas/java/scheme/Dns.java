package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dns {

  @JsonProperty("a")
  private List<String> a = new ArrayList<String>();

  @JsonProperty("txt")
  private List<String> txt = new ArrayList<String>();

  @JsonProperty("level")
  private Integer level;

  @JsonProperty("ns")
  private List<String> ns = new ArrayList<String>();

  @JsonProperty("zone")
  private String zone;

  @JsonProperty("nsid")
  private String nsid;

  @JsonProperty("id_server")
  private String idServer;

  @JsonProperty("last_updated")
  private String lastUpdated;

  @JsonProperty("@timestamp")
  private String timestamp;

  @JsonProperty("domain")
  private String domain;

  @JsonProperty("mx")
  private List<String> mx = new ArrayList<String>();

  @JsonProperty("cname")
  private List<String> cname = new ArrayList<String>();

  @JsonProperty("a")
  public List<String> getA() {
    return a;
  }

  @JsonProperty("a")
  public void setA(List<String> a) {
    this.a = a;
  }

  @JsonProperty("txt")
  public List<String> getTxt() {
    return txt;
  }

  @JsonProperty("txt")
  public void setTxt(List<String> txt) {
    this.txt = txt;
  }

  @JsonProperty("level")
  public Integer getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(Integer level) {
    this.level = level;
  }

  @JsonProperty("ns")
  public List<String> getNs() {
    return ns;
  }

  @JsonProperty("ns")
  public void setNs(List<String> ns) {
    this.ns = ns;
  }

  @JsonProperty("zone")
  public String getZone() {
    return zone;
  }

  @JsonProperty("zone")
  public void setZone(String zone) {
    this.zone = zone;
  }

  @JsonProperty("nsid")
  public String getNsid() {
    return nsid;
  }

  @JsonProperty("nsid")
  public void setNsid(String nsid) {
    this.nsid = nsid;
  }

  @JsonProperty("id_server")
  public String getIdServer() {
    return idServer;
  }

  @JsonProperty("last_updated")
  public String getLastUpdate() {
    return lastUpdated;
  }

  @JsonProperty("last_updated")
  public void setLastUpdate(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @JsonProperty("@timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  @JsonProperty("@timestamp")
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }

  @JsonProperty("domain")
  public void setDomain(String domain) {
    this.domain = domain;
  }

  @JsonProperty("mx")
  public List<String> getMx() {
    return mx;
  }

  @JsonProperty("mx")
  public void setMx(List<String> mx) {
    this.mx = mx;
  }

  @JsonProperty("cname")
  public List<String> getCname() {
    return cname;
  }

  @JsonProperty("cname")
  public void setCname(List<String> cname) {
    this.cname = cname;
  }
}
