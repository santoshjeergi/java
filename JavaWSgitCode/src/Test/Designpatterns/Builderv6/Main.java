package Test.Designpatterns.Builderv6;

public class Main {
    public static void main(String[] args) {


        Student s  = Student.Builder.getBuilder().setAge(21).setEmail("f").setName("ds").setPsp(89).build();
        System.out.println(s);
        s.setAge(57);;
        System.out.println(s);
    }
}
