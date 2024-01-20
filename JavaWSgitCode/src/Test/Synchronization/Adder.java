package Test.Synchronization;

public class Adder implements Runnable{
    private Counter count;

    Adder(Counter count)
    {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 1000000; i++)
        {
            count.increment();
        }
    }
}
