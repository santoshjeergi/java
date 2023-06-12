package Synchonization.ProducerConsumer_Semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private     Queue<Object> store;
    private Semaphore prodSem;
    private  Semaphore consSem;
    private String name;
    ConcurrentSkipListSet<String> peopleInstore;

    Producer(String name, Queue<Object> store , Semaphore prodSem, Semaphore consSem, ConcurrentSkipListSet<String> peopleInstore) {
        this.consSem = consSem;
        this.prodSem = prodSem;
        this.store = store;
        this.name = name;
        this.peopleInstore = peopleInstore;

    }
    @Override
    public void run() {
        try {
            prodSem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Object obj = new Object();
        store.add(obj);
        consSem.release();
        peopleInstore.add(name);
        System.out.println(name + " Added into Queue storeSize:" + store.size());
    }
}
