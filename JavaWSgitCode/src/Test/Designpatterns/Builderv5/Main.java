package Test.Designpatterns.Builderv5;

public class Main {
    public static void main(String[] args) {
        Builder bt  = new Builder();
        Student s = bt.setAge(20).setEmail("san@j").setName("kumar").setPsp(90).build(bt);
        System.out.println(s);

        //should be disallowed
        Student s1 = new Student(new Builder());
        System.out.println(s1);
    }
}
