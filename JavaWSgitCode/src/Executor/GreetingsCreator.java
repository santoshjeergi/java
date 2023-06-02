package Executor;

import java.util.Random;
import java.util.concurrent.Callable;

public class GreetingsCreator implements Callable<String> {
    @Override
    public String call() throws Exception {
        Random r = new Random();
        int v = Math.abs(r.nextInt()) %5;
        System.out.println(Thread.currentThread().getName());
        if(v == 1)
        {
            return "Hi";
        } else if( v == 2)
        {
            return "Hello";
        } else if(v == 3)
        {
            return "GoodMorning";
        } else
        {
            return "Halo";
        }

    }
}
