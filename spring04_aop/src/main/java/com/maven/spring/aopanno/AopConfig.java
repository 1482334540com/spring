package com.maven.spring.aopanno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.maven.spring.aopanno"}) //开启注解扫描 创建对象
@EnableAspectJAutoProxy(exposeProxy = true)  //开启Aspect生成代理对象
public class AopConfig {
}
