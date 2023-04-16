package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"ecdsa_public_key", "raw", "fingerprint_sha256", "algorithm"})
public class ServerHostKey {

  @JsonProperty("ecdsa_public_key")
  private EcdsaPublicKey ecdsaPublicKey;

  @JsonProperty("raw")
  private String raw;

  @JsonProperty("fingerprint_sha256")
  private String fingerprintSha256;

  @JsonProperty("algorithm")
  private String algorithm;

  @JsonProperty("ecdsa_public_key")
  public EcdsaPublicKey getEcdsaPublicKey() {
    return ecdsaPublicKey;
  }

  @JsonProperty("ecdsa_public_key")
  public void setEcdsaPublicKey(EcdsaPublicKey ecdsaPublicKey) {
    this.ecdsaPublicKey = ecdsaPublicKey;
  }

  @JsonProperty("raw")
  public String getRaw() {
    return raw;
  }

  @JsonProperty("raw")
  public void setRaw(String raw) {
    this.raw = raw;
  }

  @JsonProperty("fingerprint_sha256")
  public String getFingerprintSha256() {
    return fingerprintSha256;
  }

  @JsonProperty("fingerprint_sha256")
  public void setFingerprintSha256(String fingerprintSha256) {
    this.fingerprintSha256 = fingerprintSha256;
  }

  @JsonProperty("algorithm")
  public String getAlgorithm() {
    return algorithm;
  }

  @JsonProperty("algorithm")
  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }
}
