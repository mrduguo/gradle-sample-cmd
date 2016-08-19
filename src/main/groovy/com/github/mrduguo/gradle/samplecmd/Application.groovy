package com.github.mrduguo.gradle.samplecmd

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Value('${input.log.url:https://raw.githubusercontent.com/mrduguo/gradle-sample-cmd/master/src/test/resources/urls-log.txt}')
    String inputLogUrl

    @Value('${output.number.of.urls:5}')
    int outputNumberOfUrls

    def findTopHitUrls() {
        def urlCounts = [:]
        new URL(inputLogUrl).text.eachLine {
            urlCounts.put(it, urlCounts.containsKey(it) ? urlCounts[it] + 1 : 1)
        }
        urlCounts.sort { -it.value }.entrySet().collate(outputNumberOfUrls).first()
    }

    @Override
    void run(String... args) throws Exception {
        println "TOP $outputNumberOfUrls HIT URLS"
        findTopHitUrls().each {
            println it
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }
}
