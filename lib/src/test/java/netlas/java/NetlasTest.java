package netlas.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import netlas.java.datatype.DataType;
import netlas.java.exception.NetlasRequestException;
import netlas.java.scheme.CertificateResponse;
import netlas.java.scheme.Count;
import netlas.java.scheme.DnsResponse;
import netlas.java.scheme.Host;
import netlas.java.scheme.Stat;
import netlas.java.scheme.WhoisResponse;
import netlas.java.scheme.indices.Index;
import netlas.java.scheme.profile.Profile;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class NetlasTest {
  private Netlas netlas;
  private Netlas netApi;
  private String apiKey;
  private boolean hasApi = false;

  @Mock private OkHttpClient mockClient;
  @Mock private Response mockResponse;
  @Mock private ResponseBody mockResponseBody;
  @Mock private Call mockCall;
  @Captor private ArgumentCaptor<Request> requestCaptor;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
    netlas = new Netlas("testApiKey", "https://app.netlas.io");
    netlas.setClient(mockClient);

    apiKey = System.getenv("API_KEY");
    if (apiKey != null) {
      hasApi = true;
      netApi = Netlas.newBuilder().setApiKey(apiKey).build();
    }
  }

  @Test
  void testIndices() throws IOException, NetlasRequestException {
    String indicesJson =
        "[{\"id\":1,\"name\":\"test_name\",\"scan_started_dt\":\"2023-04-15T00:00:00.000Z\",\"scan_ended_dt\":\"2023-04-15T00:00:00.000Z\",\"is_default\":true,\"speed\":\"test_speed\",\"state\":\"test_state\",\"type\":\"test_type\",\"count\":100}]";
    when(mockResponseBody.string()).thenReturn(indicesJson);
    when(mockResponseBody.contentType()).thenReturn(MediaType.parse("application/json"));
    when(mockResponse.body()).thenReturn(mockResponseBody);
    when(mockResponse.isSuccessful()).thenReturn(true);
    when(mockResponse.protocol()).thenReturn(Protocol.HTTP_1_1);
    when(mockResponse.code()).thenReturn(200);
    when(mockClient.newCall(any(Request.class))).thenReturn(mockCall);
    when(mockCall.execute()).thenReturn(mockResponse);

    List<Index> indices = netlas.indices();

    ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
    verify(mockClient).newCall(requestCaptor.capture());
    Request request = requestCaptor.getValue();

    assertEquals("https://app.netlas.io/api/indices/", request.url().toString());
    assertEquals("application/json", request.header("Content-Type"));
    assertEquals("testApiKey", request.header("X-Api-Key"));

    assertEquals(1, indices.size());
    assertEquals(Integer.valueOf(1), indices.get(0).getId());
    assertEquals("test_name", indices.get(0).getName());
    assertEquals("2023-04-15T00:00:00.000Z", indices.get(0).getScanStartedDt());
    assertEquals("2023-04-15T00:00:00.000Z", indices.get(0).getScanEndedDt());
    assertTrue(indices.get(0).getIsDefault());
    assertEquals("test_speed", indices.get(0).getSpeed());
    assertEquals("test_state", indices.get(0).getState());
    assertEquals("test_type", indices.get(0).getType());
    assertEquals(Integer.valueOf(100), indices.get(0).getCount());
  }

  private static final String COUNT_JSON = "{\"count\":100}";

  @Test
  void testProfile() throws IOException, NetlasRequestException {
    String profileJson =
        "{\"id\": 6667, \"api_key\": {\"customer_api_key\": \"ABC\","
            + " \"next_time_coins_will_be_updated\": \"2029-32-19\"}, \"email\":"
            + " \"some@thing.com\", \"profession\": \"Student\", \"usage_purpose\":"
            + " \"Bug-bounty jobs, Gathering information before penetration test\","
            + " \"is_welcome_tour_passed\": true, \"plan\": {\"id\": 7, \"name\": \"Educational"
            + " 1\", \"active_until\": \"2099-10-20\", \"limit_per_one_download\": 1000000,"
            + " \"coins\": 25000000, \"is_free\": true, \"exclude_from_results\": {\"certs\": [],"
            + " \"domains\": [], \"host_ip\": [\"*.contacts\", \"abuse\"], \"whois_ip\":"
            + " [\"*.contacts\", \"*.email\", \"*.phone\", \"abuse\", \"raw\"], \"responses\":"
            + " [\"*.contacts\", \"whois.abuse\"], \"host_domain\": [\"*.contacts\", \"*.email\","
            + " \"*.fax\", \"*.fax_ext\", \"*.phone\", \"*.phone_ext\"], \"whois_domains\":"
            + " [\"*.contacts\", \"*.email\", \"*.fax\", \"*.fax_ext\", \"*.phone\","
            + " \"*.phone_ext\", \"raw\"]}}, \"next_plan\": {\"id\": 2, \"name\": \"Educational"
            + " 1\"}, \"is_next_plan_paid\": false, \"subscription_reminder_period\": \"2\","
            + " \"referral_code\": \"9921sa38\", \"bonuses\": 0, \"is_authenticated_via_social\":"
            + " false, \"referral_link_usage_amount\": 0}";
    mockResponse(profileJson);

    Profile profile = netlas.profile();

    verifyRequest("https://app.netlas.io/api/users/current/");

    assertEquals(Integer.valueOf(6667), profile.getId());
    assertEquals("some@thing.com", profile.getEmail());
    assertEquals("Student", profile.getProfession());
    assertEquals(
        "Bug-bounty jobs, Gathering information before penetration test",
        profile.getUsagePurpose());
    assertTrue(profile.getIsWelcomeTourPassed());
    assertNotNull(profile.getPlan());
    assertNotNull(profile.getNextPlan());
    assertFalse(profile.getIsNextPlanPaid());
    assertEquals("2", profile.getSubscriptionReminderPeriod());
    assertEquals("9921sa38", profile.getReferralCode());
    assertEquals(Integer.valueOf(0), profile.getBonuses());
    assertFalse(profile.getIsAuthenticatedViaSocial());
    assertEquals(Integer.valueOf(0), profile.getReferralLinkUsageAmount());
  }

  @Test
  void testHost() throws IOException, NetlasRequestException {
    String hostJson =
        "{\"related_domains_count\":10,\"related_domains\":[\"example1.com\",\"example2.com\"],\"dns\":{\"a\":[\"192.0.2.1\"]},\"whois\":{\"server\":\"whois.example.com\",\"created_date\":\"2023-04-15T00:00:00.000Z\"},\"related_domains_query\":\"query\",\"domain\":\"example.com\",\"type\":\"test_type\"}";
    mockResponse(hostJson);

    Host host = netlas.host("example.com/", null, false);

    sameRequest("https://app.netlas.io/api/host/example.com/");

    assertEquals(Integer.valueOf(10), host.getRelatedDomainsCount());
    assertEquals(Arrays.asList("example1.com", "example2.com"), host.getRelatedDomains());
    assertNotNull(host.getDns());
    assertEquals(Arrays.asList("192.0.2.1"), host.getDns().getA());
    assertNotNull(host.getWhois());
    assertEquals("whois.example.com", host.getWhois().getServer());
    assertEquals("2023-04-15T00:00:00.000Z", host.getWhois().getCreatedDate());
    assertEquals("query", host.getRelatedDomainsQuery());
    assertEquals("example.com", host.getDomain());
    assertEquals("test_type", host.getType());
  }

  @Test
  void testCount() throws IOException, NetlasRequestException {
    mockResponse(COUNT_JSON);

    Count count = netlas.count("test_query", DataType.RESPONSE, "");

    verifyRequest("https://app.netlas.io/api/responses_count/?q=test_query&indices=");

    assertEquals(100, count.getCount());
  }

  @Test
  void testStat() throws IOException, NetlasRequestException {
    String statJson =
        "{\"took\":100,\"aggregations\":[{\"key\":[\"test_key\"],\"key_as_string\":\"test_key_as_string\",\"doc_count\":100}]}";
    mockResponse(statJson);

    Stat stat = netlas.stat("test_query", "test_fields", "", 10, "test_index_type");

    verifyRequest(
        "https://app.netlas.io/api/stat/?q=test_query&fields=test_fields&indices=&size=10&index_type=test_index_type");

    assertEquals(Integer.valueOf(100), stat.getTook());
    assertEquals(1, stat.getAggregations().size());
    assertEquals(Arrays.asList("test_key"), stat.getAggregations().get(0).getKey());
    assertEquals("test_key_as_string", stat.getAggregations().get(0).getKeyAsString());
    assertEquals(Integer.valueOf(100), stat.getAggregations().get(0).getDocCount());
  }

  private void mockResponse(String responseBodyJson) throws IOException {
    when(mockResponseBody.string()).thenReturn(responseBodyJson);
    when(mockResponseBody.contentType()).thenReturn(MediaType.parse("application/json"));
    when(mockResponse.body()).thenReturn(mockResponseBody);
    when(mockResponse.isSuccessful()).thenReturn(true);
    when(mockResponse.protocol()).thenReturn(Protocol.HTTP_1_1);
    when(mockResponse.code()).thenReturn(200);

    Call mockCall = mock(Call.class);
    when(mockCall.execute()).thenReturn(mockResponse);
    when(mockClient.newCall(any(Request.class))).thenReturn(mockCall);
  }

  private void sameRequest(String expectedUrl) {
    ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
    verify(mockClient).newCall(requestCaptor.capture());
    Request request = requestCaptor.getValue();

    assertTrue(request.url().toString().contains(expectedUrl));
    assertEquals("application/json", request.header("Content-Type"));
    assertEquals("testApiKey", request.header("X-Api-Key"));
  }

  private void verifyRequest(String expectedUrl) {
    ArgumentCaptor<Request> requestCaptor = ArgumentCaptor.forClass(Request.class);
    verify(mockClient).newCall(requestCaptor.capture());
    Request request = requestCaptor.getValue();

    assertEquals(expectedUrl, request.url().toString());
    assertEquals("application/json", request.header("Content-Type"));
    assertEquals("testApiKey", request.header("X-Api-Key"));
  }

  @Test
  void testDownload() throws IOException, NetlasRequestException, InterruptedException {
    MockWebServer mockWebServer = new MockWebServer();
    mockWebServer.start();

    MockResponse mockResponse = new MockResponse().setResponseCode(200).setBody("test data");
    mockWebServer.enqueue(mockResponse);

    Netlas netlas =
        Netlas.newBuilder()
            .setClient(new OkHttpClient())
            .setApiKey("test")
            .setApiBase(mockWebServer.url("/").toString())
            .build();

    InputStream result =
        netlas.download("query", "fields", false, DataType.RESPONSE, 10, "indices");
    assertNotNull(result);

    byte[] buffer = new byte[1024];
    int readBytes = result.read(buffer);
    assertEquals("test data", new String(buffer, 0, readBytes));

    RecordedRequest recordedRequest = mockWebServer.takeRequest();
    assertTrue(recordedRequest.getPath().startsWith("//api/responses/download/"));

    mockWebServer.shutdown();
  }

  @Test
  void responseTest() throws IOException, NetlasRequestException {
    String responseBody = "{\"items\": [], \"took\": 57, \"timestamp\": 1681651426}";
    okhttp3.Response mockedResponse =
        new okhttp3.Response.Builder()
            .code(200)
            .message("OK")
            .request(new okhttp3.Request.Builder().url("http://localhost").build())
            .protocol(okhttp3.Protocol.HTTP_1_1)
            .body(
                okhttp3.ResponseBody.create(
                    responseBody, okhttp3.MediaType.get("application/json")))
            .build();

    when(mockClient.newCall(any(okhttp3.Request.class))).thenReturn(mockCall);
    when(mockCall.execute()).thenReturn(mockedResponse);

    var response = netlas.response("test_query", 0, "test_indices", "test_fields", false);

    assertNotNull(response);
    assertEquals(57, response.getTook());

    verify(mockClient).newCall(requestCaptor.capture());
    String url = requestCaptor.getValue().url().toString();
    assertNotNull(url);
    assertTrue(!url.isEmpty());
    assertTrue(url.equals(url.toLowerCase()));
  }

  @Test
  void testWithApi() throws IOException, NetlasRequestException {
    if (!hasApi) {
      return;
    }

    List<Integer> status = Arrays.asList(200, 301, 302, 404);
    String[] domains = {
      "google.com",
      "fadich.com",
      "vk.com",
      "ya.ru",
      "1.1.1.1",
      "facebook.com",
      "reddit.com",
      "yandex.ru",
      "mail.ru",
    };

    for (String domain : domains) {
      netlas.java.scheme.Response resp = netApi.response("host:" + domain, 0, null, null, false);
      try {
        assertTrue(status.contains(resp.getItems().get(0).getData().getHttp().getStatusCode()));
      } catch (IndexOutOfBoundsException e) {
        throw new AssertionError("domain: " + domain + " not found", e);
      }
    }
  }

  @Test
  void apiDownload() throws IOException, NetlasRequestException {
    if (!hasApi) {
      return;
    }

    String query = "host:vk.com";
    String fields = "host,ip";
    boolean excludeFields = false;
    DataType datatype = DataType.RESPONSE;
    int size = 10;
    String indices = null;

    InputStream inputStream =
        netApi.download(query, fields, excludeFields, datatype, size, indices);

    List<Map<String, String>> data = new ArrayList<>();
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);

    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    String line;
    while ((line = reader.readLine()) != null) {
      ObjectNode objectNode = objectMapper.readValue(line, ObjectNode.class);
      Map<String, String> dataEntry = objectMapper.convertValue(objectNode.get("data"), Map.class);
      data.add(dataEntry);
    }

    for (Map<String, String> entry : data) {
      assertEquals("vk.com", entry.get("host"));
    }
  }

  @Test
  void apiCert() throws IOException, NetlasRequestException {
    if (!hasApi) {
      return;
    }

    CertificateResponse cert = netApi.cert("google.com", 0, null, null, false);
    cert = netApi.cert("ya.ru", 0, null, null, false);
    cert = netApi.cert("1.1.1.1", 0, null, null, false);
    cert = netApi.cert("vk.com", 0, null, null, false);
    cert = netApi.cert("vk.com", 0, null, null, false);
    assertEquals(cert.getItems().get(0).getData().getCertificate().getNames().get(0), "*.vk.com");
  }

  @Test
  void apiWhois() throws IOException, NetlasRequestException {
    if (!hasApi) {
      return;
    }

    WhoisResponse who = netApi.whoisIp("ya.ru", 0, null, null, false);
    who = netApi.whoisDomain("1.1.1.1", 0, null, null, false);
    who = netApi.whoisDomain("google.com", 0, null, null, false);
    who = netApi.whoisDomain("reddit.com", 0, null, null, false);
    who = netApi.whoisDomain("netlas.io", 0, null, null, false);
    who = netApi.whoisDomain("vk.com", 0, null, null, false);
    who = netApi.whoisIp("1.1.1.1", 0, null, null, false);
    who = netApi.whoisIp("google.com", 0, null, null, false);
    who = netApi.whoisIp("reddit.com", 0, null, null, false);
    who = netApi.whoisIp("netlas.io", 0, null, null, false);
    who = netApi.whoisIp("facebook.com", 0, null, null, false);
    who = netApi.whoisIp("vk.com", 0, null, null, false);
    assertEquals(who.getItems().get(0).getData().getAsn().getCountry(), "RU");
  }

  @Test
  void apiDomain() throws IOException, NetlasRequestException {
    if (!hasApi) {
      return;
    }

    DnsResponse dns = netApi.domain("ya.ru", 0, null, null, false);
    dns = netApi.domain("1.1.1.1", 0, null, null, false);
    dns = netApi.domain("google.com", 0, null, null, false);
    dns = netApi.domain("reddit.com", 0, null, null, false);
    dns = netApi.domain("netlas.io", 0, null, null, false);
    dns = netApi.domain("vk.com", 0, null, null, false);
    assertEquals(dns.getItems().get(0).getData().getDomain(), "vk.com");
  }
}
