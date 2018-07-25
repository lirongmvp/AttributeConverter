package com.example.demo.em;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Title: JobEm <br>
 * Description: JobEm <br>
 * Date: 2018年07月19日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 */
public enum  JobEm {
    STUDENT("1","学生"),
    TEACHER("2","老师"),
    PRESIDENT("3","校长");

    JobEm(String code, String value) {
        this.code = code;
        this.value = value;
    }
    @JsonValue
    private String code;

    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
