package DesignPatterns.Factory.D01SimpleFactory;
//simple factory - https://github.com/kanmaytacker/design-patterns/blob/master/notes/03-factory.md

class User
{
    String firstName;
    String LastName;
    User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.LastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}

 class Student extends User
{
    private int studentId;

    public int getStudentId() {
        return studentId;
    }


    Student(String firstName, String lastName)
    {
        super(firstName, lastName);
        studentId = 10;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "studentId=" + studentId +
                '}';
    }
}

class Teacher extends User
{
    int teacherId;
    Teacher(String firstName, String lastName)
    {
        super(firstName, lastName);
        teacherId = 100;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}

enum Role
{
    STUDENT,
    ADMIN,
    TEACHER
}
public  class userFactory {


    public static User createUser(Role r)
    {

        switch(r)
        {
            case STUDENT:
                return  new Student("userf", "userl");
            case TEACHER:
                return  new Teacher("userf", "userl");

            //case Role.ADMIN:
            default:
                throw new IllegalStateException("Unexpected value: " + r);
        }

    }

    public static void main(String[] args) {

        User u = userFactory.createUser(Role.STUDENT);
        System.out.println(u);
        User u1 = userFactory.createUser(Role.TEACHER);
        System.out.println(u1);
    }
}
