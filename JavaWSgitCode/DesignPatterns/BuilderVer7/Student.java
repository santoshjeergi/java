package DesignPatterns.BuilderVer7;

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

    public void setName(String name) {
       // Builder builder = Builder.setPhone("32322323");
        if(Builder.isNameValid(name) == false) {
            throw new IllegalArgumentException("Incorrect name");
        }
        this.name = name;
    }

    /*public void setEmail(String email) {

        this.email = email;
    }*/

    public void setAge(int age) {

        if(Builder.isAge(age) == false) {
            throw new IllegalArgumentException("Incorrect age");
        }
        this.age = age;
    }


    public void setPhone(String phone) {

        if(Builder.isPhoneValid(phone) == false) {
            throw new IllegalArgumentException("Incorrect phone");
        }
        this.phone = phone;
    }
    public void setPsp(int psp) {

        if(Builder.isPsp(psp) == false) {
            throw new IllegalArgumentException("Incorrect psp");
        }
        this.phone = phone;
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
            if(isAge(age) == false)
            {
                throw new IllegalArgumentException("incorrect age");
            }
            if(email == null || email.length() == 0)
            {
                throw new IllegalArgumentException("Incorrect email");
            }
            if(isPsp(psp) == false) // psp < 0  || psp > 100)
            {
                throw new IllegalArgumentException("Incorrect psp");
            }
            if( isAge(age) == false)//age < 0  || age > 150)
            {
                throw new IllegalArgumentException("Incorrect age");
            }

            if( isPhoneValid(phone) == false) //phone == null || phone.length() <= 0)
            {
                throw new IllegalArgumentException("Incorrect phone");
            }
            return new Student(this);
        }
        private static boolean isAge(int age)  {
            if(age < 0  || age > 150) {
                return false;
            }
            return true;
        }
        private static boolean isPsp(int psp)  {
            if(psp < 0  || psp > 100) {
                return false;
            }
            return true;
        }
        private static boolean isPhoneValid(String phone)  {
            if( phone == null || phone.length() <= 0) {
                //throw new IllegalArgumentException("Incorrect name");
                return false;
            }
            return true;
        }
        private static boolean isNameValid(String name)
        {
            if(name == null || name.length() == 0)
            {
                //throw new IllegalArgumentException("Incorrect name");
                return false;
            }
            return true;
        }

    }


};
