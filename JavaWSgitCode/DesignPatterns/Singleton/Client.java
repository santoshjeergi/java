package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        ThreadTarget1 target1 = new ThreadTarget1();
        ThreadTarget2 target2 = new ThreadTarget2();
        Thread t1 = new Thread(target1);
        Thread t2 = new Thread(target2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
