package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valid",
    "signature_algorithm",
    "value",
    "self_signed"
})
public class Signature__1 {

    @JsonProperty("valid")
    private Boolean valid;
    @JsonProperty("signature_algorithm")
    private SignatureAlgorithm__2 signatureAlgorithm;
    @JsonProperty("value")
    private String value;
    @JsonProperty("self_signed")
    private Boolean selfSigned;

    @JsonProperty("valid")
    public Boolean getValid() {
        return valid;
    }

    @JsonProperty("valid")
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @JsonProperty("signature_algorithm")
    public SignatureAlgorithm__2 getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    @JsonProperty("signature_algorithm")
    public void setSignatureAlgorithm(SignatureAlgorithm__2 signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("self_signed")
    public Boolean getSelfSigned() {
        return selfSigned;
    }

    @JsonProperty("self_signed")
    public void setSelfSigned(Boolean selfSigned) {
        this.selfSigned = selfSigned;
    }

}
