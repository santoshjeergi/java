package JavaOOPSConstruct.SOLID.Abstract;

public class supervisor extends Employee {

    @Override
    public void suspend(boolean flag) {
        System.out.println("suspend logic for supervisor");
        isActive = flag;
    }
}
