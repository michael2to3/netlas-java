package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first_kex_follows",
    "client_to_server_compression",
    "server_to_client_macs",
    "client_to_server_macs",
    "cookie",
    "reserved",
    "host_key_algorithms",
    "client_to_server_ciphers",
    "server_to_client_ciphers",
    "server_to_client_compression",
    "kex_algorithms"
})
public class ServerKeyExchange {

    @JsonProperty("first_kex_follows")
    private Boolean firstKexFollows;
    @JsonProperty("client_to_server_compression")
    private List<String> clientToServerCompression = new ArrayList<String>();
    @JsonProperty("server_to_client_macs")
    private List<String> serverToClientMacs = new ArrayList<String>();
    @JsonProperty("client_to_server_macs")
    private List<String> clientToServerMacs = new ArrayList<String>();
    @JsonProperty("cookie")
    private String cookie;
    @JsonProperty("reserved")
    private Integer reserved;
    @JsonProperty("host_key_algorithms")
    private List<String> hostKeyAlgorithms = new ArrayList<String>();
    @JsonProperty("client_to_server_ciphers")
    private List<String> clientToServerCiphers = new ArrayList<String>();
    @JsonProperty("server_to_client_ciphers")
    private List<String> serverToClientCiphers = new ArrayList<String>();
    @JsonProperty("server_to_client_compression")
    private List<String> serverToClientCompression = new ArrayList<String>();
    @JsonProperty("kex_algorithms")
    private List<String> kexAlgorithms = new ArrayList<String>();

    @JsonProperty("first_kex_follows")
    public Boolean getFirstKexFollows() {
        return firstKexFollows;
    }

    @JsonProperty("first_kex_follows")
    public void setFirstKexFollows(Boolean firstKexFollows) {
        this.firstKexFollows = firstKexFollows;
    }

    @JsonProperty("client_to_server_compression")
    public List<String> getClientToServerCompression() {
        return clientToServerCompression;
    }

    @JsonProperty("client_to_server_compression")
    public void setClientToServerCompression(List<String> clientToServerCompression) {
        this.clientToServerCompression = clientToServerCompression;
    }

    @JsonProperty("server_to_client_macs")
    public List<String> getServerToClientMacs() {
        return serverToClientMacs;
    }

    @JsonProperty("server_to_client_macs")
    public void setServerToClientMacs(List<String> serverToClientMacs) {
        this.serverToClientMacs = serverToClientMacs;
    }

    @JsonProperty("client_to_server_macs")
    public List<String> getClientToServerMacs() {
        return clientToServerMacs;
    }

    @JsonProperty("client_to_server_macs")
    public void setClientToServerMacs(List<String> clientToServerMacs) {
        this.clientToServerMacs = clientToServerMacs;
    }

    @JsonProperty("cookie")
    public String getCookie() {
        return cookie;
    }

    @JsonProperty("cookie")
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    @JsonProperty("reserved")
    public Integer getReserved() {
        return reserved;
    }

    @JsonProperty("reserved")
    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    @JsonProperty("host_key_algorithms")
    public List<String> getHostKeyAlgorithms() {
        return hostKeyAlgorithms;
    }

    @JsonProperty("host_key_algorithms")
    public void setHostKeyAlgorithms(List<String> hostKeyAlgorithms) {
        this.hostKeyAlgorithms = hostKeyAlgorithms;
    }

    @JsonProperty("client_to_server_ciphers")
    public List<String> getClientToServerCiphers() {
        return clientToServerCiphers;
    }

    @JsonProperty("client_to_server_ciphers")
    public void setClientToServerCiphers(List<String> clientToServerCiphers) {
        this.clientToServerCiphers = clientToServerCiphers;
    }

    @JsonProperty("server_to_client_ciphers")
    public List<String> getServerToClientCiphers() {
        return serverToClientCiphers;
    }

    @JsonProperty("server_to_client_ciphers")
    public void setServerToClientCiphers(List<String> serverToClientCiphers) {
        this.serverToClientCiphers = serverToClientCiphers;
    }

    @JsonProperty("server_to_client_compression")
    public List<String> getServerToClientCompression() {
        return serverToClientCompression;
    }

    @JsonProperty("server_to_client_compression")
    public void setServerToClientCompression(List<String> serverToClientCompression) {
        this.serverToClientCompression = serverToClientCompression;
    }

    @JsonProperty("kex_algorithms")
    public List<String> getKexAlgorithms() {
        return kexAlgorithms;
    }

    @JsonProperty("kex_algorithms")
    public void setKexAlgorithms(List<String> kexAlgorithms) {
        this.kexAlgorithms = kexAlgorithms;
    }

}
