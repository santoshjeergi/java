package DesignPatterns.BuilderVer5;

//Force the users not to create the student object before passing all the validations!
public class Student {
    private int age;
    private String name;
    private String phone;
    private String email;
    private int psp;

    Student(Builder bt)
    {
        this.age  = bt.age;
        this.psp = bt.psp;
        this.phone = bt.phone;
        this.email = bt.email;
        this.name = bt.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", psp=" + psp +
                '}';
    }

};
