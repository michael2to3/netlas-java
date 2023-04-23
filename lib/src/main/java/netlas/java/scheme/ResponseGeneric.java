package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseGeneric<T extends ItemGeneric<?>> {

  @JsonProperty("items")
  private List<T> items = new ArrayList<T>();

  @JsonProperty("took")
  private Integer took;

  @JsonProperty("timestamp")
  private Integer timestamp;

  @JsonProperty("error")
  private String error;

  @JsonProperty("items")
  public List<T> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<T> items) {
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

  @JsonProperty("error")
  public String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(String error) {
    this.error = error;
  }
}
