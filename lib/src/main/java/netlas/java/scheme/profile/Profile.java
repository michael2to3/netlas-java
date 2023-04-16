package netlas.java.scheme.profile;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "api_key",
    "email",
    "profession",
    "usage_purpose",
    "is_welcome_tour_passed",
    "plan",
    "next_plan",
    "is_next_plan_paid",
    "subscription_reminder_period",
    "referral_code",
    "bonuses",
    "is_authenticated_via_social",
    "referral_link_usage_amount"
})
public class Profile {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("api_key")
    private ApiKey apiKey;
    @JsonProperty("email")
    private String email;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("usage_purpose")
    private String usagePurpose;
    @JsonProperty("is_welcome_tour_passed")
    private Boolean isWelcomeTourPassed;
    @JsonProperty("plan")
    private Plan plan;
    @JsonProperty("next_plan")
    private NextPlan nextPlan;
    @JsonProperty("is_next_plan_paid")
    private Boolean isNextPlanPaid;
    @JsonProperty("subscription_reminder_period")
    private String subscriptionReminderPeriod;
    @JsonProperty("referral_code")
    private String referralCode;
    @JsonProperty("bonuses")
    private Integer bonuses;
    @JsonProperty("is_authenticated_via_social")
    private Boolean isAuthenticatedViaSocial;
    @JsonProperty("referral_link_usage_amount")
    private Integer referralLinkUsageAmount;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("api_key")
    public ApiKey getApiKey() {
        return apiKey;
    }

    @JsonProperty("api_key")
    public void setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("profession")
    public String getProfession() {
        return profession;
    }

    @JsonProperty("profession")
    public void setProfession(String profession) {
        this.profession = profession;
    }

    @JsonProperty("usage_purpose")
    public String getUsagePurpose() {
        return usagePurpose;
    }

    @JsonProperty("usage_purpose")
    public void setUsagePurpose(String usagePurpose) {
        this.usagePurpose = usagePurpose;
    }

    @JsonProperty("is_welcome_tour_passed")
    public Boolean getIsWelcomeTourPassed() {
        return isWelcomeTourPassed;
    }

    @JsonProperty("is_welcome_tour_passed")
    public void setIsWelcomeTourPassed(Boolean isWelcomeTourPassed) {
        this.isWelcomeTourPassed = isWelcomeTourPassed;
    }

    @JsonProperty("plan")
    public Plan getPlan() {
        return plan;
    }

    @JsonProperty("plan")
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @JsonProperty("next_plan")
    public NextPlan getNextPlan() {
        return nextPlan;
    }

    @JsonProperty("next_plan")
    public void setNextPlan(NextPlan nextPlan) {
        this.nextPlan = nextPlan;
    }

    @JsonProperty("is_next_plan_paid")
    public Boolean getIsNextPlanPaid() {
        return isNextPlanPaid;
    }

    @JsonProperty("is_next_plan_paid")
    public void setIsNextPlanPaid(Boolean isNextPlanPaid) {
        this.isNextPlanPaid = isNextPlanPaid;
    }

    @JsonProperty("subscription_reminder_period")
    public String getSubscriptionReminderPeriod() {
        return subscriptionReminderPeriod;
    }

    @JsonProperty("subscription_reminder_period")
    public void setSubscriptionReminderPeriod(String subscriptionReminderPeriod) {
        this.subscriptionReminderPeriod = subscriptionReminderPeriod;
    }

    @JsonProperty("referral_code")
    public String getReferralCode() {
        return referralCode;
    }

    @JsonProperty("referral_code")
    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    @JsonProperty("bonuses")
    public Integer getBonuses() {
        return bonuses;
    }

    @JsonProperty("bonuses")
    public void setBonuses(Integer bonuses) {
        this.bonuses = bonuses;
    }

    @JsonProperty("is_authenticated_via_social")
    public Boolean getIsAuthenticatedViaSocial() {
        return isAuthenticatedViaSocial;
    }

    @JsonProperty("is_authenticated_via_social")
    public void setIsAuthenticatedViaSocial(Boolean isAuthenticatedViaSocial) {
        this.isAuthenticatedViaSocial = isAuthenticatedViaSocial;
    }

    @JsonProperty("referral_link_usage_amount")
    public Integer getReferralLinkUsageAmount() {
        return referralLinkUsageAmount;
    }

    @JsonProperty("referral_link_usage_amount")
    public void setReferralLinkUsageAmount(Integer referralLinkUsageAmount) {
        this.referralLinkUsageAmount = referralLinkUsageAmount;
    }

}
