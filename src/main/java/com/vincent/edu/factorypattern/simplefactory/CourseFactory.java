package com.vincent.edu.factorypattern.simplefactory;

import com.vincent.edu.factorypattern.ICourse;

public class CourseFactory {

    /*public ICourse create(String name){
        if("java".equals(name)){
            return new JavaCourse();
        }else if("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }*/

    /*public ICourse create(String className){
        if(!(null == className || "".equals(className))){
            try {
                return (ICourse) Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }*/

    public ICourse create(Class<? extends ICourse> clazz){
        if(null != clazz){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
