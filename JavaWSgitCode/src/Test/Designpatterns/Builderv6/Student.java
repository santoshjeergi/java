package Test.Designpatterns.Builderv6;

import Test.Designpatterns.Builderv5.Builder;

public class Student {

    private int age;
    private String name;
    private int psp;
    private String email;




    public static class Builder{
         int age;
         String name;
         int psp;
         String email;

        public  static Builder getBuilder() {
            return new Builder();
        }
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
        public Student build()
        {

            if(isPsp(psp))
            {
                throw new IllegalArgumentException("Invalid psp");
            }


            if(isAge(age))
            {
                throw new IllegalArgumentException("Invalid age");
            }


            if(isName(name))
            {
                throw new IllegalArgumentException("Invalid name");
            }

            if(isEmail(email))
            {
                throw new IllegalArgumentException("Invalid email");
            }

            return  new Student(this);

        }
    }

    private Student(Builder bt)
    {
        this.age = bt.age;
        this.name = bt.name;
        this.email = bt.email;
        this.psp = bt.psp;
    }
    private Student()
    {

    }

    public static boolean isPsp(int psp)
    {
        return (psp < 1 && psp > 100);
    }

    public static boolean isAge(int age) {
        return (age < 20 && age > 70);

    }

    public static boolean isName(String name) {
        return (name == null);

    }

    public  static boolean isEmail(String email) {
        return email == null;
    }

    public void  setAge(int age) {

        if(isAge(age))
        {
            throw new IllegalArgumentException("Invalid age");
        }
        this.age = age;
    }

    public  void setName(String name) {

      if(isName(name))
      {
          throw new IllegalArgumentException("Invalid Name");
      }
      this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", email='" + email + '\'' +
                '}';
    }
}
