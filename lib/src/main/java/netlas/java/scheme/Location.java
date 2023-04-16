package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"accuracy", "long", "lat"})
public class Location {

  @JsonProperty("accuracy")
  private Integer accuracy;

  @JsonProperty("long")
  private Double _long;

  @JsonProperty("lat")
  private Double lat;

  @JsonProperty("accuracy")
  public Integer getAccuracy() {
    return accuracy;
  }

  @JsonProperty("accuracy")
  public void setAccuracy(Integer accuracy) {
    this.accuracy = accuracy;
  }

  @JsonProperty("long")
  public Double getLong() {
    return _long;
  }

  @JsonProperty("long")
  public void setLong(Double _long) {
    this._long = _long;
  }

  @JsonProperty("lat")
  public Double getLat() {
    return lat;
  }

  @JsonProperty("lat")
  public void setLat(Double lat) {
    this.lat = lat;
  }
}
