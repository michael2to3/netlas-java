# Netlas java
Netlas.io Java library

[![GitHub license](https://img.shields.io/github/license/michael2to3/netlas-java)](https://github.com/michael2to3/netlas-java/blob/master/LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/michael2to3/netlas-java.svg)](https://GitHub.com/michael2to3/netlas-java/issues/)
![Build Status](https://img.shields.io/github/actions/workflow/status/michael2to3/netlas-java/build.yml?branch=main)
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

### Important Notice: GitHub Packages now requires authentication for all package downloads

Starting on November 12, 2021, GitHub Packages requires authentication for all package downloads, even public packages. This means that you will need to authenticate with a personal access token (PAT) to download any packages from this repository.

To authenticate with a PAT and use GitHub Packages, please follow the steps outlined in the GitHub documentation:

1. Generate a personal access token with the appropriate permissions.
2. Add your personal access token to your Maven settings.xml file.
3. Configure your build to use your personal access token for authentication.

For more information on how to authenticate with a PAT and use GitHub Packages, please see the GitHub documentation: [https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry)


## Testing

This library includes unit tests using JUnit Jupiter. You can run the tests by executing the following Gradle command:

```bash
./gradlew test
```

## Exceptions

This library throws an `APIException` when an error occurs while sending an HTTP request. You should handle this exception appropriately in your code.

## License

This project is licensed under the License - see the [LICENSE](https://github.com/michael2to3/netlas-java) file for details.
