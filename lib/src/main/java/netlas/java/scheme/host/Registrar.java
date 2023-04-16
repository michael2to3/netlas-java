package netlas.java.scheme.host;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "referral_url",
    "name",
    "id"
})
public class Registrar {

    @JsonProperty("referral_url")
    private String referralUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("id")
    private String id;

    @JsonProperty("referral_url")
    public String getReferralUrl() {
        return referralUrl;
    }

    @JsonProperty("referral_url")
    public void setReferralUrl(String referralUrl) {
        this.referralUrl = referralUrl;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}
