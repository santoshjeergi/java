package JavaOOPSConstruct.SOLID.Abstract;

public class Client {
    public static void main(String[] args) {

        Employee e = new hr();

        e.suspend(true);

        Employee s = new supervisor();
        s.suspend(true);
    }
}
