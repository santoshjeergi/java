package JavaOOPSConstruct.Constructor;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends User{
    ArrayList<Student>  studentList = new ArrayList<>();
    private final  String midPrefix = "M";
    Mentor(int id, int age, String name, String email, ArrayList<Student> students)
    {
        super(id, age, name, email);
        studentList = students;
    }
    Mentor(int id, int age, String name, String email) {
        super(id, age, name, email);
    }

    @Override
    public String toString() {
        Printdetails();
        return "Mentor{" +
                "studentList=" + studentList +
                '}';
    }

    @Override
    public void Printdetails() {
        System.out.println("Id:" + midPrefix + id);
        super.Printdetails();
        System.out.println("-------------");
        for ( Student s : studentList){
            s.Printdetails();
        }
    }
}
