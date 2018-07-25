package com.example.demo.dao;

import com.example.demo.em.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Title: UserRep <br>
 * Description: UserRep <br>
 * Date: 2018年07月19日
 *
 * @author LiRong
 * @version 1.0.0
 * @since jdk8
 */
public interface UserRep extends JpaRepository<User,Integer> {
}
