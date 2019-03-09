package com.vincent.edu.factorypattern.factorymethod;

import com.vincent.edu.factorypattern.ICourse;
import com.vincent.edu.factorypattern.JavaCourse;
import com.vincent.edu.factorypattern.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {


    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
