package ExceptionsReflections.ReflectionDemo;

public class Person {
    private int age;
    private String name;
    /*Person()
    {

    }*/
    Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    private void  funMethod()
    {
        System.out.println("printing is fun");
    }
}
