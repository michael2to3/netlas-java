package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "digital_signature",
  "certificate_sign",
  "crl_sign",
  "value",
  "key_encipherment"
})
public class KeyUsage {

  @JsonProperty("digital_signature")
  private Boolean digitalSignature;

  @JsonProperty("certificate_sign")
  private Boolean certificateSign;

  @JsonProperty("crl_sign")
  private Boolean crlSign;

  @JsonProperty("value")
  private Integer value;

  @JsonProperty("key_encipherment")
  private Boolean keyEncipherment;

  @JsonProperty("key_agreement")
  private Boolean keyAgreement;

  @JsonProperty("data_encipherment")
  private Boolean dataEncipherment;

  @JsonProperty("content_commitment")
  private Boolean contentCommitment;

  @JsonProperty("digital_signature")
  public Boolean getDigitalSignature() {
    return digitalSignature;
  }

  @JsonProperty("digital_signature")
  public void setDigitalSignature(Boolean digitalSignature) {
    this.digitalSignature = digitalSignature;
  }

  @JsonProperty("certificate_sign")
  public Boolean getCertificateSign() {
    return certificateSign;
  }

  @JsonProperty("certificate_sign")
  public void setCertificateSign(Boolean certificateSign) {
    this.certificateSign = certificateSign;
  }

  @JsonProperty("crl_sign")
  public Boolean getCrlSign() {
    return crlSign;
  }

  @JsonProperty("crl_sign")
  public void setCrlSign(Boolean crlSign) {
    this.crlSign = crlSign;
  }

  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(Integer value) {
    this.value = value;
  }

  @JsonProperty("key_encipherment")
  public Boolean getKeyEncipherment() {
    return keyEncipherment;
  }

  @JsonProperty("key_encipherment")
  public void setKeyEncipherment(Boolean keyEncipherment) {
    this.keyEncipherment = keyEncipherment;
  }

  @JsonProperty("key_agreement")
  public Boolean getKeyAgreement() {
    return keyAgreement;
  }

  @JsonProperty("key_agreement")
  public void setKeyAgreement(Boolean keyAgreement) {
    this.keyAgreement = keyAgreement;
  }

  @JsonProperty("data_encipherment")
  public Boolean getDataEncipherment() {
    return dataEncipherment;
  }

  @JsonProperty("data_encipherment")
  public void setDataEncipherment(Boolean dataEncipherment) {
    this.dataEncipherment = dataEncipherment;
  }

  @JsonProperty("content_commitment")
  public Boolean getContentCommitment() {
    return contentCommitment;
  }

  @JsonProperty("content_commitment")
  public void setContentCommitment(Boolean contentCommitment) {
    this.contentCommitment = contentCommitment;
  }
}
