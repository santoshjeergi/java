package Test.Designpatterns.Builderv5;

public class Student {

    private int age;
    private String name;
    private int psp;
    private String email;

    Student(Builder bt)
    {
        this.age = bt.age;
        this.name = bt.name;
        this.email = bt.email;
        this.psp = bt.psp;
    }
    private Student()
    {

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", email='" + email + '\'' +
                '}';
    }
}
