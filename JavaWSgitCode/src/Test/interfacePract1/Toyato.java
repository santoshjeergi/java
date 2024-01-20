package Test.interfacePract1;

public class Toyato implements Engine{

    @Override
    public void start() {
        System.out.println("starting toyato");
    }

    @Override
    public void stop() {
        System.out.println("stopping toyato");

    }
}
