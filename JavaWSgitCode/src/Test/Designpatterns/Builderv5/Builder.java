package Test.Designpatterns.Builderv5;

public class Builder {

     int age;
     String name;
     int psp;
     String email;

    public Builder setPsp(int psp) {

        this.psp = psp;
        return this;
    }

    public Builder setAge(int age) {

        this.age = age;
        return this;
    }

    public Builder setName(String name) {

        this.name = name;
        return this;
    }

    public Builder setEmail(String email) {

        this.email = email;
        return this;
    }

   public Student  build(Builder bt)
    {
        if(psp < 1 || psp > 100)
        {
            throw new IllegalArgumentException("Invalid psp");
        }


        if(age < 20 || age > 70)
        {
            throw new IllegalArgumentException("Invalid age");
        }


        if(name == null)
        {
            throw new IllegalArgumentException("Invalid name");
        }

        if(email == null)
        {
            throw new IllegalArgumentException("Invalid email");
        }

       return  new Student(this);

    }

}
