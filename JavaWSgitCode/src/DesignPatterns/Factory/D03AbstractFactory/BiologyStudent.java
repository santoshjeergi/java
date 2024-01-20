package DesignPatterns.Factory.D03AbstractFactory;

import DesignPatterns.Factory.D01SimpleFactory.TestStudent;

public class BiologyStudent extends TestStudent {

    BiologyStudent(String f, String l)
    {
        super(f, l);
    }

    @Override
    public String toString() {
        return "BiologyStudent " + super.toString();
    }
}
