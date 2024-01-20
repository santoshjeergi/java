package JavaOOPSConstruct.Constructor;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Student s = new Student(0, 10, "test", 100, "s@info.com");
        Student s1 = new Student(1, 10, "test1", 10, "s1@info.com");
        Student s2 = new Student(2, 10, "test2", 100, "s2@info.com");
        Student s3 = new Student(3, 10, "test3", 100, "s3@info.com");

        s.Printdetails();

        ArrayList<Student>  studentArrayList = new ArrayList<>();
        studentArrayList.add(s1);
        studentArrayList.add(s3);
        Mentor m = new Mentor(1, 34, "menttest", "m@info.com", studentArrayList);
        m.Printdetails();

        emailSender e = new emailSender();
        ArrayList<User> u = new ArrayList<>();
        
        u.add(m);
        for( Student st : m.studentList)
        {
            u.add(st);
        }
        //u.add(s1);
        //u.add(s3);
                e.sendEmailNotifications(u); //m.studentList);
        //System.out.println(m);

       /* System.out.println(s);
        Student s1 = new Student(s);
        System.out.println(s1);
        Student.printStudentDetails(s1);
        s.name = "newtest";*/
       // System.out.println(s);
        //System.out.println(s1);
        //Student s3 = new Student();
    }
}
