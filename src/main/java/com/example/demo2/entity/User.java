package com.example.demo2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:07
 * @Version
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;

    @JsonIgnore
    private String password;

    private String type;
}
