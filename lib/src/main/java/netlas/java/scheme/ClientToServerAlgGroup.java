package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cipher",
    "compression",
    "mac"
})
public class ClientToServerAlgGroup {

    @JsonProperty("cipher")
    private String cipher;
    @JsonProperty("compression")
    private String compression;
    @JsonProperty("mac")
    private String mac;

    @JsonProperty("cipher")
    public String getCipher() {
        return cipher;
    }

    @JsonProperty("cipher")
    public void setCipher(String cipher) {
        this.cipher = cipher;
    }

    @JsonProperty("compression")
    public String getCompression() {
        return compression;
    }

    @JsonProperty("compression")
    public void setCompression(String compression) {
        this.compression = compression;
    }

    @JsonProperty("mac")
    public String getMac() {
        return mac;
    }

    @JsonProperty("mac")
    public void setMac(String mac) {
        this.mac = mac;
    }

}
