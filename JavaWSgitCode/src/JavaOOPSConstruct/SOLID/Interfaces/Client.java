package JavaOOPSConstruct.SOLID.Interfaces;

public class Client {
    public static void main(String[] args) {
        C c = new C();
        c.fun0();

        System.out.println("----------------");
        ImplemtI1I2 i = new ImplemtI1I2();
        i.fun();
    }
}
