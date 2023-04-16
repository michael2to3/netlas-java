package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "crl_distribution_points",
  "subject_key_id",
  "certificate_policies",
  "key_usage",
  "authority_key_id",
  "subject_alt_name",
  "signed_certificate_timestamps",
  "authority_info_access",
  "basic_constraints",
  "extended_key_usage"
})
public class Extensions__1 {

  @JsonProperty("crl_distribution_points")
  private List<String> crlDistributionPoints = new ArrayList<String>();

  @JsonProperty("subject_key_id")
  private String subjectKeyId;

  @JsonProperty("certificate_policies")
  private List<CertificatePolicy__1> certificatePolicies = new ArrayList<CertificatePolicy__1>();

  @JsonProperty("key_usage")
  private KeyUsage__1 keyUsage;

  @JsonProperty("authority_key_id")
  private String authorityKeyId;

  @JsonProperty("subject_alt_name")
  private SubjectAltName subjectAltName;

  @JsonProperty("signed_certificate_timestamps")
  private List<SignedCertificateTimestamp> signedCertificateTimestamps =
      new ArrayList<SignedCertificateTimestamp>();

  @JsonProperty("authority_info_access")
  private AuthorityInfoAccess__1 authorityInfoAccess;

  @JsonProperty("basic_constraints")
  private BasicConstraints__1 basicConstraints;

  @JsonProperty("extended_key_usage")
  private ExtendedKeyUsage__1 extendedKeyUsage;

  @JsonProperty("crl_distribution_points")
  public List<String> getCrlDistributionPoints() {
    return crlDistributionPoints;
  }

  @JsonProperty("crl_distribution_points")
  public void setCrlDistributionPoints(List<String> crlDistributionPoints) {
    this.crlDistributionPoints = crlDistributionPoints;
  }

  @JsonProperty("subject_key_id")
  public String getSubjectKeyId() {
    return subjectKeyId;
  }

  @JsonProperty("subject_key_id")
  public void setSubjectKeyId(String subjectKeyId) {
    this.subjectKeyId = subjectKeyId;
  }

  @JsonProperty("certificate_policies")
  public List<CertificatePolicy__1> getCertificatePolicies() {
    return certificatePolicies;
  }

  @JsonProperty("certificate_policies")
  public void setCertificatePolicies(List<CertificatePolicy__1> certificatePolicies) {
    this.certificatePolicies = certificatePolicies;
  }

  @JsonProperty("key_usage")
  public KeyUsage__1 getKeyUsage() {
    return keyUsage;
  }

  @JsonProperty("key_usage")
  public void setKeyUsage(KeyUsage__1 keyUsage) {
    this.keyUsage = keyUsage;
  }

  @JsonProperty("authority_key_id")
  public String getAuthorityKeyId() {
    return authorityKeyId;
  }

  @JsonProperty("authority_key_id")
  public void setAuthorityKeyId(String authorityKeyId) {
    this.authorityKeyId = authorityKeyId;
  }

  @JsonProperty("subject_alt_name")
  public SubjectAltName getSubjectAltName() {
    return subjectAltName;
  }

  @JsonProperty("subject_alt_name")
  public void setSubjectAltName(SubjectAltName subjectAltName) {
    this.subjectAltName = subjectAltName;
  }

  @JsonProperty("signed_certificate_timestamps")
  public List<SignedCertificateTimestamp> getSignedCertificateTimestamps() {
    return signedCertificateTimestamps;
  }

  @JsonProperty("signed_certificate_timestamps")
  public void setSignedCertificateTimestamps(
      List<SignedCertificateTimestamp> signedCertificateTimestamps) {
    this.signedCertificateTimestamps = signedCertificateTimestamps;
  }

  @JsonProperty("authority_info_access")
  public AuthorityInfoAccess__1 getAuthorityInfoAccess() {
    return authorityInfoAccess;
  }

  @JsonProperty("authority_info_access")
  public void setAuthorityInfoAccess(AuthorityInfoAccess__1 authorityInfoAccess) {
    this.authorityInfoAccess = authorityInfoAccess;
  }

  @JsonProperty("basic_constraints")
  public BasicConstraints__1 getBasicConstraints() {
    return basicConstraints;
  }

  @JsonProperty("basic_constraints")
  public void setBasicConstraints(BasicConstraints__1 basicConstraints) {
    this.basicConstraints = basicConstraints;
  }

  @JsonProperty("extended_key_usage")
  public ExtendedKeyUsage__1 getExtendedKeyUsage() {
    return extendedKeyUsage;
  }

  @JsonProperty("extended_key_usage")
  public void setExtendedKeyUsage(ExtendedKeyUsage__1 extendedKeyUsage) {
    this.extendedKeyUsage = extendedKeyUsage;
  }
}
