package DesignPatterns.BuilderVer6;

public class Client {
    public static void main(String[] args) {

       // Student.Builder bt = Builder.getBuilder();

        /* bt.age = 10;
        bt.email = "s@a.com";
        bt.name = "kumar:";
        bt.psp  = 101;
        bt.phone = 5762112;*/

        Student st = Student.Builder.getBuilder().
                       setPhone("22782371234").
                       setAge(12).setName("kum").
                       setPsp(100).
                       setEmail("w@n.com").build();

        System.out.println(st);



        //Force the users not to create the student object before passing all the validations!
        //below is breaking...

       // Student st1 = new Student(bt);

       // System.out.println(st1);

        
    }
}
