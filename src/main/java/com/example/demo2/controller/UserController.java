package com.example.demo2.controller;

import com.example.demo2.aspect.SysLog;
import com.example.demo2.entity.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:43
 * @Version
 */
@RestController
@RequestMapping("/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @SysLog(value = "测试")
    @GetMapping(value = "get")
    public User getInformation(String userName,String passWord){
        return userService.getInformation(userName,passWord);
    }

}
