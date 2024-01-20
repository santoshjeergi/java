package DesignPatterns.BuilderVer5;

public class Builder {
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

    public Student build(Builder bt)
    {
        //validate before assigning.
        if(bt.email == null || bt.email.length() == 0)
        {
            throw new IllegalArgumentException("Incorrect email");
        }
        if(bt.psp < 0  || bt.psp > 100)
        {
            throw new IllegalArgumentException("Incorrect psp");
        }
        if(bt.age < 0  || bt.age > 150)
        {
            throw new IllegalArgumentException("Incorrect age");
        }
        if(bt.name == null || bt.name.length() == 0)
        {
            throw new IllegalArgumentException("Incorrect name");
        }
        if(bt.phone == null || bt.phone.length() <= 0)
        {
            throw new IllegalArgumentException("Incorrect phone");
        }
        return new Student(bt);
    }


}
