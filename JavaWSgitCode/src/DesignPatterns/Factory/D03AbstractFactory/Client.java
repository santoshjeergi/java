package DesignPatterns.Factory.D03AbstractFactory;

import DesignPatterns.Factory.D01SimpleFactory.TestUser;

public class Client {
    public static void main(String[] args) {
        classRoom classRoom = new BiologyClassRoom();
        TestUser ts = classRoom.createStudent("stf", "stl");
        TestUser tt = classRoom.createTeacher("ttf", "ttl");

        System.out.println(ts);
        System.out.println(tt);
    }
}
