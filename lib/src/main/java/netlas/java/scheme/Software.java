package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
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
