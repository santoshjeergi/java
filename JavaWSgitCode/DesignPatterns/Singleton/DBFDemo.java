package DesignPatterns.Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class DBFDemo {

    //Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
    private DBFDemo() {

    }

    private static DBFDemo instance1 = null;

    private static ReentrantLock l = new ReentrantLock();

     public static DBFDemo getInstance()
    {
        if(instance1 == null)
        {
            l.lock();
                    if(instance1 == null)
                        instance1 = new DBFDemo();
            l.unlock();
        }
        return instance1;
    }
}
