package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "date",
  "server",
  "set_cookie",
  "content_type",
  "x_content_type_options",
  "content_security_policy",
  "x_xss_protection",
  "location",
  "p3p",
  "alt_svc",
  "content_length",
  "x_frame_options",
  "expires",
  "cache_control",
  "pragma",
  "report_to",
  "strict_transport_security",
  "vary",
  "permissions_policy",
  "cross_origin_resource_policy",
  "accept_ch",
  "referrer_policy",
  "x_robots_tag",
  "origin_trial",
  "x_cache",
  "x_amz_cf_id",
  "x_amz_cf_pop",
  "connection",
  "via",
  "accept_ranges",
  "etag",
  "last_modified",
  "age",
  "x_powered_by",
  "access_control_expose_headers",
  "nel",
  "content_security_policy_report_only",
  "accept_ch_lifetime",
  "cf_cache_status",
  "cf_ray",
  "x_amz_version_id"
})
public class Headers {

  @JsonProperty("date")
  private List<String> date = new ArrayList<String>();

  @JsonProperty("server")
  private List<String> server = new ArrayList<String>();

  @JsonProperty("set_cookie")
  private List<String> setCookie = new ArrayList<String>();

  @JsonProperty("content_type")
  private List<String> contentType = new ArrayList<String>();

  @JsonProperty("x_content_type_options")
  private List<String> xContentTypeOptions = new ArrayList<String>();

  @JsonProperty("content_security_policy")
  private List<String> contentSecurityPolicy = new ArrayList<String>();

  @JsonProperty("x_xss_protection")
  private List<String> xXssProtection = new ArrayList<String>();

  @JsonProperty("location")
  private List<String> location = new ArrayList<String>();

  @JsonProperty("p3p")
  private List<String> p3p = new ArrayList<String>();

  @JsonProperty("alt_svc")
  private List<String> altSvc = new ArrayList<String>();

  @JsonProperty("content_length")
  private List<String> contentLength = new ArrayList<String>();

  @JsonProperty("x_frame_options")
  private List<String> xFrameOptions = new ArrayList<String>();

  @JsonProperty("expires")
  private List<String> expires = new ArrayList<String>();

  @JsonProperty("cache_control")
  private List<String> cacheControl = new ArrayList<String>();

  @JsonProperty("pragma")
  private List<String> pragma = new ArrayList<String>();

  @JsonProperty("report_to")
  private List<String> reportTo = new ArrayList<String>();

  @JsonProperty("strict_transport_security")
  private List<String> strictTransportSecurity = new ArrayList<String>();

  @JsonProperty("vary")
  private List<String> vary = new ArrayList<String>();

  @JsonProperty("permissions_policy")
  private List<String> permissionsPolicy = new ArrayList<String>();

  @JsonProperty("cross_origin_resource_policy")
  private List<String> crossOriginResourcePolicy = new ArrayList<String>();

  @JsonProperty("accept_ch")
  private List<String> acceptCh = new ArrayList<String>();

  @JsonProperty("referrer_policy")
  private List<String> referrerPolicy = new ArrayList<String>();

  @JsonProperty("x_robots_tag")
  private List<String> xRobotsTag = new ArrayList<String>();

  @JsonProperty("origin_trial")
  private List<String> originTrial = new ArrayList<String>();

  @JsonProperty("x_cache")
  private List<String> xCache = new ArrayList<String>();

  @JsonProperty("x_amz_cf_id")
  private List<String> xAmzCfId = new ArrayList<String>();

  @JsonProperty("x_amz_cf_pop")
  private List<String> xAmzCfPop = new ArrayList<String>();

  @JsonProperty("connection")
  private List<String> connection = new ArrayList<String>();

  @JsonProperty("via")
  private List<String> via = new ArrayList<String>();

  @JsonProperty("accept_ranges")
  private List<String> acceptRanges = new ArrayList<String>();

