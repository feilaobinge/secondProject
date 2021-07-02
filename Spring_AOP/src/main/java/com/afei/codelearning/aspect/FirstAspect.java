package com.afei.codelearning.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FirstAspect {
    @Before("execution(public * com.afei.codelearning.*.*.world(..))")
    public void beforeService(){
        System.out.printf("hello ");
    }
}
