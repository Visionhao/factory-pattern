package com.vincent.edu.factorypattern.abstractfactory;

public class JavaVideo implements IVideo{

    @Override
    public void record() {
        System.out.println("录制 java 视频");
    }
}
