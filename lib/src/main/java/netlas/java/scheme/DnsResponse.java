package netlas.java.scheme;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DnsResponse extends ResponseGeneric<DnsItem> {}
