package Synchonization.ProducerConsumer_Semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> store;
    private Semaphore prodSem;
    private  Semaphore consSem;
    private String name;
    private  ConcurrentSkipListSet<String> peopleInstore;

    Consumer(String name, Queue<Object> store , Semaphore prodSem, Semaphore consSem, ConcurrentSkipListSet<String> peopleInstore) {
        this.consSem = consSem;
        this.prodSem = prodSem;
        this.store = store;
        this.name = name;
        this.peopleInstore = peopleInstore;
    }
    @Override
    public void run() {
        try {
            consSem.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        store.remove();
        prodSem.release();
        //peopleInstore.remove(name);
        System.out.println(name + " Removed from Queue storeSize:" + store.size()) ;
    }
}
