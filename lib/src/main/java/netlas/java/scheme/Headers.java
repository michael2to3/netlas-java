package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Headers {
  private Map<String, List<String>> headers = new HashMap<>();

  public List<String> getHeader(String key) {
    return headers.get(key);
  }

  public void addHeaderValue(String key, String value) {
    headers.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
  }

  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  @JsonAnySetter
  public void setHeader(String name, List<String> value) {
    headers.put(name, value);
  }
}
