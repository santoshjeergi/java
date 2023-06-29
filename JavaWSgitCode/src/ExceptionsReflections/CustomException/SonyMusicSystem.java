package ExceptionsReflections.CustomException;

public class SonyMusicSystem implements MusicSystem{
    @Override
    public void play() {
        System.out.println("Playing sony");
    }

    @Override
    public void pause() {
        System.out.println("pause sony");
    }
}
