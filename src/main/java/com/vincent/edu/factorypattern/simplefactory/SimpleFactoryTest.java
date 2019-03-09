package com.vincent.edu.factorypattern.simplefactory;

import com.vincent.edu.factorypattern.ICourse;
import com.vincent.edu.factorypattern.JavaCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        /*ICourse course = new JavaCourse();
        course.record();*/

        /*CourseFactory factory = new CourseFactory();
        factory.create("java");*/

        /*CourseFactory factory = new CourseFactory();
        ICourse course = factory.create("com.vincent.edu.factorypattern.JavaCourse");
        course.record();*/

        /**
         * 反射
         * */
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);
        course.record();

    }

}
