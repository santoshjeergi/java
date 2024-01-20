package Test.Designpatterns.RegistryProtoType;

public class Client {

    public static void populateregistry()
    {
        Student student = new Student();
        student.setName("Student-Normal");
        student.setAge(12);

        DataRegister.register("NStudent", student);

        finaidstudent finaidstudent = new finaidstudent();
        finaidstudent.setName("Student-Finaid");
        finaidstudent.setAge(10);

        DataRegister.register("FStudent", finaidstudent);

    }

    Student getStudent(Student s)
    {
        return s.clone();
    }

    public static void main(String[] args) {

        populateregistry();

        Student st = new Student();
        st.setAge(8);
        st.setName("student1");


        Student st1 = st.clone(); // can use instead getStudent

       // System.out.println(st1);


        finaidstudent f = new finaidstudent();
        f.setconsession(10);
        f.setAge(121);
        f.setName("fs");

        Student st2 = f.clone();
        System.out.println(st2);  // why its not printing concession!!



        //
        Student s  = DataRegister.getPrototype("NStudent");
        Student copy  = s.clone();
       // System.out.println(copy);

        Student fs  = DataRegister.getPrototype("FStudent");
        Student fcopy  = fs.clone();
      //  System.out.println(fcopy);
    }
}
