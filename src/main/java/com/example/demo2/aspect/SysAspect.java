package com.example.demo2.aspect;

import com.alibaba.fastjson.JSON;
import com.example.demo2.entity.LogEntity;
import com.google.common.collect.Lists;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author
 * @Date 2019/10/18 10:59
 * @Version
 */
@Aspect
@Component
public class SysAspect {
    @Autowired
    private SysLogService sysLogService;

    @Pointcut(value = "@annotation(com.example.demo2.aspect.SysLog)")
    public void logPointCut() {}


    @Before("logPointCut() && @annotation(sysLog)")
    public void saveLog(JoinPoint joinPoint,SysLog sysLog) {

        LogEntity logEntity = new LogEntity();
        //路径
        String className =joinPoint.getTarget().getClass().getName();
        //方法名
        String methodName = joinPoint.getSignature().getName();
        logEntity.setClassName(className);
        logEntity.setMethodName(methodName);
        //时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        logEntity.setDate(dateFormat.format(new Date()));
        //注解备注
        if (sysLog !=null){
            logEntity.setRemark(sysLog.value());
        }
        //参数列表
        Object[] arguments = joinPoint.getArgs();
        List<Object> argumentList = Lists.newArrayList();
        if (arguments!=null && arguments.length>0){
            for (int i=0;i<arguments.length;i++){
                Object item = arguments[i];
                if (!(item instanceof ServletRequest) && !(item instanceof ServletResponse)
                        && !(item instanceof HttpSession) && !(item instanceof BindingResult)
                        && !(item instanceof MultipartFile)){
                    argumentList.add(arguments[i]);
                }
            }
        }
        //json转字符串
        String params = JSON.toJSONString(argumentList);
        logEntity.setParams(params);
        sysLogService.sysLog(logEntity);
    }
}
