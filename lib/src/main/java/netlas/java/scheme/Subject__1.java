package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "common_name"
})
public class Subject__1 {

    @JsonProperty("common_name")
    private List<String> commonName = new ArrayList<String>();

    @JsonProperty("common_name")
    public List<String> getCommonName() {
        return commonName;
    }

    @JsonProperty("common_name")
    public void setCommonName(List<String> commonName) {
        this.commonName = commonName;
    }

}
