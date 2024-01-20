package DesignPatterns.Factory.D01SimpleFactory;

public class TestStudent extends TestUser{

    public TestStudent(String f, String l)
    {
        super(f, l);
    }

    @Override
    public String toString() {
        return "Student " + super.toString();
    }
}
