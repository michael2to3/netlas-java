package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NoticeReference {
  @JsonProperty("notice_numbers")
  private List<Integer> noticeNumbers = new ArrayList<Integer>();

  @JsonProperty("organization")
  private String organization;

  public List<Integer> getNoticeNumbers() {
    return noticeNumbers;
  }

  public void setNoticeNumbers(List<Integer> noticeNumbers) {
    this.noticeNumbers = noticeNumbers;
  }

  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }
}
