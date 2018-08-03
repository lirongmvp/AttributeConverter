package com.example.demo.service;

import com.example.demo.dao.UserRep;
import com.example.demo.em.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * Created by lirong on 2018/8/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
//    @Spy
    @InjectMocks
    private UserService userService;
    @Mock
    private UserRep userRep;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
        Mockito.when(userRep.findById(1)).thenReturn(Optional.of(new User(1,"sdf","q")));
        User one = userService.findOne(1);
        System.out.println(one);
        userService.findOne(1);
        Mockito.verify(userRep,Mockito.times(1)).findById(1);

    }

}