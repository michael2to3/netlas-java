package netlas.java.scheme.profile;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "active_until",
    "limit_per_one_download",
    "coins",
    "is_free",
    "exclude_from_results"
})
public class Plan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("active_until")
    private String activeUntil;
    @JsonProperty("limit_per_one_download")
    private Integer limitPerOneDownload;
    @JsonProperty("coins")
    private Integer coins;
    @JsonProperty("is_free")
    private Boolean isFree;
    @JsonProperty("exclude_from_results")
    private ExcludeFromResults excludeFromResults;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("active_until")
    public String getActiveUntil() {
        return activeUntil;
    }

    @JsonProperty("active_until")
    public void setActiveUntil(String activeUntil) {
        this.activeUntil = activeUntil;
    }

    @JsonProperty("limit_per_one_download")
    public Integer getLimitPerOneDownload() {
        return limitPerOneDownload;
    }

    @JsonProperty("limit_per_one_download")
    public void setLimitPerOneDownload(Integer limitPerOneDownload) {
        this.limitPerOneDownload = limitPerOneDownload;
    }

    @JsonProperty("coins")
    public Integer getCoins() {
        return coins;
    }

    @JsonProperty("coins")
    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    @JsonProperty("is_free")
    public Boolean getIsFree() {
        return isFree;
    }

    @JsonProperty("is_free")
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    @JsonProperty("exclude_from_results")
    public ExcludeFromResults getExcludeFromResults() {
        return excludeFromResults;
    }

    @JsonProperty("exclude_from_results")
    public void setExcludeFromResults(ExcludeFromResults excludeFromResults) {
        this.excludeFromResults = excludeFromResults;
    }

}
