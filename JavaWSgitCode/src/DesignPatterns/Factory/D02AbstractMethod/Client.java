package DesignPatterns.Factory.D02AbstractMethod;

import DesignPatterns.Factory.D01SimpleFactory.TestUser;
//https://github.com/kanmaytacker/design-patterns/blob/master/notes/03-factory.md
public class Client {
    public static void main(String[] args) {
        userFactory userFactory = new studentfactory();
        TestUser testUser= userFactory.createUser("uf", "ul");
        System.out.println(testUser);

        userFactory teacherFactory = new teacherfactory();
        TestUser testTuser= teacherFactory.createUser("uf", "ul");
        System.out.println(testTuser);
    }
}
