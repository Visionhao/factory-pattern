package com.vincent.edu.factorypattern.abstractfactory;

public class JavaCourseFactory implements CourseFactory{


    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}
