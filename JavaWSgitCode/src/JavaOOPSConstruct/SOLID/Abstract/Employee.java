package JavaOOPSConstruct.SOLID.Abstract;

public abstract class Employee implements Person{

    private String email;
    private String name;
    protected boolean isActive;


    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    abstract public void suspend(boolean flag);
}
