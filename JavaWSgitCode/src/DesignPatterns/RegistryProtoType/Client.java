package DesignPatterns.RegistryProtoType;

import static DesignPatterns.RegistryProtoType.StudentRegistry.regRef;

public class Client {

    public static void fun(Student orig)
    {
        Student s = orig.clone();

        System.out.println("In fun:"+ s);
    }

    public static void main(String[] args) {


        Student st = new Student();
        st.setAge(10);
        st.setBatchPsp(87);
        st.setName("abcname");
        st.setPsp(56);
        st.setBatchName("Mar22");

        regRef.fillRegistry("Mar22", st);

        //System.out.println(st);
        Student st2 = st.clone();
       // System.out.println(st2);


        FinAidStudent ft = new FinAidStudent();
        ft.setAge(100);
        ft.setBatchPsp(57);
        ft.setName("abcFinname");
        ft.setPsp(45);
        ft.setBatchName("Mar23");
        ft.setScolarship(100);

        regRef.fillRegistry("Mar23", ft);

        fun(ft);
        fun(st);




    }
}
