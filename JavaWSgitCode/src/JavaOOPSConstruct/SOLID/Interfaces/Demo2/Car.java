package JavaOOPSConstruct.SOLID.Interfaces.Demo2;

public class Car {

    int mileage;
    MusicSystem ms;

    Car(MusicSystem ms) {
        this.ms = ms;
    }
    public void Play()
    {
        ms.play();
    }
    public void Pause()
    {
        ms.pause();
    }
    public void setMusicSystem( MusicSystem ms)
    {
        this.ms = ms;
    }
}
