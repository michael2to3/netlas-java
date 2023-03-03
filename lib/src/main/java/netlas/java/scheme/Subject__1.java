import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"common_name"})
public class Subject__1 {

  @JsonProperty("common_name")
  private List<String> commonName;

  @JsonProperty("common_name")
  public List<String> getCommonName() {
    return commonName;
  }

  @JsonProperty("common_name")
  public void setCommonName(List<String> commonName) {
    this.commonName = commonName;
  }
}
