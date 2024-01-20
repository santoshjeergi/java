package DesignPatterns.Factory.D02AbstractMethod;

import DesignPatterns.Factory.D01SimpleFactory.TestStudent;
import DesignPatterns.Factory.D01SimpleFactory.TestUser;

public class studentfactory extends userFactory{

    @Override
    public TestUser createUser(String f, String l) {
        return new TestStudent(f, l);
    }
}
