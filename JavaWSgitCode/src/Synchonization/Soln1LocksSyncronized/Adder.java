package Synchonization.Soln1LocksSyncronized;


public class Adder implements Runnable{

    private Counter counter;

    Adder(Counter c)
    {
        this.counter = c;

    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
           synchronized (counter) {
                counter.countVal += i;
            }
        }

    }
}