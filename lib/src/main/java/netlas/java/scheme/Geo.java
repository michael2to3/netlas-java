package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "continent",
    "country",
    "city",
    "tz",
    "location",
    "postal",
    "subdivisions"
})
public class Geo {

    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("tz")
    private String tz;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("postal")
    private String postal;
    @JsonProperty("subdivisions")
    private List<String> subdivisions = new ArrayList<String>();

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("tz")
    public String getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(String tz) {
        this.tz = tz;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("postal")
    public String getPostal() {
        return postal;
    }

    @JsonProperty("postal")
    public void setPostal(String postal) {
        this.postal = postal;
    }

    @JsonProperty("subdivisions")
    public List<String> getSubdivisions() {
        return subdivisions;
    }

    @JsonProperty("subdivisions")
    public void setSubdivisions(List<String> subdivisions) {
        this.subdivisions = subdivisions;
    }

}
