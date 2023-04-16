package netlas.java.scheme.profile;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "certs",
    "domains",
    "host_ip",
    "whois_ip",
    "responses",
    "host_domain",
    "whois_domains"
})
public class ExcludeFromResults {

    @JsonProperty("certs")
    private List<Object> certs = new ArrayList<Object>();
    @JsonProperty("domains")
    private List<Object> domains = new ArrayList<Object>();
    @JsonProperty("host_ip")
    private List<String> hostIp = new ArrayList<String>();
    @JsonProperty("whois_ip")
    private List<String> whoisIp = new ArrayList<String>();
    @JsonProperty("responses")
    private List<String> responses = new ArrayList<String>();
    @JsonProperty("host_domain")
    private List<String> hostDomain = new ArrayList<String>();
    @JsonProperty("whois_domains")
    private List<String> whoisDomains = new ArrayList<String>();

    @JsonProperty("certs")
    public List<Object> getCerts() {
        return certs;
    }

    @JsonProperty("certs")
    public void setCerts(List<Object> certs) {
        this.certs = certs;
    }

    @JsonProperty("domains")
    public List<Object> getDomains() {
        return domains;
    }

    @JsonProperty("domains")
    public void setDomains(List<Object> domains) {
        this.domains = domains;
    }

    @JsonProperty("host_ip")
    public List<String> getHostIp() {
        return hostIp;
    }

    @JsonProperty("host_ip")
    public void setHostIp(List<String> hostIp) {
        this.hostIp = hostIp;
    }

    @JsonProperty("whois_ip")
    public List<String> getWhoisIp() {
        return whoisIp;
    }

    @JsonProperty("whois_ip")
    public void setWhoisIp(List<String> whoisIp) {
        this.whoisIp = whoisIp;
    }

    @JsonProperty("responses")
    public List<String> getResponses() {
        return responses;
    }

    @JsonProperty("responses")
    public void setResponses(List<String> responses) {
        this.responses = responses;
    }

    @JsonProperty("host_domain")
    public List<String> getHostDomain() {
        return hostDomain;
    }

    @JsonProperty("host_domain")
    public void setHostDomain(List<String> hostDomain) {
        this.hostDomain = hostDomain;
    }

    @JsonProperty("whois_domains")
    public List<String> getWhoisDomains() {
        return whoisDomains;
    }

    @JsonProperty("whois_domains")
    public void setWhoisDomains(List<String> whoisDomains) {
        this.whoisDomains = whoisDomains;
    }

}
