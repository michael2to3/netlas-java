package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Highlight {
  @JsonProperty("certificate.names")
  private String certificateNames;

  @JsonProperty("certificate.extensions.subject_alt_name.dns_names")
  private String certificateExtensionsSubjectAltNameDnsNames;

  @JsonProperty("path")
  private String path;

  @JsonProperty("host")
  private String host;

  @JsonProperty("certificate.subject_dn")
  private String certificateSubjectDn;

  @JsonProperty("certificate.subject.common_name")
  private String certificateSubjectCommonName;

  @JsonProperty("certificate.subject.organization")
  private String certificateSubjectOrganization;

  @JsonProperty("raw")
  private String raw;

  @JsonProperty("net.remarks")
  private String netRemarks;

  @JsonProperty("stats.parser")
  private String statsParser;

  @JsonProperty("registrar.email")
  private String registrarEmail;

  @JsonProperty("technical.email")
  private String technicalEmail;

  @JsonProperty("registrant.email")
  private String registrantEmail;

  @JsonProperty("administrative.email")
  private String administrativeEmail;

  @JsonProperty("name")
  private String name;

  @JsonProperty("billing.email")
  private String billingEmail;

  @JsonProperty("related_nets.description.keyword")
  private String relatedNetsDescriptionKeyword;

  @JsonProperty("related_nets.description")
  private String relatedNetsDescription;

  @JsonProperty("asn.name")
  private String asnName;

  @JsonProperty("net.address")
  private String netAddress;

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

  @JsonProperty("certificate.subject_dn")
  public String getCertificateSubjectDn() {
    return certificateSubjectDn;
  }

  @JsonProperty("certificate.subject_dn")
  public void setCertificateSubjectDn(String certificateSubjectDn) {
    this.certificateSubjectDn = certificateSubjectDn;
  }

  @JsonProperty("certificate.subject.common_name")
  public String getCertificateSubjectCommonName() {
    return certificateSubjectCommonName;
  }

  @JsonProperty("certificate.subject.common_name")
  public void setCertificateSubjectCommonName(String certificateSubjectCommonName) {
    this.certificateSubjectCommonName = certificateSubjectCommonName;
  }

  @JsonProperty("certificate.subject.organization")
  public String getCertificateSubjectOrganization() {
    return certificateSubjectOrganization;
  }

  @JsonProperty("certificate.subject.organization")
  public void setCertificateSubjectOrganization(String certificateSubjectOrganization) {
    this.certificateSubjectOrganization = certificateSubjectOrganization;
  }

  @JsonProperty("raw")
  public String getRaw() {
    return raw;
  }

  @JsonProperty("raw")
  public void setRaw(String raw) {
    this.raw = raw;
  }

  @JsonProperty("net.remarks")
  public String getNetRemarks() {
    return netRemarks;
  }

  @JsonProperty("net.remarks")
  public void setNetRemarks(String netRemarks) {
    this.netRemarks = netRemarks;
  }

  @JsonProperty("stats.parser")
  public String getStatsParser() {
    return statsParser;
  }

  @JsonProperty("stats.parser")
  public void setStatsParser(String statsParser) {
    this.statsParser = statsParser;
  }

  @JsonProperty("registrar.email")
  public String getRegistrarEmail() {
    return registrarEmail;
  }

  @JsonProperty("registrar.email")
  public void setRegistrarEmail(String registrarEmail) {
    this.registrarEmail = registrarEmail;
  }

  @JsonProperty("technical.email")
  public String getTechnicalEmail() {
    return technicalEmail;
  }

  @JsonProperty("technical.email")
  public void setTechnicalEmail(String technicalEmail) {
    this.technicalEmail = technicalEmail;
  }

  @JsonProperty("registrant.email")
  public String getRegistrantEmail() {
    return registrantEmail;
  }

  @JsonProperty("registrant.email")
  public void setRegistrantEmail(String registrantEmail) {
    this.registrantEmail = registrantEmail;
  }

  @JsonProperty("administrative.email")
  public String getAdministrativeEmail() {
    return administrativeEmail;
  }

  @JsonProperty("administrative.email")
  public void setAdministrativeEmail(String administrativeEmail) {
    this.administrativeEmail = administrativeEmail;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("billing.email")
  public String getBillingEmail() {
    return billingEmail;
  }

  @JsonProperty("billing.email")
  public void setBillingEmail(String billingEmail) {
    this.billingEmail = billingEmail;
  }

  @JsonProperty("related_nets.description.keyword")
  public String getRelatedNetsDescriptionKeyword() {
    return relatedNetsDescriptionKeyword;
  }

  @JsonProperty("related_nets.description.keyword")
  public void setRelatedNetsDescriptionKeyword(String relatedNetsDescriptionKeyword) {
    this.relatedNetsDescriptionKeyword = relatedNetsDescriptionKeyword;
  }

  @JsonProperty("related_nets.description")
  public String getRelatedNetsDescription() {
    return relatedNetsDescription;
  }

  @JsonProperty("related_nets.description")
  public void setRelatedNetsDescription(String relatedNetsDescription) {
    this.relatedNetsDescription = relatedNetsDescription;
  }

  @JsonProperty("asn.name")
  public String getAsnName() {
    return asnName;
  }

  @JsonProperty("asn.name")
  public void setAsnName(String asnName) {
    this.asnName = asnName;
  }

  @JsonProperty("net.address")
  public String getNetAddress() {
    return netAddress;
  }

  @JsonProperty("net.address")
  public void setNetAddress(String netAddress) {
    this.netAddress = netAddress;
  }
}
