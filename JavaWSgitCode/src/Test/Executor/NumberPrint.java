package Test.Executor;

public class NumberPrint implements Runnable{
    int i ;
    NumberPrint(int i)
    {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Number :" + i  + " run by:" + Thread.currentThread().getName());
    }
}
