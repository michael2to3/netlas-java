package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"key", "key_as_string", "doc_count"})
public class Aggregation {

  @JsonProperty("key")
  private List<String> key = new ArrayList<String>();

  @JsonProperty("key_as_string")
  private String keyAsString;

  @JsonProperty("doc_count")
  private Integer docCount;

  @JsonProperty("key")
  public List<String> getKey() {
    return key;
  }

  @JsonProperty("key")
  public void setKey(List<String> key) {
    this.key = key;
  }

  @JsonProperty("key_as_string")
  public String getKeyAsString() {
    return keyAsString;
  }

  @JsonProperty("key_as_string")
  public void setKeyAsString(String keyAsString) {
    this.keyAsString = keyAsString;
  }

  @JsonProperty("doc_count")
  public Integer getDocCount() {
    return docCount;
  }

  @JsonProperty("doc_count")
  public void setDocCount(Integer docCount) {
    this.docCount = docCount;
  }
}
