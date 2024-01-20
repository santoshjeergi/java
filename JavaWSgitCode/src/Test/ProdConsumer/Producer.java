package Test.ProdConsumer;

import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Semaphore consSem;
    Semaphore prodSem;
    String name;
    Queue<Object> store;
    HashSet<String> instore;
    Producer( String name, Semaphore consSem, Semaphore prodSem, Queue<Object> store, HashSet<String> instore )
    {
        this.name = name;
        this.consSem = consSem;
        this.prodSem = prodSem;
        this.store = store;
        this.instore = instore;
    }
    @Override
    public void run() {
        try {
            prodSem.acquire();
            instore.add(name);
            store.add(new Object());
            System.out.println(name + " producer storeSize:" + store.size() + " " + instore.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        instore.remove(name);
        consSem.release();
    }
}
