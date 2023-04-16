package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"issuer_urls"})
public class AuthorityInfoAccess {

  @JsonProperty("issuer_urls")
  private List<String> issuerUrls = new ArrayList<String>();

  @JsonProperty("issuer_urls")
  public List<String> getIssuerUrls() {
    return issuerUrls;
  }

  @JsonProperty("issuer_urls")
  public void setIssuerUrls(List<String> issuerUrls) {
    this.issuerUrls = issuerUrls;
  }
}
