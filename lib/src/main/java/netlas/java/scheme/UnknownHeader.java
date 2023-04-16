package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"value", "key"})
public class UnknownHeader {

  @JsonProperty("value")
  private List<String> value = new ArrayList<String>();

  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  public List<String> getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(List<String> value) {
    this.value = value;
  }

  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(String key) {
    this.key = key;
  }
}
