package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "software",
    "raw",
    "comment",
    "version"
})
public class ServerId {

    @JsonProperty("software")
    private String software;
    @JsonProperty("raw")
    private String raw;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("version")
    private String version;

    @JsonProperty("software")
    public String getSoftware() {
        return software;
    }

    @JsonProperty("software")
    public void setSoftware(String software) {
        this.software = software;
    }

    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

}
