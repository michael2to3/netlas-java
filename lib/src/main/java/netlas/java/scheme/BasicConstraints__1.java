package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"is_ca"})
public class BasicConstraints__1 {

  @JsonProperty("is_ca")
  private Boolean isCa;

  @JsonProperty("is_ca")
  public Boolean getIsCa() {
    return isCa;
  }

  @JsonProperty("is_ca")
  public void setIsCa(Boolean isCa) {
    this.isCa = isCa;
  }
}
