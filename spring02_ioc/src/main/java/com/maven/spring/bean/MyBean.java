package com.maven.spring.bean;

import org.springframework.beans.factory.FactoryBean;


public class MyBean  implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        Course course = new Course();
        course.setCourse("java基础");

        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
