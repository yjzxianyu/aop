package com.example.demo2.service.impl;

import com.example.demo2.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:37
 * @Version
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @Test
    public void getInformation() {
        String userName="zhang";
        String passWord="123456";
        System.out.println(userService.getInformation(userName,passWord));
    }
}