package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "certificate.names",
  "certificate.extensions.subject_alt_name.dns_names",
  "path",
  "host"
})
public class Highlight {

  @JsonProperty("certificate.names")
  private String certificateNames;

  @JsonProperty("certificate.extensions.subject_alt_name.dns_names")
  private String certificateExtensionsSubjectAltNameDnsNames;

  @JsonProperty("path")
  private String path;

  @JsonProperty("host")
  private String host;

  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  @JsonProperty("path")
  public void setPath(String path) {
    this.path = path;
  }

  @JsonProperty("host")
  public String getHost() {
    return host;
  }

  @JsonProperty("host")
  public void setHost(String host) {
    this.host = host;
  }

  @JsonProperty("certificate.names")
  public String getCertificateNames() {
    return certificateNames;
  }

  @JsonProperty("certificate.names")
  public void setCertificateNames(String certificateNames) {
    this.certificateNames = certificateNames;
  }

  @JsonProperty("certificate.extensions.subject_alt_name.dns_names")
  public String getCertificateExtensionsSubjectAltNameDnsNames() {
    return certificateExtensionsSubjectAltNameDnsNames;
  }

  @JsonProperty("certificate.extensions.subject_alt_name.dns_names")
  public void setCertificateExtensionsSubjectAltNameDnsNames(
      String certificateExtensionsSubjectAltNameDnsNames) {
    this.certificateExtensionsSubjectAltNameDnsNames = certificateExtensionsSubjectAltNameDnsNames;
  }
}
