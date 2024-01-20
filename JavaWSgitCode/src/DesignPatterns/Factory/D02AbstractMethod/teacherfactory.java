package DesignPatterns.Factory.D02AbstractMethod;

import DesignPatterns.Factory.D01SimpleFactory.TestTeacher;

public class teacherfactory extends userFactory{

    @Override
    public TestTeacher createUser(String f, String l) {
        return new TestTeacher(f, l);
    }
}
