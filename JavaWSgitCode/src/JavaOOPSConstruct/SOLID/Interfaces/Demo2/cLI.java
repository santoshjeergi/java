package JavaOOPSConstruct.SOLID.Interfaces.Demo2;

import ExceptionsReflections.CustomException.SonyMusicSystem;

public class cLI {

    public static void main(String[] args) {

        MusicSystem ms = new Bose();
        Car c = new Car(ms);
        c.Play();
        ms = new Sony();
        c.setMusicSystem(ms);
        c.Play();
    }
}
