package staticDemo;

public class Student {

        final int id ;
    private int age;
    private  String name;
    static String schoolName;

    public Student(int id) {
        this.id = id;
    }
    Student()
    {
        this.id = 0;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    //    this.id = 90;
    }
    public String getName()
    {
        return  name;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }
}
