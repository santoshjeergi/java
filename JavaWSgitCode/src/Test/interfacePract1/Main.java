package Test.interfacePract1;

public class Main {
    public static void main(String[] args) {
        Car c = new Car(new Hyndai());
        c.start();
        c.stop();
        c.changeEngine(new Toyato());
        c.start();
        c.stop();
    }
}
