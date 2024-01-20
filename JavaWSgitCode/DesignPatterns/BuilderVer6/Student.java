package DesignPatterns.BuilderVer6;

//Force the users not to create the student object before passing all the validations!
public class Student {
    private int age;
    private String name;
    private String phone;
    private String email;
    private int psp;

   private Student(Builder bt)  /*make this private */
    {
        this.age  = bt.age;
        this.psp = bt.psp;
        this.phone = bt.phone;
        this.email = bt.email;
        this.name = bt.name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", psp=" + psp +
                '}';
    }

    public static class Builder {
        public int age;
        public String name;
        public String phone;
        public String email;
        public int psp;

        public static Builder getBuilder() {
            return new Builder();
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
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

        public Student build()
        {
            //validate before assigning.
            if(email == null || email.length() == 0)
            {
                throw new IllegalArgumentException("Incorrect email");
            }
            if(psp < 0  || psp > 100)
            {
                throw new IllegalArgumentException("Incorrect psp");
            }
            if(age < 0  || age > 150)
            {
                throw new IllegalArgumentException("Incorrect age");
            }
            if(name == null || name.length() == 0)
            {
                throw new IllegalArgumentException("Incorrect name");
            }
            if( phone == null || phone.length() <= 0)
            {
                throw new IllegalArgumentException("Incorrect phone");
            }
            return new Student(this);
        }


    }


};
