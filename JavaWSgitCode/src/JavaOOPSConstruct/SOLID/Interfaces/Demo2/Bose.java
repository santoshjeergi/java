package JavaOOPSConstruct.SOLID.Interfaces.Demo2;

public class Bose implements MusicSystem{
    @Override
    public void play() {
        System.out.println(" Bose play");
    }

    @Override
    public void stop() {
        System.out.println("Bose stop");
    }

    @Override
    public void rewind() {
        System.out.println("Bose rewind");
    }

    @Override
    public void pause() {
        System.out.println("Bose pause");
    }
}
