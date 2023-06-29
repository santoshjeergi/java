package ExceptionsReflections.CustomException;

public class Car {
private MusicSystem ms;

    public void setMs(MusicSystem ms) {
        this.ms = ms;
    }
    void play() throws  MusicSystemNotPluggedException
    {
        if(ms == null)
        {
            throw new MusicSystemNotPluggedException();
        }
        ms.play();
    }
    void pause()
    {
        ms.pause();
    }
}
