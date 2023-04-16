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
  "authority_info_access",
  "basic_constraints",
  "extended_key_usage"
})
public class Extensions {

  @JsonProperty("crl_distribution_points")
  private List<String> crlDistributionPoints = new ArrayList<String>();

  @JsonProperty("subject_key_id")
  private String subjectKeyId;

  @JsonProperty("certificate_policies")
  private List<CertificatePolicy> certificatePolicies = new ArrayList<CertificatePolicy>();

  @JsonProperty("key_usage")
  private KeyUsage keyUsage;

  @JsonProperty("authority_key_id")
  private String authorityKeyId;

  @JsonProperty("authority_info_access")
  private AuthorityInfoAccess authorityInfoAccess;

  @JsonProperty("basic_constraints")
  private BasicConstraints basicConstraints;

  @JsonProperty("extended_key_usage")
  private ExtendedKeyUsage extendedKeyUsage;

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
  public List<CertificatePolicy> getCertificatePolicies() {
    return certificatePolicies;
  }

  @JsonProperty("certificate_policies")
  public void setCertificatePolicies(List<CertificatePolicy> certificatePolicies) {
    this.certificatePolicies = certificatePolicies;
  }

  @JsonProperty("key_usage")
  public KeyUsage getKeyUsage() {
    return keyUsage;
  }

  @JsonProperty("key_usage")
  public void setKeyUsage(KeyUsage keyUsage) {
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

  @JsonProperty("authority_info_access")
  public AuthorityInfoAccess getAuthorityInfoAccess() {
    return authorityInfoAccess;
  }

  @JsonProperty("authority_info_access")
  public void setAuthorityInfoAccess(AuthorityInfoAccess authorityInfoAccess) {
    this.authorityInfoAccess = authorityInfoAccess;
  }

  @JsonProperty("basic_constraints")
  public BasicConstraints getBasicConstraints() {
    return basicConstraints;
  }

  @JsonProperty("basic_constraints")
  public void setBasicConstraints(BasicConstraints basicConstraints) {
    this.basicConstraints = basicConstraints;
  }

  @JsonProperty("extended_key_usage")
  public ExtendedKeyUsage getExtendedKeyUsage() {
    return extendedKeyUsage;
  }

  @JsonProperty("extended_key_usage")
  public void setExtendedKeyUsage(ExtendedKeyUsage extendedKeyUsage) {
    this.extendedKeyUsage = extendedKeyUsage;
  }
}
