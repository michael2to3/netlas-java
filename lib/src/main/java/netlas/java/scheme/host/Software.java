package netlas.java.scheme.host;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"tag", "uri"})
public class Software {

  @JsonProperty("tag")
  private List<Tag> tag = new ArrayList<Tag>();

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("tag")
  public List<Tag> getTag() {
    return tag;
  }

  @JsonProperty("tag")
  public void setTag(List<Tag> tag) {
    this.tag = tag;
  }

  @JsonProperty("uri")
  public String getUri() {
    return uri;
  }

  @JsonProperty("uri")
  public void setUri(String uri) {
    this.uri = uri;
  }
}
