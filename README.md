# Netlas java
Netlas.io Java library

[![GitHub license](https://img.shields.io/github/license/michael2to3/netlas-java)](https://github.com/michael2to3/netlas-java/blob/master/LICENSE)
[![GitHub release](https://img.shields.io/github/release/michael2to3/netlas-java.svg)](https://GitHub.com/michael2to3/netlas-java/releases/)
[![GitHub tag](https://img.shields.io/github/tag/michael2to3/netlas-java.svg)](https://GitHub.com/michael2to3/netlas-java/tags/)
[![GitHub issues](https://img.shields.io/github/issues/michael2to3/netlas-java.svg)](https://GitHub.com/michael2to3/netlas-java/issues/)
[![GitHub pull-requests](https://img.shields.io/github/issues-pr/michael2to3/netlas-java.svg)](https://GitHub.com/michael2to3/netlas-java/pull/)
![Build Status](https://img.shields.io/github/actions/workflow/status/michael2to3/netlas-java/build.yml?branch=main)
[![](https://jitpack.io/v/michael2to3/netlas-java.svg)](https://jitpack.io/#michael2to3/netlas-java)
[![Codecov](https://img.shields.io/codecov/c/github/michael2to3/netlas-java)](https://codecov.io/gh/michael2to3/netlas-java)

This Java library is designed to interact with the Netlas API, allowing you to easily search for certificates, domains, and WHOIS information. It requires an API key, and makes use of the following dependencies:

- [Gradle](https://gradle.org/) - for building and managing the project
- [JUnit Jupiter](https://junit.org/) - for unit testing
- [Fasterxml Jackson](https://fasterxml.github.io/jackson-databind/) - for JSON parsing
- [OkHttp3](https://square.github.io/okhttp/) - for making HTTP requests

## Installation

To use this library, you'll need to add it as a dependency to your Gradle project. You can do this by adding the following to your `build.gradle` file:

```groovy
dependencies {
  implementation 'net.netlas:java-client:1.0.0'
}
```

Replace `1.0.0` with the desired version of the library.
## Usage

First, you'll need to create an instance of the Netlas class with your API key and the base URL of the Netlas API. You can also enable debugging by passing true as the third argument.

```java
Netlas netlas = new Netlas("YOUR_API_KEY", "https://api.netlas.io", false);
```
Once you have a `Netlas` instance, you can use its methods to search for information:

```java

// Search for certificate information
String response = netlas.search("example.com", "cert", 1, null, null, false);

// Search for domain information
String response = netlas.search("example.com", "domain", 1, null, null, false);

// Search for WHOIS information for an IP address
String response = netlas.search("8.8.8.8", "whois-ip", 1, null, null, false);

// Search for WHOIS information for a domain
String response = netlas.search("example.com", "whois-domain", 1, null, null, false);
```

## Testing

This library includes unit tests using JUnit Jupiter. You can run the tests by executing the following Gradle command:

```bash
./gradlew test
```

## Exceptions

This library throws an `APIException` when an error occurs while sending an HTTP request. You should handle this exception appropriately in your code.

## License

This project is licensed under the License - see the [LICENSE](https://github.com/michael2to3/netlas-java) file for details.
