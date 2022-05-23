package neu.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Order(1)
@Aspect
@Component
public class LoggerProxy {
    @Pointcut("execution(* neu.edu..*.*(..))")
    public void commonMethod(){}

    @Before("commonMethod()")
    public void BeforeMethod(JoinPoint joinPoint){
        System.out.println("-----------LOGGER before method");
    }
    //    @After("execution(public void neu.edu.aop.IPhone.call())")
    @After("commonMethod()")
    public void AfterMethod(JoinPoint joinPoint){
        System.out.println("-----------LOGGER after method");
    }
}
