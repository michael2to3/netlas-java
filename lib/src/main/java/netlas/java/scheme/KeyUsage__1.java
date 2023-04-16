package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "digital_signature",
    "key_encipherment",
    "value"
})
public class KeyUsage__1 {

    @JsonProperty("digital_signature")
    private Boolean digitalSignature;
    @JsonProperty("key_encipherment")
    private Boolean keyEncipherment;
    @JsonProperty("value")
    private Integer value;

    @JsonProperty("digital_signature")
    public Boolean getDigitalSignature() {
        return digitalSignature;
    }

    @JsonProperty("digital_signature")
    public void setDigitalSignature(Boolean digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    @JsonProperty("key_encipherment")
    public Boolean getKeyEncipherment() {
        return keyEncipherment;
    }

    @JsonProperty("key_encipherment")
    public void setKeyEncipherment(Boolean keyEncipherment) {
        this.keyEncipherment = keyEncipherment;
    }

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

}
