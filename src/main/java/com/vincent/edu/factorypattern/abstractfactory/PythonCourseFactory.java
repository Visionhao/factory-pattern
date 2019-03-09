package com.vincent.edu.factorypattern.abstractfactory;

public class PythonCourseFactory implements CourseFactory{


    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }
}
