package com.example.demo2.aspect;

import com.example.demo2.entity.LogEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 11:02
 * @Version
 */
@Slf4j
@Service
public class SysLogService {
    /**
     * 不做具体实现，在控制台打印出LogEntity类
     * @param logEntity
     * @return
     */
    public  boolean sysLog(LogEntity logEntity){
        System.out.println(logEntity);
        return true;
    }
}
