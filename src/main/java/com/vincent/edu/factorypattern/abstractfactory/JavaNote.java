package com.vincent.edu.factorypattern.abstractfactory;

public class JavaNote implements INote{

    @Override
    public void edit() {
        System.out.println("编写 java 笔记");
    }
}
