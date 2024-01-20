package JavaOOPSConstruct.SOLID.Interfaces;

public interface Interface1 {
    public void fun();
    public default void fun0()
    {
        System.out.println("in fun0");
    }
}
