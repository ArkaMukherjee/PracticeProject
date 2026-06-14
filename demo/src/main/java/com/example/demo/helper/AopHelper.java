package com.example.demo.helper;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
@Aspect
public class AopHelper {

    @Before("execution(* com.example.demo.controller.GreetingController.*(..))")
    public void logBefore()
    {
        System.out.println("Test AOP before working");
    }
}
