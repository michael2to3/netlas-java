package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "major",
    "minor",
    "name"
})
public class HttpVersion {

    @JsonProperty("major")
    private Integer major;
    @JsonProperty("minor")
    private Integer minor;
    @JsonProperty("name")
    private String name;

    @JsonProperty("major")
    public Integer getMajor() {
        return major;
    }

    @JsonProperty("major")
    public void setMajor(Integer major) {
        this.major = major;
    }

    @JsonProperty("minor")
    public Integer getMinor() {
        return minor;
    }

    @JsonProperty("minor")
    public void setMinor(Integer minor) {
        this.minor = minor;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
