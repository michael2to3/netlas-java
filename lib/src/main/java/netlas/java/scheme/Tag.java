package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag {

  @JsonProperty("name")
  private String name;

  @JsonProperty("cpe")
  private List<String> cpe = new ArrayList<String>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("fullname")
  private String fullname;

  @JsonProperty("category")
  private List<String> category = new ArrayList<String>();

  private Map<String, Technology> technologies = new HashMap<>();

  public String getName() {
    return name;
  }

  public List<String> getCpe() {
    return cpe;
  }

  public String getDescription() {
    return description;
  }

  public String getFullname() {
    return fullname;
  }

  public List<String> getCategory() {
    return category;
  }

  @JsonAnyGetter
  public Map<String, Technology> getTechnologies() {
    return technologies;
  }

  @JsonAnySetter
  public void setTechnologies(String name, Technology technology) {
    this.technologies.put(name, technology);
  }
}
