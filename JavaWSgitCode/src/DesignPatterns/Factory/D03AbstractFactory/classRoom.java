package DesignPatterns.Factory.D03AbstractFactory;

import DesignPatterns.Factory.D01SimpleFactory.TestStudent;
import DesignPatterns.Factory.D01SimpleFactory.TestTeacher;


public abstract class classRoom {
    public abstract TestStudent createStudent(String f, String l);
    public abstract TestTeacher createTeacher(String f, String l);
}
