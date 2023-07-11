package DesignPatterns.RegistryProtoType;

public class Student implements ProtoType{
    private int age;
    private String name;
    private int batchPsp;
    private String batchName;
    private int psp;

    Student(Student other) {
        this.age = other.age;
        this.name = other.name;
        this.psp = other.psp;
        this.batchName = other.batchName;
        this.batchPsp = other.batchPsp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", batchPsp=" + batchPsp +
                ", batchName='" + batchName + '\'' +
                ", psp=" + psp +
                '}';
    }

    public  Student clone()
    {
        Student s = new Student(this);
        return s;
    }

    Student()
    {

    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatchPsp() {
        return batchPsp;
    }

    public void setBatchPsp(int batchPsp) {
        this.batchPsp = batchPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

}