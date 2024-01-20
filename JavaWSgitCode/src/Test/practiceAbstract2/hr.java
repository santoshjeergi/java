package Test.practiceAbstract2;

public class hr extends Employee{

    hr(String name, String email) {
        super(name, email);
    }

    @Override
    public String getname() {
        return "hr" + super.getname();
    }

    @Override
    public String getemail() {
        return "hr" + super.getemail();
    }
}
