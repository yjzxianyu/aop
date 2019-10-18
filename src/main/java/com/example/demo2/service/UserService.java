package com.example.demo2.service;

import com.example.demo2.entity.User;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:33
 * @Version
 */
public interface UserService {

    User getInformation(String userName,String passWord);
}
