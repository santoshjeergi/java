package Synchonization.ProducerConsumer_Semaphores;

import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> store = new ConcurrentLinkedQueue<>();
        int maxCapacity = 5;
        Semaphore prodSem = new Semaphore(maxCapacity);
        Semaphore consSem = new Semaphore(0);

        ConcurrentSkipListSet<String> peopleInstore = new ConcurrentSkipListSet<>();

        for(int i = 0; i < 1000; i++)
        {
            Producer producer = new Producer( "p" + i,  store, prodSem, consSem, peopleInstore);
            Consumer consumer  = new Consumer("c" + i, store, prodSem, consSem, peopleInstore);

            Thread prodThread = new Thread(producer);
            prodThread.start();
            Thread consThread = new Thread(consumer);
            consThread.start();
        }


    }
}
