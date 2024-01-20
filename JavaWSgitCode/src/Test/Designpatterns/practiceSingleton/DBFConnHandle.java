package Test.Designpatterns.practiceSingleton;

import java.util.concurrent.locks.ReentrantLock;

public class DBFConnHandle {

    public  static DBFConnHandle dbfConnHandle;

    ReentrantLock lock;
    private DBFConnHandle()
    {

    }
    public DBFConnHandle getInstance()
    {
        if(dbfConnHandle == null)
        {
            lock.lock();
            if(dbfConnHandle == null)
                dbfConnHandle = new DBFConnHandle();
            lock.unlock();
        }
        return  dbfConnHandle;
    }
}
