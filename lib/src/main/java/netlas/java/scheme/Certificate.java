package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "issuer_dn",
  "fingerprint_md5",
  "chain",
  "src",
  "redacted",
  "signature",
  "subject",
  "serial_number",
  "version",
  "issuer",
  "tbs_noct_fingerprint",
  "fingerprint_sha256",
  "extensions",
  "tbs_fingerprint",
  "subject_dn",
  "names",
  "fingerprint_sha1",
  "signature_algorithm",
  "spki_subject_fingerprint",
  "validity",
  "validation_level"
})
public class Certificate {

  @JsonProperty("issuer_dn")
  private String issuerDn;

  @JsonProperty("fingerprint_md5")
  private String fingerprintMd5;

  @JsonProperty("chain")
  private List<Chain> chain = new ArrayList<Chain>();

  @JsonProperty("src")
  private String src;

  @JsonProperty("redacted")
  private Boolean redacted;

  @JsonProperty("signature")
  private Signature signature;

  @JsonProperty("subject")
  private Subject subject;

  @JsonProperty("serial_number")
  private String serialNumber;

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("issuer")
  private Issuer issuer;

  @JsonProperty("tbs_noct_fingerprint")
  private String tbsNoctFingerprint;

  @JsonProperty("fingerprint_sha256")
  private String fingerprintSha256;

  @JsonProperty("extensions")
  private Extensions extensions;

  @JsonProperty("tbs_fingerprint")
  private String tbsFingerprint;

  @JsonProperty("subject_dn")
  private String subjectDn;

  @JsonProperty("names")
  private List<String> names = new ArrayList<String>();

  @JsonProperty("fingerprint_sha1")
  private String fingerprintSha1;

  @JsonProperty("signature_algorithm")
  private SignatureAlgorithm signatureAlgorithm;

  @JsonProperty("spki_subject_fingerprint")
  private String spkiSubjectFingerprint;

  @JsonProperty("validity")
  private Validity validity;

  @JsonProperty("validation_level")
  private String validationLevel;

  @JsonProperty("issuer_dn")
  public String getIssuerDn() {
    return issuerDn;
  }

  @JsonProperty("issuer_dn")
  public void setIssuerDn(String issuerDn) {
    this.issuerDn = issuerDn;
  }

  @JsonProperty("fingerprint_md5")
  public String getFingerprintMd5() {
    return fingerprintMd5;
  }

  @JsonProperty("fingerprint_md5")
  public void setFingerprintMd5(String fingerprintMd5) {
    this.fingerprintMd5 = fingerprintMd5;
  }

  @JsonProperty("chain")
  public List<Chain> getChain() {
    return chain;
  }

  @JsonProperty("chain")
  public void setChain(List<Chain> chain) {
    this.chain = chain;
  }

  @JsonProperty("src")
  public String getSrc() {
    return src;
  }

  @JsonProperty("src")
  public void setSrc(String src) {
    this.src = src;
  }

  @JsonProperty("redacted")
  public Boolean getRedacted() {
    return redacted;
  }

  @JsonProperty("redacted")
  public void setRedacted(Boolean redacted) {
    this.redacted = redacted;
  }

  @JsonProperty("signature")
  public Signature getSignature() {
    return signature;
  }

  @JsonProperty("signature")
  public void setSignature(Signature signature) {
    this.signature = signature;
  }

  @JsonProperty("subject")
  public Subject getSubject() {
    return subject;
  }

  @JsonProperty("subject")
  public void setSubject(Subject subject) {
    this.subject = subject;
  }

  @JsonProperty("serial_number")
  public String getSerialNumber() {
    return serialNumber;
  }

  @JsonProperty("serial_number")
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  @JsonProperty("version")
  public void setVersion(Integer version) {
    this.version = version;
  }

  @JsonProperty("issuer")
  public Issuer getIssuer() {
    return issuer;
  }

  @JsonProperty("issuer")
  public void setIssuer(Issuer issuer) {
    this.issuer = issuer;
  }

  @JsonProperty("tbs_noct_fingerprint")
  public String getTbsNoctFingerprint() {
    return tbsNoctFingerprint;
  }

  @JsonProperty("tbs_noct_fingerprint")
  public void setTbsNoctFingerprint(String tbsNoctFingerprint) {
    this.tbsNoctFingerprint = tbsNoctFingerprint;
  }

  @JsonProperty("fingerprint_sha256")
  public String getFingerprintSha256() {
    return fingerprintSha256;
  }

  @JsonProperty("fingerprint_sha256")
  public void setFingerprintSha256(String fingerprintSha256) {
    this.fingerprintSha256 = fingerprintSha256;
  }

  @JsonProperty("extensions")
  public Extensions getExtensions() {
    return extensions;
  }

  @JsonProperty("extensions")
  public void setExtensions(Extensions extensions) {
    this.extensions = extensions;
  }

  @JsonProperty("tbs_fingerprint")
  public String getTbsFingerprint() {
    return tbsFingerprint;
  }

  @JsonProperty("tbs_fingerprint")
  public void setTbsFingerprint(String tbsFingerprint) {
    this.tbsFingerprint = tbsFingerprint;
  }

  @JsonProperty("subject_dn")
  public String getSubjectDn() {
    return subjectDn;
  }

  @JsonProperty("subject_dn")
  public void setSubjectDn(String subjectDn) {
    this.subjectDn = subjectDn;
  }

  @JsonProperty("names")
  public List<String> getNames() {
    return names;
  }

  @JsonProperty("names")
  public void setNames(List<String> names) {
    this.names = names;
  }

  @JsonProperty("fingerprint_sha1")
  public String getFingerprintSha1() {
    return fingerprintSha1;
  }

  @JsonProperty("fingerprint_sha1")
  public void setFingerprintSha1(String fingerprintSha1) {
    this.fingerprintSha1 = fingerprintSha1;
  }

  @JsonProperty("signature_algorithm")
  public SignatureAlgorithm getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  @JsonProperty("signature_algorithm")
  public void setSignatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
    this.signatureAlgorithm = signatureAlgorithm;
  }

  @JsonProperty("spki_subject_fingerprint")
  public String getSpkiSubjectFingerprint() {
    return spkiSubjectFingerprint;
  }

  @JsonProperty("spki_subject_fingerprint")
  public void setSpkiSubjectFingerprint(String spkiSubjectFingerprint) {
    this.spkiSubjectFingerprint = spkiSubjectFingerprint;
  }

  @JsonProperty("validity")
  public Validity getValidity() {
    return validity;
  }

  @JsonProperty("validity")
  public void setValidity(Validity validity) {
    this.validity = validity;
  }

  @JsonProperty("validation_level")
  public String getValidationLevel() {
    return validationLevel;
  }

  @JsonProperty("validation_level")
  public void setValidationLevel(String validationLevel) {
    this.validationLevel = validationLevel;
  }
}
