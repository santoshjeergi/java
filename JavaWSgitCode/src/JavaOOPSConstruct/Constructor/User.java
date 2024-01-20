package JavaOOPSConstruct.Constructor;

public class User {

    int age;
    String name;
    String email;
    int id;

    User( int id, int age, String name, String email)
    {
        this.id = id;
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public User() {

    }

    public void Printdetails()
    {
        System.out.print(" age:" + this.age + " name:" + this.name + " email:" + this.email);
    }
}
