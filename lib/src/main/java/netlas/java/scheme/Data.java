package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "referer",
  "iteration",
  "ip",
  "cve",
  "port",
  "tag",
  "domain",
  "host",
  "prot7",
  "@timestamp",
  "prot4",
  "http",
  "protocol",
  "target",
  "last_updated",
  "ssh",
  "jarm",
  "whois",
  "certificate",
  "geo",
  "host_type",
  "path",
  "scan_date",
  "ptr",
  "uri",
  "isp"
})
public class Data {

  @JsonProperty("last_updated")
  private String lastUpdated;

  @JsonProperty("jarm")
  private String jarm;

  @JsonProperty("isp")
  private String isp;

  @JsonProperty("ip")
  private String ip;

  @JsonProperty("certificate")
  private Certificate certificate;

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("host_type")
  private String hostType;

  @JsonProperty("prot7")
  private String prot7;

  @JsonProperty("target")
  private Target target;

  @JsonProperty("ptr")
  private List<String> ptr = new ArrayList<String>();

  @JsonProperty("geo")
  private Geo geo;

  @JsonProperty("path")
  private String path;

  @JsonProperty("protocol")
  private String protocol;

  @JsonProperty("prot4")
  private String prot4;

  @JsonProperty("@timestamp")
  private String timestamp;

  @JsonProperty("whois")
  private Whois whois;

  @JsonProperty("port")
  private Integer port;

  @JsonProperty("host")
  private String host;

  @JsonProperty("iteration")
  private String iteration;

  @JsonProperty("http")
  private Http http;

  @JsonProperty("tag")
  private List<Tag> tag = new ArrayList<Tag>();

  @JsonProperty("scan_date")
  private String scanDate;

  @JsonProperty("ssh")
  private Ssh ssh;

  @JsonProperty("cve")
  private List<Cve> cve = new ArrayList<Cve>();

  @JsonProperty("domain")
  private List<String> domain = new ArrayList<String>();

  @JsonProperty("referer")
  private List<String> referer = new ArrayList<String>();

  @JsonProperty("last_updated")
  public String getLastUpdated() {
    return lastUpdated;
  }

  @JsonProperty("domain")
  public void setDomain(List<String> domain) {
    this.domain = domain;
  }

  @JsonProperty("domain")
  public List<String> getDomain() {
    return domain;
  }

  @JsonProperty("referer")
  public List<String> getReferer() {
    return referer;
  }

  @JsonProperty("referer")
  public void setReferer(List<String> referer) {
    this.referer = referer;
  }

  @JsonProperty("last_updated")
  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  @JsonProperty("jarm")
  public String getJarm() {
    return jarm;
  }

  @JsonProperty("jarm")
  public void setJarm(String jarm) {
    this.jarm = jarm;
  }

  @JsonProperty("isp")
  public String getIsp() {
    return isp;
  }

  @JsonProperty("isp")
  public void setIsp(String isp) {
    this.isp = isp;
  }

  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  @JsonProperty("ip")
  public void setIp(String ip) {
    this.ip = ip;
  }

  @JsonProperty("certificate")
  public Certificate getCertificate() {
    return certificate;
  }

  @JsonProperty("certificate")
  public void setCertificate(Certificate certificate) {
    this.certificate = certificate;
  }

  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  @JsonProperty("uri")
  public void setUri(String uri) {
    this.uri = uri;
  }

  @JsonProperty("host_type")
  public String getHostType() {
    return hostType;
  }

  @JsonProperty("host_type")
  public void setHostType(String hostType) {
    this.hostType = hostType;
  }

  @JsonProperty("prot7")
  public String getProt7() {
    return prot7;
  }

  @JsonProperty("prot7")
  public void setProt7(String prot7) {
    this.prot7 = prot7;
  }

  @JsonProperty("target")
  public Target getTarget() {
    return target;
  }

  @JsonProperty("target")
  public void setTarget(Target target) {
    this.target = target;
  }

  @JsonProperty("ptr")
  public List<String> getPtr() {
    return ptr;
  }

  @JsonProperty("ptr")
  public void setPtr(List<String> ptr) {
    this.ptr = ptr;
  }

  @JsonProperty("geo")
  public Geo getGeo() {
    return geo;
  }

  @JsonProperty("geo")
  public void setGeo(Geo geo) {
    this.geo = geo;
  }

  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(String path) {
    this.path = path;
  }

  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }

  @JsonProperty("protocol")
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  @JsonProperty("prot4")
  public String getProt4() {
    return prot4;
  }

  @JsonProperty("prot4")
  public void setProt4(String prot4) {
    this.prot4 = prot4;
  }

  @JsonProperty("@timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  @JsonProperty("@timestamp")
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @JsonProperty("whois")
  public Whois getWhois() {
    return whois;
  }

  @JsonProperty("whois")
  public void setWhois(Whois whois) {
    this.whois = whois;
  }

  @JsonProperty("port")
  public Integer getPort() {
    return port;
  }

  @JsonProperty("port")
  public void setPort(Integer port) {
    this.port = port;
  }

  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  @JsonProperty("host")
  public void setHost(String host) {
    this.host = host;
  }

  @JsonProperty("iteration")
  public String getIteration() {
    return iteration;
  }

  @JsonProperty("iteration")
  public void setIteration(String iteration) {
    this.iteration = iteration;
  }

  @JsonProperty("http")
  public Http getHttp() {
    return http;
  }

  @JsonProperty("http")
  public void setHttp(Http http) {
    this.http = http;
  }

  @JsonProperty("tag")
  public List<Tag> getTag() {
    return tag;
  }

  @JsonProperty("tag")
  public void setTag(List<Tag> tag) {
    this.tag = tag;
  }

  @JsonProperty("scan_date")
  public String getScanDate() {
    return scanDate;
  }

  @JsonProperty("scan_date")
  public void setScanDate(String scanDate) {
    this.scanDate = scanDate;
  }

  @JsonProperty("ssh")
  public Ssh getSsh() {
    return ssh;
  }

  @JsonProperty("ssh")
  public void setSsh(Ssh ssh) {
    this.ssh = ssh;
  }

  @JsonProperty("cve")
  public List<Cve> getCve() {
    return cve;
  }

  @JsonProperty("cve")
  public void setCve(List<Cve> cve) {
    this.cve = cve;
  }
}
