package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"took", "aggregations"})
public class Stat {

  @JsonProperty("took")
  private Integer took;

  @JsonProperty("aggregations")
  private List<Aggregation> aggregations = new ArrayList<Aggregation>();

  @JsonProperty("took")
  public Integer getTook() {
    return took;
  }

  @JsonProperty("took")
  public void setTook(Integer took) {
    this.took = took;
  }

  @JsonProperty("aggregations")
  public List<Aggregation> getAggregations() {
    return aggregations;
  }

  @JsonProperty("aggregations")
  public void setAggregations(List<Aggregation> aggregations) {
    this.aggregations = aggregations;
  }
}
