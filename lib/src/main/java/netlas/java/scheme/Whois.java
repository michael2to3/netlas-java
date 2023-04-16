package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"related_nets", "net", "asn"})
public class Whois {

  @JsonProperty("related_nets")
  private List<RelatedNet> relatedNets = new ArrayList<RelatedNet>();

  @JsonProperty("net")
  private Net net;

  @JsonProperty("asn")
  private Asn asn;

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
}