  @JsonProperty("etag")
  private List<String> etag = new ArrayList<String>();

  @JsonProperty("last_modified")
  private List<String> lastModified = new ArrayList<String>();

  @JsonProperty("age")
  private List<String> age = new ArrayList<String>();

  @JsonProperty("x_powered_by")
  private List<String> xPoweredBy = new ArrayList<String>();

  @JsonProperty("access_control_expose_headers")
  private List<String> accessControlExposeHeaders = new ArrayList<String>();

  @JsonProperty("nel")
  private List<String> nel = new ArrayList<String>();

  @JsonProperty("content_security_policy_report_only")
  private List<String> contentSecurityPolicyReportOnly = new ArrayList<String>();

  @JsonProperty("accept_ch_lifetime")
  private List<String> acceptChLifetime = new ArrayList<String>();

  @JsonProperty("cf_cache_status")
  private List<String> cfCacheStatus = new ArrayList<String>();

  @JsonProperty("cf_ray")
  private List<String> cfRay = new ArrayList<String>();

  @JsonProperty("x_amz_version_id")
  private List<String> xAmzVersionId = new ArrayList<String>();

  @JsonProperty("date")
  public List<String> getDate() {
    return date;
  }

  @JsonProperty("date")
  public void setDate(List<String> date) {
    this.date = date;
  }

  @JsonProperty("server")
  public List<String> getServer() {
    return server;
  }

  @JsonProperty("server")
  public void setServer(List<String> server) {
    this.server = server;
  }

  @JsonProperty("set_cookie")
  public List<String> getSetCookie() {
    return setCookie;
  }

  @JsonProperty("set_cookie")
  public void setSetCookie(List<String> setCookie) {
    this.setCookie = setCookie;
  }

  @JsonProperty("content_type")
  public List<String> getContentType() {
    return contentType;
  }

  @JsonProperty("content_type")
  public void setContentType(List<String> contentType) {
    this.contentType = contentType;
  }

  @JsonProperty("x_content_type_options")
  public List<String> getxContentTypeOptions() {
    return xContentTypeOptions;
  }

  @JsonProperty("x_content_type_options")
  public void setxContentTypeOptions(List<String> xContentTypeOptions) {
    this.xContentTypeOptions = xContentTypeOptions;
  }

  @JsonProperty("content_security_policy")
  public List<String> getContentSecurityPolicy() {
    return contentSecurityPolicy;
  }

  @JsonProperty("content_security_policy")
  public void setContentSecurityPolicy(List<String> contentSecurityPolicy) {
    this.contentSecurityPolicy = contentSecurityPolicy;
  }

  @JsonProperty("x_xss_protection")
  public List<String> getxXssProtection() {
    return xXssProtection;
  }

  @JsonProperty("x_xss_protection")
  public void setxXssProtection(List<String> xXssProtection) {
    this.xXssProtection = xXssProtection;
  }

  @JsonProperty("location")
  public List<String> getLocation() {
    return location;
  }

  @JsonProperty("location")
  public void setLocation(List<String> location) {
    this.location = location;
  }

  @JsonProperty("p3p")
  public List<String> getP3p() {
    return p3p;
  }

  @JsonProperty("p3p")
  public void setP3p(List<String> p3p) {
    this.p3p = p3p;
  }

  @JsonProperty("alt_svc")
  public List<String> getAltSvc() {
    return altSvc;
  }

  @JsonProperty("alt_svc")
  public void setAltSvc(List<String> altSvc) {
    this.altSvc = altSvc;
  }

  @JsonProperty("content_length")
  public List<String> getContentLength() {
    return contentLength;
  }

  @JsonProperty("content_length")
  public void setContentLength(List<String> contentLength) {
    this.contentLength = contentLength;
  }

  @JsonProperty("x_frame_options")
  public List<String> getxFrameOptions() {
    return xFrameOptions;
  }

  @JsonProperty("x_frame_options")
  public void setxFrameOptions(List<String> xFrameOptions) {
    this.xFrameOptions = xFrameOptions;
  }

