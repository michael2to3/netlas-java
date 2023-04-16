package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "log_id",
    "signature",
    "version",
    "timestamp"
})
public class SignedCertificateTimestamp {

    @JsonProperty("log_id")
    private String logId;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("timestamp")
    private Integer timestamp;

    @JsonProperty("log_id")
    public String getLogId() {
        return logId;
    }

    @JsonProperty("log_id")
    public void setLogId(String logId) {
        this.logId = logId;
    }

    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

}
