package com.maven.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    //数组属性类型
    private  String courses [] ;
    //list集合
    private List<String> students;
    //map集合
    private Map<String,String> map;
    //set集合
    private Set sets;

    private List<Course> courseList;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void init() {
        System.out.println(Arrays.toString(courses));
        System.out.println("ArrayList:"+students);
        System.out.println("Set:"+sets);
        System.out.println("Map:"+map);
        System.out.println("courseList:"+courseList);


    }

}
