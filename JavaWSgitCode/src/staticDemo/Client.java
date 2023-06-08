package staticDemo;

public class Client {
    public static void main(String[] args) {

        Student s1 = new Student(3);

        s1.setAge(30);
        s1.setName("kumar1");

        Student.setSchoolName("ABCSchool");
        System.out.println("age " + s1.getAge() + " name:" + s1.getName() + " school:" + s1.getSchoolName());

        System.out.println("Abs value:" + MathHelper.abs(-9));
        final int x;
        x = 788;
        //x++;
        //x = 980;
        System.out.println("val of x:" + x);
    }
}
