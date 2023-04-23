package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnknownExtension {
  @JsonProperty("critical")
  private Boolean critical;

  @JsonProperty("id")
  private String id;

  @JsonProperty("value")
  private String value;

  public Boolean getCritical() {
    return critical;
  }

  public void setCritical(Boolean critical) {
    this.critical = critical;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
