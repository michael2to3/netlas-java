package netlas.java;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NetlasTest {

    private Netlas netlas;
    final private String API_KEY = System.getenv("API_KEY");

    @BeforeEach
    void setUp() {
        assertNotNull(API_KEY);
        assertNotEquals(0, API_KEY.length());
        netlas = new Netlas(API_KEY);
    }

    @Test
    void testGetApiKey() {
        assertEquals(API_KEY, netlas.getApiKey());
    }

    @Test
    void testGetApiBase() {
        assertEquals("https://app.netlas.io", netlas.getApiBase());
    }

    @Test
    void testIsDebug() {
        assertFalse(netlas.isDebug());
    }

    @Test
    void testGetConnectionTimeout() {
        assertEquals(120, netlas.getConnectionTimeout());
    }

    @Test
    void testGetClient() {
        assertNotNull(netlas.getClient());
    }

    @ParameterizedTest
    @CsvSource({
            "response, port:7001",
            "cert, certificate.subject.country:US",
            "domain, mx:mail.google.com"
    })
    void testSearch(String dataType, String query) {
        assertDoesNotThrow(() -> netlas.search(query, dataType, 0, null, null, false));
    }

}
