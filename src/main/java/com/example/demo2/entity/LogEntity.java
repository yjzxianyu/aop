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
    private String className;

    private String methodName;

    private String params;

    private String remark;

    private String date;
}
