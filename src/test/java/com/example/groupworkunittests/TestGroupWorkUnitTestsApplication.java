package com.example.groupworkunittests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;


@TestConfiguration(proxyBeanMethods = false)
public class TestGroupWorkUnitTestsApplication {

    public static void main(String[] args) {
        SpringApplication.from(GroupWorkUnitTestsApplication::main).with(TestGroupWorkUnitTestsApplication.class).run(args);
    }

}
