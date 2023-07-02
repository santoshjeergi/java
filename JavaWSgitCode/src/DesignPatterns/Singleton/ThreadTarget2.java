package DesignPatterns.Singleton;

public class ThreadTarget2 implements Runnable {
    private DBFDemo ref;
    @Override
    public void run() {
        DBFDemo int1 =  DBFDemo.getInstance();
        ref = int1;
        System.out.println( ref);
    }
}
