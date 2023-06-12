package Synchonization.Soln1LocksSyncronized;

public class Subtrator implements Runnable{

    private Counter counter;

    Subtrator(Counter c)
    {
        this.counter = c;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
           synchronized (counter) {
               counter.countVal -= i;
           }

        }

    }
}
