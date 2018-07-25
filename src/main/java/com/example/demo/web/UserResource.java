package com.example.demo.web;

import com.example.demo.dao.UserRep;
import com.example.demo.em.User;
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

    @PutMapping("save")
    public User test(@RequestBody User user){


        return  userRep.save(user);

    }

    @GetMapping("find/{id}")
    public User test2(@PathVariable("id") Integer id){
        return userRep.findById(id).get();
    }
}
