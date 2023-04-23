package netlas.java.datatype;

public enum DataType {
  RESPONSE("responses"),
  STAT("stat"),
  COUNT("count"),
  PROFILE("profile"),
  WHOIS_IP("whois_ip"),
  WHOIS_DOMAIN("whois_domains"),
  CERT("certs"),
  DOMAIN("domains");

  private final String value;

  DataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
