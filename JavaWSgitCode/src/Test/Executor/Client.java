package Test.Executor;

import Test.Executor.NumberPrint;

import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {


        Executor executorService = Executors.newCachedThreadPool();
        executorService.execute(()-> System.out.println("Hello world"));

        /*for(int i = 0;i < 100; i++)
        {
            NumberPrint np;
            np = new NumberPrint(i);
            Thread t = new Thread(np);
            t.start();
        }*/


        //ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = Executors.newFixedThreadPool(5);
        /*for(int i = 0;i < 100; i++)
        {
            NumberPrint np;
            np = new NumberPrint(i);

            es.submit(np);
        } */





       /* for(int i = 0 ; i < 10; i++) {
            Greeting gc = new Greeting();
            Future<String> fs = es.submit(gc);
            String promiseString = null;
            try {
                promiseString = fs.get();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println( "Greeting:" + promiseString + "from:" + Thread.currentThread().getName());
        }
*/

        ArrayList<Future<String>> fslist = new ArrayList<>() ;
        for(int i = 0 ; i < 10; i++) {
            Greeting gc = new Greeting();

            fslist.add(es.submit(gc));
        }
        for( Future<String> fs: fslist){

            String promiseString = null;
            try {
                promiseString = fs.get();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
            System.out.println( "Greeting:" + promiseString + "from:" + Thread.currentThread().getName());
        }

        es.shutdown();
       // es.shutdown();




    }



}
