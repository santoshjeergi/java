package Synchonization.Soln1Locks;

import java.util.PrimitiveIterator;
import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Counter counter;
    private Lock lock;
    Adder(Counter c, Lock lock)
    {
        this.counter = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            counter.countVal +=i;
            lock.unlock();
        }

    }
}