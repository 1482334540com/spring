package com.maven.spring.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//增强类
@Component //生成 UserProxy 对象
@Aspect() //生成代理对象
@Order(3) //优先级处理 数字越小 优先级越高
public class UserProxy {
  //公共切入点的好处;使代码更加灵活,以后代码发生改变,只需要改此处就可以
    @Pointcut(value = "execution(* com.maven.spring.aopanno.User.add(..))") //公共切入点抽取
    public void pointcut(){

    }

    @Before(value = "pointcut()") //前置通知注解 (调用公共切入点的值)
    public  void before(){

//前置通知
        System.out.println("before 前置通知...... 在被增强的方法之前执行");
    }

    @AfterReturning(value = "execution(* com.maven.spring.aopanno.User.add(..) )")
    public void  AfterReturning(){
//后置通知
        System.out.println("AfterReturning 后置通知...... 在增强方法之后执行 当程序出现异常的时候不执行该方法 ");
    }


    @After(value = "execution(* com.maven.spring.aopanno.User.add(..) )")
    public void  after(){
//最终通知
        System.out.println("after 最终通知...... 无论程序出现什么结果 都会执行该方法 在add方法返回结果后的时候执行");
    }

    @AfterThrowing(value = "execution(* com.maven.spring.aopanno.User.add(..) )")
    public void  AfterThrowing(){
//异常通知
        System.out.println("AfterThrowing 异常通知......add方法出现异常的时候执行");
    }

    @Around(value = "execution(* com.maven.spring.aopanno.User.add(..) )")
    public void  Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//环绕通知
        System.out.println("Around 环绕之前......在增强方法的前后都执行");
        proceedingJoinPoint.proceed(); //调用被增强的add方法
        System.out.println("Around 环绕之后......在增强方法的前后都执行");
    }
}
