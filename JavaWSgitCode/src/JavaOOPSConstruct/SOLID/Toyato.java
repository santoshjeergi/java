package JavaOOPSConstruct.SOLID;

public class Toyato implements IEngine{
    @Override
    public void start() {
        System.out.println("start toyato engine");
    }

    @Override
    public void stop() {
        System.out.println("stop toyato enging");
    }
}
