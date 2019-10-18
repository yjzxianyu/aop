package com.example.demo2.aspect;

import java.lang.annotation.*;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:55
 * @Version
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
