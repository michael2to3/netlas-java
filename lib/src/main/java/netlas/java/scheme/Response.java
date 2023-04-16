package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"items", "took", "timestamp"})
public class Response {

  @JsonProperty("items")
  private List<Item> items = new ArrayList<Item>();

  @JsonProperty("took")
  private Integer took;

  @JsonProperty("timestamp")
  private Integer timestamp;

  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<Item> items) {
    this.items = items;
  }

  @JsonProperty("took")
  public Integer getTook() {
    return took;
  }

  @JsonProperty("took")
  public void setTook(Integer took) {
    this.took = took;
  }

  @JsonProperty("timestamp")
  public Integer getTimestamp() {
    return timestamp;
  }

  @JsonProperty("timestamp")
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }
}
