package netlas.java;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NetlasTest {

  @Test
  void testSearch() throws APIException {
    String apiKey = System.getenv("API_KEY");
    assertNotNull(apiKey);
    assertNotEquals("", apiKey);

    Netlas netlas = new Netlas(apiKey);

    String query = "https://google.com";
    String datatype = "response";
    int page = 0;
    String indices = "";
    String fields = "";
    boolean excludeFields = false;

    String response = netlas.search(query, datatype, page, indices, fields, excludeFields);

    assertTrue(response.length() > 0);
  }

}
