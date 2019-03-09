package com.vincent.edu.factorypattern.factorymethod;

import com.vincent.edu.factorypattern.ICourse;
import com.vincent.edu.factorypattern.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {


    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
