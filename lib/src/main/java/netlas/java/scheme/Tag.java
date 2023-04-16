package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "nginx",
  "name",
  "cpe",
  "description",
  "fullname",
  "category",
  "openssh",
  "debian"
})
public class Tag {

  @JsonProperty("nginx")
  private Nginx nginx;

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

  @JsonProperty("openssh")
  private Openssh openssh;

  @JsonProperty("debian")
  private Debian debian;

  @JsonProperty("nginx")
  public Nginx getNginx() {
    return nginx;
  }

  @JsonProperty("nginx")
  public void setNginx(Nginx nginx) {
    this.nginx = nginx;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("cpe")
  public List<String> getCpe() {
    return cpe;
  }

  @JsonProperty("cpe")
  public void setCpe(List<String> cpe) {
    this.cpe = cpe;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("fullname")
  public String getFullname() {
    return fullname;
  }

  @JsonProperty("fullname")
  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  @JsonProperty("category")
  public List<String> getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(List<String> category) {
    this.category = category;
  }

  @JsonProperty("openssh")
  public Openssh getOpenssh() {
    return openssh;
  }

  @JsonProperty("openssh")
  public void setOpenssh(Openssh openssh) {
    this.openssh = openssh;
  }

  @JsonProperty("debian")
  public Debian getDebian() {
    return debian;
  }

  @JsonProperty("debian")
  public void setDebian(Debian debian) {
    this.debian = debian;
  }
}
