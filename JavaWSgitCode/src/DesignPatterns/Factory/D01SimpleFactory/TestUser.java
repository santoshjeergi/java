package DesignPatterns.Factory.D01SimpleFactory;

public class TestUser {
    String firstName;
    String lastName;
    TestUser(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
