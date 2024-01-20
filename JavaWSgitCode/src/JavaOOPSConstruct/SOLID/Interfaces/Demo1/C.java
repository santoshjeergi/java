package JavaOOPSConstruct.SOLID.Interfaces.Demo1;

public class C implements I1{
    int x = 78;
    @Override
    public void fun() {
        System.out.println("x:" + x);
        System.out.println("I1.1" + I1.x);
    }
}
