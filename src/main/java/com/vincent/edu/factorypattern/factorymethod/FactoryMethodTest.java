package com.vincent.edu.factorypattern.factorymethod;

import com.vincent.edu.factorypattern.ICourse;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse course = factory.create();
        course.record();

        factory = new PythonCourseFactory();
        course = factory.create();
        course.record();

    }

}
