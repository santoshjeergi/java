package DesignPatterns.Factory.D02AbstractMethod;


import DesignPatterns.Factory.D01SimpleFactory.TestUser;

public abstract  class userFactory {
    public abstract TestUser createUser(String f, String l);
}
