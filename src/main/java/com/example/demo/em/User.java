package com.example.demo.em;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Title: User <br>
 * Description: User <br>
 * Date: 2018年07月19日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 */
@Entity
@Table(name = "t_user")
public class User {


    @Id
    private Integer id;

    private String username;

    private String password;

    @Convert(converter = JobConverter.class)
    private JobEm job;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JobEm getJob() {
        return job;
    }

    public void setJob(JobEm job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