  @JsonProperty("expires")
  public List<String> getExpires() {
    return expires;
  }

  @JsonProperty("expires")
  public void setExpires(List<String> expires) {
    this.expires = expires;
  }

  @JsonProperty("cache_control")
  public List<String> getCacheControl() {
    return cacheControl;
  }

  @JsonProperty("cache_control")
  public void setCacheControl(List<String> cacheControl) {
    this.cacheControl = cacheControl;
  }

  @JsonProperty("pragma")
  public List<String> getPragma() {
    return pragma;
  }

  @JsonProperty("pragma")
  public void setPragma(List<String> pragma) {
    this.pragma = pragma;
  }

  @JsonProperty("report_to")
  public List<String> getReportTo() {
    return reportTo;
  }

  @JsonProperty("report_to")
  public void setReportTo(List<String> reportTo) {
    this.reportTo = reportTo;
  }

  @JsonProperty("strict_transport_security")
  public List<String> getStrictTransportSecurity() {
    return strictTransportSecurity;
  }

  @JsonProperty("strict_transport_security")
  public void setStrictTransportSecurity(List<String> strictTransportSecurity) {
    this.strictTransportSecurity = strictTransportSecurity;
  }

  @JsonProperty("vary")
  public List<String> getVary() {
    return vary;
  }

  @JsonProperty("vary")
  public void setVary(List<String> vary) {
    this.vary = vary;
  }

  @JsonProperty("permissions_policy")
  public List<String> getPermissionsPolicy() {
    return permissionsPolicy;
  }

  @JsonProperty("permissions_policy")
  public void setPermissionsPolicy(List<String> permissionsPolicy) {
    this.permissionsPolicy = permissionsPolicy;
  }

  @JsonProperty("cross_origin_resource_policy")
  public List<String> getCrossOriginResourcePolicy() {
    return crossOriginResourcePolicy;
  }

  @JsonProperty("cross_origin_resource_policy")
  public void setCrossOriginResourcePolicy(List<String> crossOriginResourcePolicy) {
    this.crossOriginResourcePolicy = crossOriginResourcePolicy;
  }

  @JsonProperty("accept_ch")
  public List<String> getAcceptCh() {
    return acceptCh;
  }

  @JsonProperty("accept_ch")
  public void setAcceptCh(List<String> acceptCh) {
    this.acceptCh = acceptCh;
  }

  @JsonProperty("referrer_policy")
  public List<String> getReferrerPolicy() {
    return referrerPolicy;
  }

  @JsonProperty("referrer_policy")
  public void setReferrerPolicy(List<String> referrerPolicy) {
    this.referrerPolicy = referrerPolicy;
  }

  @JsonProperty("x_robots_tag")
  public List<String> getxRobotsTag() {
    return xRobotsTag;
  }

  @JsonProperty("x_robots_tag")
  public void setxRobotsTag(List<String> xRobotsTag) {
    this.xRobotsTag = xRobotsTag;
  }

  @JsonProperty("origin_trial")
  public List<String> getOriginTrial() {
    return originTrial;
  }

  @JsonProperty("origin_trial")
  public void setOriginTrial(List<String> originTrial) {
    this.originTrial = originTrial;
  }

  @JsonProperty("x_cache")
  public List<String> getxCache() {
    return xCache;
  }

  @JsonProperty("x_cache")
  public void setxCache(List<String> xCache) {
    this.xCache = xCache;
  }

  @JsonProperty("x_amz_cf_id")
  public List<String> getxAmzCfId() {
    return xAmzCfId;
  }

  @JsonProperty("x_amz_cf_id")
  public void setxAmzCfId(List<String> xAmzCfId) {
    this.xAmzCfId = xAmzCfId;
  }

  @JsonProperty("x_amz_cf_pop")
  public List<String> getxAmzCfPop() {
    return xAmzCfPop;
  }

