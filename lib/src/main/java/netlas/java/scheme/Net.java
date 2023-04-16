package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "created",
  "start_ip",
  "range",
  "description",
  "net_size",
  "cidr",
  "updated",
  "end_ip"
})
public class Net {

  @JsonProperty("created")
  private String created;

  @JsonProperty("start_ip")
  private String startIp;

  @JsonProperty("range")
  private String range;

  @JsonProperty("description")
  private String description;

  @JsonProperty("net_size")
  private Integer netSize;

  @JsonProperty("cidr")
  private List<String> cidr = new ArrayList<String>();

  @JsonProperty("updated")
  private String updated;

  @JsonProperty("end_ip")
  private String endIp;

  @JsonProperty("created")
  public String getCreated() {
    return created;
  }

  @JsonProperty("created")
  public void setCreated(String created) {
    this.created = created;
  }

  @JsonProperty("start_ip")
  public String getStartIp() {
    return startIp;
  }

  @JsonProperty("start_ip")
  public void setStartIp(String startIp) {
    this.startIp = startIp;
  }

  @JsonProperty("range")
  public String getRange() {
    return range;
  }

  @JsonProperty("range")
  public void setRange(String range) {
    this.range = range;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("net_size")
  public Integer getNetSize() {
    return netSize;
  }

  @JsonProperty("net_size")
  public void setNetSize(Integer netSize) {
    this.netSize = netSize;
  }

  @JsonProperty("cidr")
  public List<String> getCidr() {
    return cidr;
  }

  @JsonProperty("cidr")
  public void setCidr(List<String> cidr) {
    this.cidr = cidr;
  }

  @JsonProperty("updated")
  public String getUpdated() {
    return updated;
  }

  @JsonProperty("updated")
  public void setUpdated(String updated) {
    this.updated = updated;
  }

  @JsonProperty("end_ip")
  public String getEndIp() {
    return endIp;
  }

  @JsonProperty("end_ip")
  public void setEndIp(String endIp) {
    this.endIp = endIp;
  }
}
