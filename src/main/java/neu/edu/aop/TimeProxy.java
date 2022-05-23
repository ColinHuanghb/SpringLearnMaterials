package neu.edu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Order(1)
@Aspect
@Component
public class TimeProxy {
    // *(..) 代表可以match anything
//    @Before("execution(public void neu.edu.aop.IPhone.*(..))")
//    @Pointcut("execution(public void neu.edu.aop.IPhone.*(..))")
    @Pointcut("execution(* neu.edu..*.*(..))")
    public void commonMethod(){}

    @Before("commonMethod()")
    public void BeforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("method name is: "+methodName+" args: "+args);
        System.out.println("-----------before method");
    }
//    @After("execution(public void neu.edu.aop.IPhone.call())")
    @After("commonMethod()")
    public void AfterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("method name is: "+methodName+" args: "+args);
        System.out.println("-----------after method");
    }

    @AfterReturning(value = "commonMethod()", returning = "result")
    public void AfterReturningMethod(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("method name is: "+methodName+ " args: "+args+ " result: "+result);
        System.out.println("-----------AfterReturning");
    }

    @AfterThrowing(value = "commonMethod()", throwing = "ex")
    public void AfterThrowingMethod(JoinPoint joinPoint, Exception ex){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("method name is: "+methodName+ " args: "+args+ " Exception: "+ex);
        System.out.println("-----------AfterThrowing");
    }

    @Around(value = "commonMethod()")
    public void AroundMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        try{
            result = joinPoint.proceed();
            System.out.println(result);
        }catch (Throwable e) {
            System.out.println("method name is: "+methodName+ " args: "+args);
        }
        System.out.println("-----------AroundMethod");
    }
}
