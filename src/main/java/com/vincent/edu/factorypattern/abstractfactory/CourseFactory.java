package com.vincent.edu.factorypattern.abstractfactory;

/**
 * 抽象工厂是用户的主入口
 * 在spring中应用得最广泛的一种设计模式
 * 易于拓展
 */
public interface CourseFactory {

    IVideo createVideo();

    INote createNote();

}
