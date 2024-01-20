package Test.practiceAbstract2;

public abstract class Employee implements Person{
    int empId;
    String name;
    String email;
    Employee(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getname() {
        return name;
    }

    public String getemail() {
        return email;
    }



    public int getEmpId() {
        return empId;
    }
}
