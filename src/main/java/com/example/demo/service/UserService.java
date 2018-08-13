package com.example.demo.service;

import com.example.demo.dao.UserRep;
import com.example.demo.em.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Title: UserService <br>
 * Description: UserService <br>
 * Date: 2018年08月03日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 */
@Service
public class UserService {
    @Autowired
    private UserRep userRep;

    @Cacheable(key = "#id",value = "user")
    public User findOne(Integer id){
        System.out.println("查询数据库");
        return userRep.findById(id).get();
    }
    @CacheEvict(key = "#user.id",value = "user")
    public User add(User user){
        System.out.println("从缓存中删除");
        return userRep.save(user);
    }



}
