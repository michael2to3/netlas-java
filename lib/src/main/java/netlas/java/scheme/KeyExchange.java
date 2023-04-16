package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "server_signature",
    "curve25519_sha256_params",
    "server_host_key"
})
public class KeyExchange {

    @JsonProperty("server_signature")
    private ServerSignature serverSignature;
    @JsonProperty("curve25519_sha256_params")
    private Curve25519Sha256Params curve25519Sha256Params;
    @JsonProperty("server_host_key")
    private ServerHostKey serverHostKey;

    @JsonProperty("server_signature")
    public ServerSignature getServerSignature() {
        return serverSignature;
    }

    @JsonProperty("server_signature")
    public void setServerSignature(ServerSignature serverSignature) {
        this.serverSignature = serverSignature;
    }

    @JsonProperty("curve25519_sha256_params")
    public Curve25519Sha256Params getCurve25519Sha256Params() {
        return curve25519Sha256Params;
    }

    @JsonProperty("curve25519_sha256_params")
    public void setCurve25519Sha256Params(Curve25519Sha256Params curve25519Sha256Params) {
        this.curve25519Sha256Params = curve25519Sha256Params;
    }

    @JsonProperty("server_host_key")
    public ServerHostKey getServerHostKey() {
        return serverHostKey;
    }

    @JsonProperty("server_host_key")
    public void setServerHostKey(ServerHostKey serverHostKey) {
        this.serverHostKey = serverHostKey;
    }

}
