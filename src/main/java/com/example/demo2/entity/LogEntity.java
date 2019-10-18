package com.example.demo2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:51
 * @Version
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogEntity {
    //路径
    private String className;

    //方法名
    private String methodName;

    //参数
    private String params;

    //value
    private String value;

    //创建时间
    private String date;
}
