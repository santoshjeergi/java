package Test.Designpatterns.RegistryProtoType;

public class Student implements Prototype{
    private int age;
    private String name;

    @Override
    public Student clone() {
        return new Student(this);
    }

    public Student(Student st)
    {
        this.age = st.age;
        this.name = st.name;
    }

    public Student()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
