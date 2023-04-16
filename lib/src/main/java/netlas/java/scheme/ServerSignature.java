package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"h", "raw", "parsed"})
public class ServerSignature {

  @JsonProperty("h")
  private String h;

  @JsonProperty("raw")
  private String raw;

  @JsonProperty("parsed")
  private Parsed parsed;

  @JsonProperty("h")
  public String getH() {
    return h;
  }

  @JsonProperty("h")
  public void setH(String h) {
    this.h = h;
  }

  @JsonProperty("raw")
  public String getRaw() {
    return raw;
  }

  @JsonProperty("raw")
  public void setRaw(String raw) {
    this.raw = raw;
  }

  @JsonProperty("parsed")
  public Parsed getParsed() {
    return parsed;
  }

  @JsonProperty("parsed")
  public void setParsed(Parsed parsed) {
    this.parsed = parsed;
  }
}
