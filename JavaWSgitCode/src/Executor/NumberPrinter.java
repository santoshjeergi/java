package Executor;

public class NumberPrinter implements Runnable{
    private  int i;
    NumberPrinter(int i )
    {
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println( i + " printed by " + Thread.currentThread().getName());
    }
}
