package com.vincent.edu.factorypattern.abstractfactory;

public class PythonVideo implements IVideo{

    @Override
    public void record() {
        System.out.println("录制 python 视频");
    }
}
