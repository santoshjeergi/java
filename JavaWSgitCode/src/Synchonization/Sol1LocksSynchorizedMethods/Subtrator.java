package Synchonization.Sol1LocksSynchorizedMethods;

import java.util.concurrent.locks.Lock;

public class Subtrator implements Runnable{

    private Counter counter;

    Subtrator(Counter c)
    {
        this.counter = c;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {

               counter.incCount(-i);


        }

    }
}
