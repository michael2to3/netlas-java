package netlas.java.scheme.host;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "name",
  "cpe",
  "description",
  "google",
  "fullname",
  "category",
  "opengse",
  "google_web_server"
})
public class Tag {

  @JsonProperty("name")
  private String name;

  @JsonProperty("cpe")
  private List<String> cpe = new ArrayList<String>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("google")
  private Google google;

  @JsonProperty("fullname")
  private String fullname;

  @JsonProperty("category")
  private List<String> category = new ArrayList<String>();

  @JsonProperty("opengse")
  private Opengse opengse;

  @JsonProperty("google_web_server")
  private GoogleWebServer googleWebServer;

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

  @JsonProperty("google")
  public Google getGoogle() {
    return google;
  }

  @JsonProperty("google")
  public void setGoogle(Google google) {
    this.google = google;
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

  @JsonProperty("opengse")
  public Opengse getOpengse() {
    return opengse;
  }

  @JsonProperty("opengse")
  public void setOpengse(Opengse opengse) {
    this.opengse = opengse;
  }

  @JsonProperty("google_web_server")
  public GoogleWebServer getGoogleWebServer() {
    return googleWebServer;
  }

  @JsonProperty("google_web_server")
  public void setGoogleWebServer(GoogleWebServer googleWebServer) {
    this.googleWebServer = googleWebServer;
  }
}
