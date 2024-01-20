package Test.ProdConsumer;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {

        Semaphore consSem = new Semaphore(0);
        Semaphore prodSem = new Semaphore(5);
        Queue<Object> store = new LinkedList<>();
        HashSet<String> hs = new HashSet<>();

        for(int i = 1; i < 400; i++)
        {
            Consumer c = new Consumer("c" + i, consSem, prodSem,store, hs);


            Producer p = new Producer("c" + i, consSem, prodSem,store, hs);
            Thread tc = new Thread(c);
            tc.start();
            Thread tp = new Thread(p);
            tp.start();
        }


    }
}
