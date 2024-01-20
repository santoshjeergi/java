package JavaOOPSConstruct.SOLID.Abstract;

public class hr extends Employee {

    @Override
    public void suspend(boolean flag) {
        System.out.println("suspend logic: hr");
        isActive = flag;
    }
}
