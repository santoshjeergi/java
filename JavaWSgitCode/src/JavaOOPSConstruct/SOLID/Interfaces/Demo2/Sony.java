package JavaOOPSConstruct.SOLID.Interfaces.Demo2;

public class Sony implements MusicSystem{
    @Override
    public void play() {
        System.out.println(" Sony play");
    }

    @Override
    public void stop() {
        System.out.println("Sony stop");
    }

    @Override
    public void rewind() {
        System.out.println("Sony rewind");
    }

    @Override
    public void pause() {
        System.out.println("Sony pause");
    }
}