  @JsonProperty("x_amz_cf_pop")
  public void setxAmzCfPop(List<String> xAmzCfPop) {
    this.xAmzCfPop = xAmzCfPop;
  }

  @JsonProperty("connection")
  public List<String> getConnection() {
    return connection;
  }

  @JsonProperty("connection")
  public void setConnection(List<String> connection) {
    this.connection = connection;
  }

  @JsonProperty("via")
  public List<String> getVia() {
    return via;
  }

  @JsonProperty("via")
  public void setVia(List<String> via) {
    this.via = via;
  }

  @JsonProperty("accept_ranges")
  public List<String> getAcceptRanges() {
    return acceptRanges;
  }

  @JsonProperty("accept_ranges")
  public void setAcceptRanges(List<String> acceptRanges) {
    this.acceptRanges = acceptRanges;
  }

  @JsonProperty("etag")
  public List<String> getEtag() {
    return etag;
  }

  @JsonProperty("etag")
  public void setEtag(List<String> etag) {
    this.etag = etag;
  }

  @JsonProperty("last_modified")
  public List<String> getLastModified() {
    return lastModified;
  }

  @JsonProperty("last_modified")
  public void setLastModified(List<String> lastModified) {
    this.lastModified = lastModified;
  }

  @JsonProperty("age")
  public List<String> getAge() {
    return age;
  }

  @JsonProperty("age")
  public void setAge(List<String> age) {
    this.age = age;
  }

  @JsonProperty("x_powered_by")
  public List<String> getxPoweredBy() {
    return xPoweredBy;
  }

  @JsonProperty("x_powered_by")
  public void setxPoweredBy(List<String> xPoweredBy) {
    this.xPoweredBy = xPoweredBy;
  }

  @JsonProperty("access_control_expose_headers")
  public List<String> getAccessControlExposeHeaders() {
    return accessControlExposeHeaders;
  }

  @JsonProperty("access_control_expose_headers")
  public void setAccessControlExposeHeaders(List<String> accessControlExposeHeaders) {
    this.accessControlExposeHeaders = accessControlExposeHeaders;
  }

  @JsonProperty("nel")
  public List<String> getNel() {
    return nel;
  }

  @JsonProperty("nel")
  public void setNel(List<String> nel) {
    this.nel = nel;
  }

  @JsonProperty("content_security_policy_report_only")
  public List<String> getContentSecurityPolicyReportOnly() {
    return contentSecurityPolicyReportOnly;
  }

  @JsonProperty("content_security_policy_report_only")
  public void setContentSecurityPolicyReportOnly(List<String> contentSecurityPolicyReportOnly) {
    this.contentSecurityPolicyReportOnly = contentSecurityPolicyReportOnly;
  }

  @JsonProperty("accept_ch_lifetime")
  public List<String> getAcceptChLifetime() {
    return acceptChLifetime;
  }

  @JsonProperty("accept_ch_lifetime")
  public void setAcceptChLifetime(List<String> acceptChLifetime) {
    this.acceptChLifetime = acceptChLifetime;
  }

  @JsonProperty("cf_cache_status")
  public List<String> getCfCacheStatus() {
    return cfCacheStatus;
  }

  @JsonProperty("cf_cache_status")
  public void setCfCacheStatus(List<String> cfCacheStatus) {
    this.cfCacheStatus = cfCacheStatus;
  }

  @JsonProperty("cf_ray")
  public List<String> getCfRay() {
    return cfRay;
  }

  @JsonProperty("cf_ray")
  public void setCfRay(List<String> cfRay) {
    this.cfRay = cfRay;
  }

  @JsonProperty("x_amz_version_id")
  public List<String> getxAmzVersionId() {
    return xAmzVersionId;
  }

  @JsonProperty("x_amz_version_id")
  public void setxAmzVersionId(List<String> xAmzVersionId) {
    this.xAmzVersionId = xAmzVersionId;
  }
}
