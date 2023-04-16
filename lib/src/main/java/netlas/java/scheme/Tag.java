package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
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

  @JsonProperty("google_web_server")
  private GoogleWebServer googleWebServer;

  @JsonProperty("google_font_api")
  private GoogleFontApi googleFontApi;

  @JsonProperty("opengse")
  private Opengse opengse;

  @JsonProperty("amazon_cloudfront")
  private AmazonCloudfront amazonCloudfront;

  @JsonProperty("amazon_s3")
  private AmazonS3 amazonS3;

  @JsonProperty("angularjs")
  private Angularjs angularjs;

  @JsonProperty("bem")
  private Bem bem;

  @JsonProperty("react")
  private React react;

  @JsonProperty("google")
  private Google google;

  @JsonProperty("cloudflare")
  private Cloudflare cloudflare;

  @JsonProperty("bootstrap")
  private Bootstrap bootstrap;

  @JsonProperty("google_web_server")
  public GoogleWebServer getGoogleWebServer() {
    return googleWebServer;
  }

  @JsonProperty("google_web_server")
  public void setGoogleWebServer(GoogleWebServer googleWebServer) {
    this.googleWebServer = googleWebServer;
  }

  @JsonProperty("google_font_api")
  public GoogleFontApi getGoogleFontApi() {
    return googleFontApi;
  }

  @JsonProperty("google_font_api")
  public void setGoogleFontApi(GoogleFontApi googleFontApi) {
    this.googleFontApi = googleFontApi;
  }

  @JsonProperty("opengse")
  public Opengse getOpengse() {
    return opengse;
  }

  @JsonProperty("opengse")
  public void setOpengse(Opengse opengse) {
    this.opengse = opengse;
  }

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

  @JsonProperty("amazon_cloudfront")
  public AmazonCloudfront getAmazonCloudfront() {
    return amazonCloudfront;
  }

  @JsonProperty("amazon_cloudfront")
  public void setAmazonCloudfront(AmazonCloudfront amazonCloudfront) {
    this.amazonCloudfront = amazonCloudfront;
  }

  @JsonProperty("amazon_s3")
  public AmazonS3 getAmazonS3() {
    return amazonS3;
  }

  @JsonProperty("amazon_s3")
  public void setAmazonS3(AmazonS3 amazonS3) {
    this.amazonS3 = amazonS3;
  }

  @JsonProperty("angularjs")
  public Angularjs getAngularjs() {
    return angularjs;
  }

  @JsonProperty("angularjs")
  public void setAngularjs(Angularjs angularjs) {
    this.angularjs = angularjs;
  }

  @JsonProperty("bem")
  public Bem getBem() {
    return bem;
  }

  @JsonProperty("bem")
  public void setBem(Bem bem) {
    this.bem = bem;
  }

  @JsonProperty("react")
  public React getReact() {

    return react;
  }

  @JsonProperty("react")
  public void setReact(React react) {
    this.react = react;
  }

  @JsonProperty("google")
  public Google getGoogle() {
    return google;
  }

  @JsonProperty("google")
  public void setGoogle(Google google) {
    this.google = google;
  }

  @JsonProperty("cloudflare")
  public Cloudflare getCloudflare() {
    return cloudflare;
  }

  @JsonProperty("cloudflare")
  public void setCloudflare(Cloudflare cloudflare) {
    this.cloudflare = cloudflare;
  }

  @JsonProperty("bootstrap")
  public Bootstrap getBootstrap() {
    return bootstrap;
  }

  @JsonProperty("bootstrap")
  public void setBootstrap(Bootstrap bootstrap) {
    this.bootstrap = bootstrap;
  }
}
