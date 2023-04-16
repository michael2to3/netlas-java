package netlas.java.scheme;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country",
    "address",
    "created",
    "description",
    "range",
    "handle",
    "name",
    "start_ip",
    "cidr",
    "net_size",
    "updated",
    "end_ip",
    "remarks"
})
public class RelatedNet {

    @JsonProperty("country")
    private String country;
    @JsonProperty("address")
    private String address;
    @JsonProperty("created")
    private String created;
    @JsonProperty("description")
    private String description;
    @JsonProperty("range")
    private String range;
    @JsonProperty("handle")
    private String handle;
    @JsonProperty("name")
    private String name;
    @JsonProperty("start_ip")
    private String startIp;
    @JsonProperty("cidr")
    private List<String> cidr = new ArrayList<String>();
    @JsonProperty("net_size")
    private Integer netSize;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("end_ip")
    private String endIp;
    @JsonProperty("remarks")
    private String remarks;

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("start_ip")
    public String getStartIp() {
        return startIp;
    }

    @JsonProperty("start_ip")
    public void setStartIp(String startIp) {
        this.startIp = startIp;
    }

    @JsonProperty("cidr")
    public List<String> getCidr() {
        return cidr;
    }

    @JsonProperty("cidr")
    public void setCidr(List<String> cidr) {
        this.cidr = cidr;
    }

    @JsonProperty("net_size")
    public Integer getNetSize() {
        return netSize;
    }

    @JsonProperty("net_size")
    public void setNetSize(Integer netSize) {
        this.netSize = netSize;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("end_ip")
    public String getEndIp() {
        return endIp;
    }

    @JsonProperty("end_ip")
    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}
