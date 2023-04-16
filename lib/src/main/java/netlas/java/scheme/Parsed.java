package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"value", "algorithm"})
public class Parsed {

  @JsonProperty("value")
  private String value;

  @JsonProperty("algorithm")
  private String algorithm;

  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(String value) {
    this.value = value;
  }

  @JsonProperty("algorithm")
  public String getAlgorithm() {
    return algorithm;
  }

  @JsonProperty("algorithm")
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }
}
