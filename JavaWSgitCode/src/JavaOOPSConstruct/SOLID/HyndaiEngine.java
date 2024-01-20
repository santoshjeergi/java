package JavaOOPSConstruct.SOLID;

public class HyndaiEngine implements IEngine{
    @Override
    public void start() {
        System.out.println("Hyndai engine: start");
    }

    @Override
    public void stop() {
        System.out.println("hydai engine stop");
    }
}
