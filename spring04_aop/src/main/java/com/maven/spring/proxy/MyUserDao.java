package com.maven.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MyUserDao implements InvocationHandler {

    private  Object target=null;

    public MyUserDao(Object target) {
        this.target = target;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

     //方法执行之前
        System.out.println("方法执行之前:"+method.getName()+"传递的参数"+ Arrays.toString(args));
     //被增强的方法执行
        Object res = method.invoke(target, args);
        //方法后执行
        System.out.println("方法执行之后:"+target);
        return  res;
    }
}
