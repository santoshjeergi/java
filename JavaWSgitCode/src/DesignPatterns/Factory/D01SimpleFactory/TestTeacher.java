package DesignPatterns.Factory.D01SimpleFactory;

public class TestTeacher extends TestUser{

    public TestTeacher(String f, String l)
    {
        super(f, l);
    }

    @Override
    public String toString() {
        return "Teacher " + super.toString();
    }
}
