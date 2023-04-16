package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userauth",
    "server_key_exchange",
    "banner",
    "key_exchange",
    "server_id",
    "algorithm_selection"
})
public class Ssh {

    @JsonProperty("userauth")
    private List<String> userauth = new ArrayList<String>();
    @JsonProperty("server_key_exchange")
    private ServerKeyExchange serverKeyExchange;
    @JsonProperty("banner")
    private String banner;
    @JsonProperty("key_exchange")
    private KeyExchange keyExchange;
    @JsonProperty("server_id")
    private ServerId serverId;
    @JsonProperty("algorithm_selection")
    private AlgorithmSelection algorithmSelection;

    @JsonProperty("userauth")
    public List<String> getUserauth() {
        return userauth;
    }

    @JsonProperty("userauth")
    public void setUserauth(List<String> userauth) {
        this.userauth = userauth;
    }

    @JsonProperty("server_key_exchange")
    public ServerKeyExchange getServerKeyExchange() {
        return serverKeyExchange;
    }

    @JsonProperty("server_key_exchange")
    public void setServerKeyExchange(ServerKeyExchange serverKeyExchange) {
        this.serverKeyExchange = serverKeyExchange;
    }

    @JsonProperty("banner")
    public String getBanner() {
        return banner;
    }

    @JsonProperty("banner")
    public void setBanner(String banner) {
        this.banner = banner;
    }

    @JsonProperty("key_exchange")
    public KeyExchange getKeyExchange() {
        return keyExchange;
    }

    @JsonProperty("key_exchange")
    public void setKeyExchange(KeyExchange keyExchange) {
        this.keyExchange = keyExchange;
    }

    @JsonProperty("server_id")
    public ServerId getServerId() {
        return serverId;
    }

    @JsonProperty("server_id")
    public void setServerId(ServerId serverId) {
        this.serverId = serverId;
    }

    @JsonProperty("algorithm_selection")
    public AlgorithmSelection getAlgorithmSelection() {
        return algorithmSelection;
    }

    @JsonProperty("algorithm_selection")
    public void setAlgorithmSelection(AlgorithmSelection algorithmSelection) {
        this.algorithmSelection = algorithmSelection;
    }

}
