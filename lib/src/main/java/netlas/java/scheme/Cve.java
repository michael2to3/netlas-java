package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "severity",
    "base_score",
    "name",
    "description",
    "has_exploit",
    "exploit_links"
})
public class Cve {

    @JsonProperty("severity")
    private String severity;
    @JsonProperty("base_score")
    private String baseScore;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("has_exploit")
    private Boolean hasExploit;
    @JsonProperty("exploit_links")
    private List<String> exploitLinks = new ArrayList<String>();

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("base_score")
    public String getBaseScore() {
        return baseScore;
    }

    @JsonProperty("base_score")
    public void setBaseScore(String baseScore) {
        this.baseScore = baseScore;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("has_exploit")
    public Boolean getHasExploit() {
        return hasExploit;
    }

    @JsonProperty("has_exploit")
    public void setHasExploit(Boolean hasExploit) {
        this.hasExploit = hasExploit;
    }

    @JsonProperty("exploit_links")
    public List<String> getExploitLinks() {
        return exploitLinks;
    }

    @JsonProperty("exploit_links")
    public void setExploitLinks(List<String> exploitLinks) {
        this.exploitLinks = exploitLinks;
    }

}
