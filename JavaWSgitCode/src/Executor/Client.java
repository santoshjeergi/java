package Executor;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) {

       // withExecutor();
        try {
            withCallableArayGreeting();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("i'm in:" + Thread.currentThread().getName());

    }

    public static  void withCallableArayGreeting() throws ExecutionException, InterruptedException {
        ExecutorService ec = Executors.newFixedThreadPool(10);

        ArrayList<Future<String>> allPromises = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            GreetingsCreator gc = new GreetingsCreator();
            Future<String> promize = ec.submit(gc);
            allPromises.add(promize);
        }
        System.out.println("Pulling results");

        for(Future<String> promise: allPromises)
        {
            String s = promise.get();
            System.out.println(s);
        }
        ec.shutdown();
    }

    public static void withCallable()
    {

        GreetingsCreator gc = new GreetingsCreator();

        ExecutorService ec = Executors.newFixedThreadPool(10);


        for(int i = 0; i < 10; i++) {
            Future<String> PromiseofGreeting = ec.submit(gc);

            //System.out.println("Job submitted in Waiting Queu");

            String s = null;
            try {
                s = PromiseofGreeting.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println(s  + " from " + Thread.currentThread().getName());
        }
        ec.shutdown();
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
