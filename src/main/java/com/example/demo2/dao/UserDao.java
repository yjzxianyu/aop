package com.example.demo2.dao;

import com.example.demo2.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:07
 * @Version
 */
@Mapper
public interface UserDao {

    User getInformation(@Param("userName") String userName,@Param("passWord") String passWord);
}
