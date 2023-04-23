package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemGeneric<T> {

  @JsonProperty("highlight")
  private Highlight highlight;

  @JsonProperty("data")
  private T data;

  @JsonProperty("highlight")
  public Highlight getHighlight() {
    return highlight;
  }

  @JsonProperty("highlight")
  public void setHighlight(Highlight highlight) {
    this.highlight = highlight;
  }

  @JsonProperty("data")
  public T getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(T data) {
    this.data = data;
  }
}
