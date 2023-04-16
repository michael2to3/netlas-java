package netlas.java.scheme.host;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "a",
    "txt",
    "level",
    "ns",
    "zone"
})
public class Dns {

    @JsonProperty("a")
    private List<String> a = new ArrayList<String>();
    @JsonProperty("txt")
    private List<String> txt = new ArrayList<String>();
    @JsonProperty("level")
    private Integer level;
    @JsonProperty("ns")
    private List<String> ns = new ArrayList<String>();
    @JsonProperty("zone")
    private String zone;

    @JsonProperty("a")
    public List<String> getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(List<String> a) {
        this.a = a;
    }

    @JsonProperty("txt")
    public List<String> getTxt() {
        return txt;
    }

    @JsonProperty("txt")
    public void setTxt(List<String> txt) {
        this.txt = txt;
    }

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("ns")
    public List<String> getNs() {
        return ns;
    }

    @JsonProperty("ns")
    public void setNs(List<String> ns) {
        this.ns = ns;
    }

    @JsonProperty("zone")
    public String getZone() {
        return zone;
    }

    @JsonProperty("zone")
    public void setZone(String zone) {
        this.zone = zone;
    }

}