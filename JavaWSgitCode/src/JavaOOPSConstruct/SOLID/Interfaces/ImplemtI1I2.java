package JavaOOPSConstruct.SOLID.Interfaces;

public class ImplemtI1I2 implements I1, I2 {
    @Override
    public void fun() {
        System.out.println("In class fun");
        I1.super.fun();
        I2.super.fun();
    }
}
