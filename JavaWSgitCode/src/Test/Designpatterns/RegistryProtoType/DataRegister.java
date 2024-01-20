package Test.Designpatterns.RegistryProtoType;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class DataRegister {

    private Map<String, Student> datastore = new HashMap<>();

    static ReentrantLock lock = new ReentrantLock();
    public static DataRegister instance;

    public static DataRegister getInstance() {
        if(instance == null)
        {
            lock.lock();
            if(instance == null) {
                instance = new DataRegister();
            }
            lock.unlock();
        }
        return instance;
    }
    public static void register(String s, Student st)
    {
        getInstance().datastore.put(s,st);
    }
    public static Student getPrototype(String s)
    {
        return getInstance().datastore.get(s);
    }
}
