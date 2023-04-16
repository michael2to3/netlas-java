package netlas.java.scheme.host;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"retries", "quota_retries", "parser", "was_queued", "total_time", "error"})
public class Stats {

  @JsonProperty("retries")
  private Integer retries;

  @JsonProperty("quota_retries")
  private Integer quotaRetries;

  @JsonProperty("parser")
  private String parser;

  @JsonProperty("was_queued")
  private Boolean wasQueued;

  @JsonProperty("total_time")
  private Integer totalTime;

  @JsonProperty("error")
  private String error;

  @JsonProperty("retries")
  public Integer getRetries() {
    return retries;
  }

  @JsonProperty("retries")
  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  @JsonProperty("quota_retries")
  public Integer getQuotaRetries() {
    return quotaRetries;
  }

  @JsonProperty("quota_retries")
  public void setQuotaRetries(Integer quotaRetries) {
    this.quotaRetries = quotaRetries;
  }

  @JsonProperty("parser")
  public String getParser() {
    return parser;
  }

  @JsonProperty("parser")
  public void setParser(String parser) {
    this.parser = parser;
  }

  @JsonProperty("was_queued")
  public Boolean getWasQueued() {
    return wasQueued;
  }

  @JsonProperty("was_queued")
  public void setWasQueued(Boolean wasQueued) {
    this.wasQueued = wasQueued;
  }

  @JsonProperty("total_time")
  public Integer getTotalTime() {
    return totalTime;
  }

  @JsonProperty("total_time")
  public void setTotalTime(Integer totalTime) {
    this.totalTime = totalTime;
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
