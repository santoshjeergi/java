package DesignPatterns.Factory.D03AbstractFactory;

import DesignPatterns.Factory.D01SimpleFactory.TestTeacher;

public class BiologyTeacher extends TestTeacher {
    BiologyTeacher(String f, String l)
    {
        super(f, l);
    }

    @Override
    public String toString() {
        return "BiologyTeacher " + super.toString();
    }
}
