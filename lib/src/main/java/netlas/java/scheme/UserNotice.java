package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserNotice {
  @JsonProperty("explicit_text")
  private String explicitText;

  @JsonProperty("notice_reference")
  private List<NoticeReference> noticeReference = new ArrayList<NoticeReference>();

  public String getExplicitText() {
    return explicitText;
  }

  public void setExplicitText(String explicitText) {
    this.explicitText = explicitText;
  }

  public List<NoticeReference> getNoticeReference() {
    return noticeReference;
  }

  public void setNoticeReference(List<NoticeReference> noticeReference) {
    this.noticeReference = noticeReference;
  }
}
