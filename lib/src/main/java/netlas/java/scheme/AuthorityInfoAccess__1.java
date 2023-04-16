package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"issuer_urls", "ocsp_urls"})
public class AuthorityInfoAccess__1 {

  @JsonProperty("issuer_urls")
  private List<String> issuerUrls = new ArrayList<String>();

  @JsonProperty("ocsp_urls")
  private List<String> ocspUrls = new ArrayList<String>();

  @JsonProperty("issuer_urls")
  public List<String> getIssuerUrls() {
    return issuerUrls;
  }

  @JsonProperty("issuer_urls")
  public void setIssuerUrls(List<String> issuerUrls) {
    this.issuerUrls = issuerUrls;
  }

  @JsonProperty("ocsp_urls")
  public List<String> getOcspUrls() {
    return ocspUrls;
  }

  @JsonProperty("ocsp_urls")
  public void setOcspUrls(List<String> ocspUrls) {
    this.ocspUrls = ocspUrls;
  }
}
