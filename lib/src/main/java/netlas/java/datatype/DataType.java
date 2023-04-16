package netlas.java.datatype;

public enum DataType {
  RESPONSES("responses"),
  STAT("stat"),
  COUNT("count"),
  PROFILE("profile");

  private final String value;

  DataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
