package DesignPatterns.Factory.D03AbstractFactory;

import DesignPatterns.Factory.D01SimpleFactory.TestStudent;
import DesignPatterns.Factory.D01SimpleFactory.TestTeacher;

public class BiologyClassRoom extends classRoom{

    @Override
    public TestStudent createStudent(String f, String l) {
        return new BiologyStudent(f, l);
    }

    @Override
    public TestTeacher createTeacher(String f, String l) {
        return new BiologyTeacher(f, l);
    }
}
