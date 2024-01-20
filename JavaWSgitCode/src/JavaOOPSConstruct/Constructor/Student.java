package JavaOOPSConstruct.Constructor;

//package JavaLangOOPSConstructs;

public class Student extends  User{

    private final  String sidPrefix = "S";
    public enum studentStatus {
        ACTIVE,
        PAUSED,
        INACTIVE
    }
    private int psp;
    private studentStatus status = studentStatus.INACTIVE;


   /* private  int age;
    private String name;



    Student(int age){
        System.out.println("In " +  "Student (int age)");
        this.age = age;

    }
    Student (String name)
    {
        System.out.println("In " +  "Student (String name)");
        this.name = name;
    } */
    Student (int id, int age, String name, int psp, String email)
    {
        super(id, age, name, email);
        //System.out.println("In " +  "Student (int age, String name)");
        if(psp < 0 || psp > 100)
        {
            throw new IllegalArgumentException("PSP should be between 0-100");
        }
        this.psp = psp;

        /*this.age = age;
        this.name  = name;*/
        this.status = studentStatus.ACTIVE;
    }
    /*Student ( String name, int age)
    {
        System.out.println("In " +  "Student (String name, int age)");
        this.age = age;
        this.name  = name;
        this.status = studentStatus.ACTIVE;
    }*/

    public String toString()
    {
        String s = "student name:" + this.name + " " + " age:" + this.age + " status:" + this.status + " psp:" + this.psp;
        return s;

    }
    @Override
    public void Printdetails()
    {
        System.out.print("Id" + sidPrefix + id + " ");
        super.Printdetails();
        System.out.print(" status:" + this.status + " psp:" + this.psp);
        System.out.println();
    }
    public static void printStudentDetails(Student s)
    {
        System.out.println("StudentDetails: name:" + s.name + " " + " age:" + s.age + " status:" + s.status + " psp:" + s.psp);
    }
    Student()
    {
        super();
        System.out.println("default constuctor");
    }
    Student(Student s)
    {
        System.out.println("In " +  "Student (Student)");
        this.name = new String(s.name);
        this.age = s.age;
    }
}

