package Test.Executor;

import java.util.Random;
import java.util.concurrent.Callable;

public class Greeting implements Callable<String> {
    @Override
    public String call() throws Exception {
        Random r = new Random();
        int i = Math.abs(r.nextInt()) % 5;


        if( i == 0)
        {
            return "Hi";
        } else if ( i == 1)
        {
            return "hallo";
        } else if ( i== 2) {
            return "well";
        } else {
            return "allwell";
        }

    }
}
