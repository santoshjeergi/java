package ExceptionsReflections.CustomException;

public class Client {
    public static void main(String[] args) {

        Car c = new Car();

      try {
          MusicSystem ms = new SonyMusicSystem();
         // c.setMs(ms);
          c.play();
      }catch ( MusicSystemNotPluggedException ex)
      {
          System.out.println(ex);
      }
    }
}
