package com.maven.spring.bean;


import com.alibaba.druid.pool.DruidDataSource;
import com.maven.spring.autowire.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class StudentTest {

//通过xml注入复杂数据类型
    @Test
    void doMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Student student= context.getBean("student", Student.class);
        student.init();

    }
//注入List集合类型 值的类型是对象
    @Test
    void objectInfuseMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean("student", Student.class);
        student.init();


    }

//提取list集合类型属性注入使用
    @Test
    void publicListMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

        book1.init();
        System.out.println(book1);
        System.out.println(book2);


    }
//工厂bean 返回的类型可以和设置的类型不一致

    /**
     * 普通 bean：在配置文件中定义 bean 类型就是返回类型
     * 工厂 bean：在配置文件定义 bean 类型可以和返回类型不一样
     */
    @Test
    void factoryBeanMethods() {
    //加载spring配置文件的时候创建就对象
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
    Course course = context.getBean("myBean", Course.class);
        System.out.println(course);


    }

// 多实例

    /**
     *1.在 spring 配置文件 bean 标签里面有属性（scope）用于设置单实例还是多实例
     * 2.scope 属性值
     * 第一个值 默认值，singleton，表示是单实例对象
     * 第二个值 prototype，表示是多实例对象
     * singleton 和 prototype 区别
     * 第一 singleton 单实例，prototype 多实例
     * 第二 设置 scope 值是 singleton 时候，加载 spring 配置文件时候就会创建单实例对象
     * 设置 scope 值是 prototype 时候，不是在加载 spring 配置文件时候创建 对象，在调用
     * getBean 方法时候创建多实例对象
     */
    @Test
    void moreInstanceMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);

    }
//bean生命周期
    @Test
    void lifeCycleMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders order = context.getBean("orders", Orders.class);
        System.out.println("6:获取创建出来的bean实例对象");
        //手动销毁创建出来的实例对象
        context.close();


    }
    //手动配置创建对象
    @Test
    void Methods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
        System.out.println(emp);



    }
    //自动装配创建对象
    @Test
    void autoConfigMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
        System.out.println(emp);



    }
    //外部属性配置文件
    @Test
    void externalConfigMethods() {
        //加载spring配置文件的时候创建就对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        DruidDataSource source = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(source);


    }
}
