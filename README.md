# gradle sample command line project  [![Build Status](https://travis-ci.org/mrduguo/gradle-sample-cmd.svg?branch=master)](https://travis-ci.org/mrduguo/gradle-sample-cmd)
A demo for spring boot based command line application based on [mrduguo/gradle-buildscript](https://github.com/mrduguo/gradle-buildscript) project.


## Requirements

* JAVA 7 or newer
* Docker (optional, to use `-x docker` to skip if you don't have docker installed)


## sample local build command

```
./gradlew
```

## run with java

After build or [download](https://dl.bintray.com/mrduguo/maven/com/github/mrduguo/gradle/gradle-sample-cmd/) a released jar file, you may run it with:

```
java -jar gradle-sample-cmd-*.jar
```


## run with docker

#### run the local built docker image

```
docker run -it --rm gradle-sample-cmd
```

#### run the published docker image

The image also pushed as [mrduguo/gradle-sample-cmd](https://hub.docker.com/r/mrduguo/gradle-sample-cmd/) in docker hub.
You may run in any docker environment:

```
docker run -it --rm mrduguo/gradle-sample-cmd
```

Which is same as you run with additional parameters:

```
docker run -it --rm mrduguo/gradle-sample-cmd --output.number.of.urls=5 --input.log.url=https://raw.githubusercontent.com/spring-projects/spring-boot/master/spring-boot-samples/spring-boot-sample-simple/src/main/java/sample/simple/SampleSimpleApplication.java
```

## sample output

```
$ docker run -it --rm gradle-sample-cmd
TOP 5 HIT URLS
=28
*=13
the=8
import=5
or=4
```
