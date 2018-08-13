package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Title: TestConfig <br>
 * Description: TestConfig <br>
 * Date: 2018年08月09日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 */
@Component
@ConfigurationProperties(prefix = "test")
public class TestConfig {
    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
