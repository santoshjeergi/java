package Synchonization.Soln1Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        Counter c = new Counter(10);
        Adder a = new Adder(c, lock);
        Subtrator s = new Subtrator(c, lock);

        Thread addThread = new Thread(a);

        Thread subThread = new Thread(s);

        addThread.start();
        subThread.start();

        addThread.join();
        subThread.join();
        System.out.println(c.countVal);
    }
}
