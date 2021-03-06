package com.github.mrduguo.gradle.samplecmd

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import spock.lang.Specification

@SpringApplicationConfiguration(classes = Application.class)
class ApplicationSpec extends Specification {

    @Autowired
    Application application

    void "top url should be www.example.com"() {
        when:
        def topUrls = application.findTopHitUrls()

        then:
        topUrls.size() == 5
        topUrls.first().key == 'http://www.example.com'
    }

}