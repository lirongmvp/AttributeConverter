package com.example.demo.service;

import com.example.demo.config.TestConfig;
import com.example.demo.dao.UserRep;
import com.example.demo.em.JobEm;
import com.example.demo.em.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by lirong on 2018/8/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
//    @Spy
//    @InjectMocks
    @Autowired
    private UserService userService;
    @Mock
    private UserRep userRep;
    @Autowired
    private TestConfig testConfig;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void findOne() throws Exception {
//        Mockito.when(userRep.findById(1)).thenReturn(Optional.of(new User(1,"sdf","q")));
        User save = userService.add(new User(1,"lirong","q1233", JobEm.PRESIDENT));
        User one = userService.findOne(1);
        System.out.println(one);
        System.out.println("-----------------");
        User one1 = userService.findOne(1);
        System.out.println(one1);

//        Mockito.verify(userRep,Mockito.times(1)).findById(1);


    }

//    @Test
    public void save() throws Exception {
        User one = userService.add(new User(1,"sdf","q", JobEm.PRESIDENT));
        System.out.println(one);
//        User one1 = userService.findOne(1);
//        System.out.println(one1);

    }




}