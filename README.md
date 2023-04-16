# Netlas Java Library

[![GitHub license](https://img.shields.io/github/license/michael2to3/netlas-java)](https://github.com/michael2to3/netlas-java/blob/master/LICENSE)
[![GitHub issues](https://img.shields.io/github/issues/michael2to3/netlas-java.svg)](https://GitHub.com/michael2to3/netlas-java/issues/)
![Build Status](https://img.shields.io/github/actions/workflow/status/michael2to3/netlas-java/build.yml?branch=main)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/db5aeb5920234d20a4951f85c9171e9d)](https://app.codacy.com/gh/michael2to3/netlas-java/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/db5aeb5920234d20a4951f85c9171e9d)](https://app.codacy.com/gh/michael2to3/netlas-java/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_coverage)
[![](https://jitpack.io/v/michael2to3/netlas-java.svg)](https://jitpack.io/#michael2to3/netlas-java)

This Java library is designed to interact with the Netlas API, allowing you to easily search for certificates, domains, and WHOIS information. It requires an API key, and makes use of the following dependencies:

- [Gradle](https://gradle.org/) - for building and managing the project
- [JUnit Jupiter](https://junit.org/) - for unit testing
- [Fasterxml Jackson](https://fasterxml.github.io/jackson-databind/) - for JSON parsing
- [OkHttp3](https://square.github.io/okhttp/) - for making HTTP requests

## Installation

To use this library, you'll need to add it as a dependency to your Gradle project. You can do this by adding the following to your `build.gradle` file:

```groovy
dependencies {
  implementation 'com.michael2to3:netlas:VERSION'
}
```

Replace `VERSION` with the desired version of the library.

## Usage

First, create an instance of the `Netlas` class with your API key and the base URL of the Netlas API.

```java
Netlas netlas = new Netlas("YOUR_API_KEY", "https://api.netlas.io");
```

Once you have a `Netlas` instance, you can use its methods to search for information:

```java
// Search for certificate information
netlas.java.scheme.Response response = netlas.search("example.com", DataType.CERT, 1, null, null, false);

// Search for domain information
netlas.java.scheme.Response response = netlas.search("example.com", DataType.DOMAIN, 1, null, null, false);

// Search for WHOIS information for an IP address
netlas.java.scheme.Response response = netlas.search("8.8.8.8", DataType.WHOIS_IP, 1, null, null, false);

// Search for WHOIS information for a domain
netlas.java.scheme.Response response = netlas.search("example.com", DataType.WHOIS_DOMAIN, 1, null, null, false);
```

## Important Notice: GitHub Packages now requires authentication for all package downloads

Starting on November 12, 2021, GitHub Packages requires authentication for all package downloads, even public packages. This means that you will need to authenticate with a personal access token (PAT) to download any packages from this repository.

To authenticate with a PAT and use GitHub Packages, please follow the steps outlined in the GitHub documentation:

Generate a personal access token with the appropriate permissions.
Add your personal access token to your Maven settings.xml file.
Configure your build to use your personal access token for authentication.
For more information on how to authenticate with a PAT and use GitHub Packages, please see the GitHub documentation: [https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry)

## Testing

This library includes unit tests using JUnit Jupiter. You can run the tests by executing the following Gradle command:

```bash
./gradlew test
```

## Exceptions

This library throws a `NetlasRequestException` when an error occurs while sending an HTTP request. You should handle this exception appropriately in your code.

## License

This project is licensed under the License - see the [LICENSE](https://github.com/michael2to3/netlas-java/blob/master/LICENSE) file.
