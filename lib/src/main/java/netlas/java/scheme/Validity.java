package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Validity {

  @JsonProperty("start")
  private String start;

  @JsonProperty("length")
  private BigInteger length;

  @JsonProperty("end")
  private String end;

  @JsonProperty("start")
  public String getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(String start) {
    this.start = start;
  }

  @JsonProperty("length")
  public BigInteger getLength() {
    return length;
  }

  @JsonProperty("length")
  public void setLength(BigInteger length) {
    this.length = length;
  }

  @JsonProperty("end")
  public String getEnd() {
    return end;
  }

  @JsonProperty("end")
  public void setEnd(String end) {
    this.end = end;
  }
}
