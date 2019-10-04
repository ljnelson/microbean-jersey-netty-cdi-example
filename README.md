# microBean™ Jersey Netty CDI Integration Example Application

[![Build Status](https://travis-ci.com/ljnelson/microbean-jersey-netty-cdi-example.svg?branch=master)](https://travis-ci.com/ljnelson/microbean-jersey-netty-cdi-example)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.ljnelson/microbean-jersey-netty-cdi-example/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.ljnelson/microbean-jersey-netty-cdi-example)

## Overview

The microBean™ Jersey Netty CDI Integration Example Application
project provides a simple example application that demonstrates three
other projects working in concert:

* [microBean™ Jersey Netty
  Integration](https://microbean.github.io/microbean-jersey-netty/)
* [microBean™ Jersey Netty CDI
  Integration](https://microbean.github.io/microbean-jersey-netty-cdi/)
* [microBean™ Jakarta RESTful Web Services CDI
  Integration](https://microbean.github.io/microbean-jaxrs-cdi/)

## Usage and Demonstration

To demonstrate the application, clone this repository, run `mvn
package` and then `java -jar
target/microbean-jersey-netty-example-0.0.4-SNAPSHOT.jar`.

You'll note that all this project defines is a Jakarta RESTful Web
Services `Application` subclass and a root resource class, but it is
run and published at `0.0.0.0` on port `8080`.

You can test the root resource class by running `curl
http://localhost:8080/example/data`.

## Related Projects

* [microBean™ Jersey Netty Integration](https://microbean.github.io/microbean-jersey-netty/)
* [microBean™ Jakarta RESTful Web Services CDI Integration](https://microbean.github.io/microbean-jaxrs-cdi/)
* [microBean™ Configuration API](https://microbean.github.io/microbean-configuration-api/)
* [microBean™ Configuration](https://microbean.github.io/microbean-configuration/)
* [microBean™ Configuration CDI](https://microbean.github.io/microbean-configuration-cdi/)
