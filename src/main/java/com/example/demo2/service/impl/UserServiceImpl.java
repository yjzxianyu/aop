package com.example.demo2.service.impl;

import com.example.demo2.dao.UserDao;
import com.example.demo2.entity.User;
import com.example.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:35
 * @Version
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getInformation(String userName,String passWord){
        return userDao.getInformation(userName,passWord);
    }
}
