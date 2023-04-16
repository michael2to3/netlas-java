package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"highlight", "data"})
public class Item {

  @JsonProperty("highlight")
  private Highlight highlight;

  @JsonProperty("data")
  private Data data;

  @JsonProperty("highlight")
  public Highlight getHighlight() {
    return highlight;
  }

  @JsonProperty("highlight")
  public void setHighlight(Highlight highlight) {
    this.highlight = highlight;
  }

  @JsonProperty("data")
  public Data getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(Data data) {
    this.data = data;
  }
}
