package netlas.java.scheme.indices;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "id",
  "name",
  "scan_started_dt",
  "scan_ended_dt",
  "is_default",
  "speed",
  "state",
  "type",
  "count"
})
public class Index {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("scan_started_dt")
  private String scanStartedDt;

  @JsonProperty("scan_ended_dt")
  private String scanEndedDt;

  @JsonProperty("is_default")
  private Boolean isDefault;

  @JsonProperty("speed")
  private String speed;

  @JsonProperty("state")
  private String state;

  @JsonProperty("type")
  private String type;

  @JsonProperty("count")
  private Integer count;

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("scan_started_dt")
  public String getScanStartedDt() {
    return scanStartedDt;
  }

  @JsonProperty("scan_started_dt")
  public void setScanStartedDt(String scanStartedDt) {
    this.scanStartedDt = scanStartedDt;
  }

  @JsonProperty("scan_ended_dt")
  public String getScanEndedDt() {
    return scanEndedDt;
  }

  @JsonProperty("scan_ended_dt")
  public void setScanEndedDt(String scanEndedDt) {
    this.scanEndedDt = scanEndedDt;
  }

  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  @JsonProperty("speed")
  public String getSpeed() {
    return speed;
  }

  @JsonProperty("speed")
  public void setSpeed(String speed) {
    this.speed = speed;
  }

  @JsonProperty("state")
  public String getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(String state) {
    this.state = state;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  @JsonProperty("count")
  public void setCount(Integer count) {
    this.count = count;
  }
}
