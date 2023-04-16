package netlas.java.scheme.profile;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"customer_api_key", "next_time_coins_will_be_updated"})
public class ApiKey {

  @JsonProperty("customer_api_key")
  private String customerApiKey;

  @JsonProperty("next_time_coins_will_be_updated")
  private String nextTimeCoinsWillBeUpdated;

  @JsonProperty("customer_api_key")
  public String getCustomerApiKey() {
    return customerApiKey;
  }

  @JsonProperty("customer_api_key")
  public void setCustomerApiKey(String customerApiKey) {
    this.customerApiKey = customerApiKey;
  }

  @JsonProperty("next_time_coins_will_be_updated")
  public String getNextTimeCoinsWillBeUpdated() {
    return nextTimeCoinsWillBeUpdated;
  }

  @JsonProperty("next_time_coins_will_be_updated")
  public void setNextTimeCoinsWillBeUpdated(String nextTimeCoinsWillBeUpdated) {
    this.nextTimeCoinsWillBeUpdated = nextTimeCoinsWillBeUpdated;
  }
}
