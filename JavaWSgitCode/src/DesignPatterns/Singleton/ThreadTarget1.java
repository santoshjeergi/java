package DesignPatterns.Singleton;

public class ThreadTarget1 implements Runnable {
    private DBFDemo ref;
    @Override
    public void run() {
        DBFDemo int1 =  DBFDemo.getInstance();
        ref = int1;
        System.out.println(ref);
    }
}
