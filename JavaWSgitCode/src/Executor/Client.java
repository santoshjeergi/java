package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        withExecutor();
        System.out.println("i'm in:" + Thread.currentThread().getName());

    }

    public static void withExecutor()
    {
//        ExecutorService es = Executors.newFixedThreadPool(10);
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            es.submit(np);

        }
        es.shutdown();
    }
    public static  void withThreads()
    {
        for (int i = 0; i < 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }
    }
}
