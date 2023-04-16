package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"p", "gx", "b", "gy", "curve", "x", "length", "y", "n"})
public class EcdsaPublicKey {

  @JsonProperty("p")
  private String p;

  @JsonProperty("gx")
  private String gx;

  @JsonProperty("b")
  private String b;

  @JsonProperty("gy")
  private String gy;

  @JsonProperty("curve")
  private String curve;

  @JsonProperty("x")
  private String x;

  @JsonProperty("length")
  private Integer length;

  @JsonProperty("y")
  private String y;

  @JsonProperty("n")
  private String n;

  @JsonProperty("p")
  public String getP() {
    return p;
  }

  @JsonProperty("p")
  public void setP(String p) {
    this.p = p;
  }

  @JsonProperty("gx")
  public String getGx() {
    return gx;
  }

  @JsonProperty("gx")
  public void setGx(String gx) {
    this.gx = gx;
  }

  @JsonProperty("b")
  public String getB() {
    return b;
  }

  @JsonProperty("b")
  public void setB(String b) {
    this.b = b;
  }

  @JsonProperty("gy")
  public String getGy() {
    return gy;
  }

  @JsonProperty("gy")
  public void setGy(String gy) {
    this.gy = gy;
  }

  @JsonProperty("curve")
  public String getCurve() {
    return curve;
  }

  @JsonProperty("curve")
  public void setCurve(String curve) {
    this.curve = curve;
  }

  @JsonProperty("x")
  public String getX() {
    return x;
  }

  @JsonProperty("x")
  public void setX(String x) {
    this.x = x;
  }

  @JsonProperty("length")
  public Integer getLength() {
    return length;
  }

  @JsonProperty("length")
  public void setLength(Integer length) {
    this.length = length;
  }

  @JsonProperty("y")
  public String getY() {
    return y;
  }

  @JsonProperty("y")
  public void setY(String y) {
    this.y = y;
  }

  @JsonProperty("n")
  public String getN() {
    return n;
  }

  @JsonProperty("n")
  public void setN(String n) {
    this.n = n;
  }
}
