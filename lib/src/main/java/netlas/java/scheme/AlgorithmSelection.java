package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "server_to_client_alg_group",
    "host_key_algorithm",
    "dh_kex_algorithm",
    "client_to_server_alg_group"
})
public class AlgorithmSelection {

    @JsonProperty("server_to_client_alg_group")
    private ServerToClientAlgGroup serverToClientAlgGroup;
    @JsonProperty("host_key_algorithm")
    private String hostKeyAlgorithm;
    @JsonProperty("dh_kex_algorithm")
    private String dhKexAlgorithm;
    @JsonProperty("client_to_server_alg_group")
    private ClientToServerAlgGroup clientToServerAlgGroup;

    @JsonProperty("server_to_client_alg_group")
    public ServerToClientAlgGroup getServerToClientAlgGroup() {
        return serverToClientAlgGroup;
    }

    @JsonProperty("server_to_client_alg_group")
    public void setServerToClientAlgGroup(ServerToClientAlgGroup serverToClientAlgGroup) {
        this.serverToClientAlgGroup = serverToClientAlgGroup;
    }

    @JsonProperty("host_key_algorithm")
    public String getHostKeyAlgorithm() {
        return hostKeyAlgorithm;
    }

    @JsonProperty("host_key_algorithm")
    public void setHostKeyAlgorithm(String hostKeyAlgorithm) {
        this.hostKeyAlgorithm = hostKeyAlgorithm;
    }

    @JsonProperty("dh_kex_algorithm")
    public String getDhKexAlgorithm() {
        return dhKexAlgorithm;
    }

    @JsonProperty("dh_kex_algorithm")
    public void setDhKexAlgorithm(String dhKexAlgorithm) {
        this.dhKexAlgorithm = dhKexAlgorithm;
    }

    @JsonProperty("client_to_server_alg_group")
    public ClientToServerAlgGroup getClientToServerAlgGroup() {
        return clientToServerAlgGroup;
    }

    @JsonProperty("client_to_server_alg_group")
    public void setClientToServerAlgGroup(ClientToServerAlgGroup clientToServerAlgGroup) {
        this.clientToServerAlgGroup = clientToServerAlgGroup;
    }

}
