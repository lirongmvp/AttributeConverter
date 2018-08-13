package com.example.demo.web;

import com.example.demo.config.TestConfig;
import com.example.demo.dao.UserRep;
import com.example.demo.em.JobEm;
import com.example.demo.em.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Title: UserResource <br>
 * Description: UserResource <br>
 * Date: 2018年07月19日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 */
@RestController
public class UserResource {
    @Autowired
    private UserRep userRep;
    @Autowired
    private UserService userService;
    @Autowired
    private TestConfig testConfig;

    @PutMapping("save")
    public User test(@RequestBody User user){


        return  userRep.save(user);

    }

    @GetMapping("find/{id}")
    public User test2(@PathVariable("id") Integer id){
        return userRep.findById(id).get();
    }

    @GetMapping("cache")
    public User cache(){
        return  userService.findOne(1);
    }
    @GetMapping("out")
    public User out(){
        User user = new User(1, "sdf", "3333", JobEm.PRESIDENT);
        return userService.add(user);
    }
    @GetMapping("test")
    public String test(){

        return testConfig.getName();
    }
}
