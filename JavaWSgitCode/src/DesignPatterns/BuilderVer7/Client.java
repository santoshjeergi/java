package DesignPatterns.BuilderVer7;

public class Client {
    public static void main(String[] args) {


        Student st = Student.Builder.getBuilder().
                       setPhone("22782371234").
                       setAge(12).setName("kum").
                       setPsp(100).
                       setEmail("w@n.com").build();

        System.out.println(st);

        st.setAge(310);  /*Exception !!1*/
        System.out.println(st);



        
    }
}
