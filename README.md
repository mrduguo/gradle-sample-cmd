# gradle sample command line project  [![Build Status](https://travis-ci.org/mrduguo/gradle-sample-cmd.svg?branch=master)](https://travis-ci.org/mrduguo/gradle-sample-cmd)
A demo for spring boot based command line application based on [mrduguo/gradle-buildscript](https://github.com/mrduguo/gradle-buildscript) project.


## Requirements

* JAVA 7 or newer
* Docker (optional, to use `-x docker` to skip if you don't have docker installed)


## Sample local build command

```
./gradlew
```

## Run with java

After build or [download](https://dl.bintray.com/mrduguo/maven/com/github/mrduguo/gradle/gradle-sample-cmd/) a released jar file, you may run it with:

```
java -jar gradle-sample-cmd-*.jar
```


## Run with docker

#### run the local built docker image

```
docker run -it --rm gradle-sample-cmd
```

#### Run the published docker image

The image also pushed as [mrduguo/gradle-sample-cmd](https://hub.docker.com/r/mrduguo/gradle-sample-cmd/) in docker hub.
You may run in any docker environment:

```
docker run -it --rm mrduguo/gradle-sample-cmd
```

Which is same as you run with additional parameters:

```
docker run -it --rm mrduguo/gradle-sample-cmd --output.number.of.urls=5 --input.log.url=https://raw.githubusercontent.com/mrduguo/gradle-sample-cmd/master/src/test/resources/urls-log.txt
```

## Sample output

```
$ docker run -it --rm mrduguo/gradle-sample-cmd
TOP 5 HIT URLS
http://www.example.com=1170
http://www.example.com/world=482
http://www.example.com/us=375
http://www.example.com/trends=286
http://www.example.com/travel=269
```
