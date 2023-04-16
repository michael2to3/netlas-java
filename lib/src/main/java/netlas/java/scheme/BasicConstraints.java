package netlas.java.scheme;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "max_path_len",
    "is_ca"
})
public class BasicConstraints {

    @JsonProperty("max_path_len")
    private Integer maxPathLen;
    @JsonProperty("is_ca")
    private Boolean isCa;

    @JsonProperty("max_path_len")
    public Integer getMaxPathLen() {
        return maxPathLen;
    }

    @JsonProperty("max_path_len")
    public void setMaxPathLen(Integer maxPathLen) {
        this.maxPathLen = maxPathLen;
    }

    @JsonProperty("is_ca")
    public Boolean getIsCa() {
        return isCa;
    }

    @JsonProperty("is_ca")
    public void setIsCa(Boolean isCa) {
        this.isCa = isCa;
    }

}
