package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"certificate.names", "certificate.extensions.subject_alt_name.dns_names"})
public class Highlight {

  @JsonProperty("certificate.names")
  private String certificateNames;

  @JsonProperty("certificate.extensions.subject_alt_name.dns_names")
  private String certificateExtensionsSubjectAltNameDnsNames;

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
