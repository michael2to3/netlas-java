package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dns_names"
})
public class SubjectAltName {

    @JsonProperty("dns_names")
    private List<String> dnsNames = new ArrayList<String>();

    @JsonProperty("dns_names")
    public List<String> getDnsNames() {
        return dnsNames;
    }

    @JsonProperty("dns_names")
    public void setDnsNames(List<String> dnsNames) {
        this.dnsNames = dnsNames;
    }

}
