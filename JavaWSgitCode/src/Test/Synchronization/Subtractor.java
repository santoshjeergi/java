package Test.Synchronization;

public class Subtractor implements Runnable{
    private Counter count;

    Subtractor(Counter count)
    {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 1000000; i++)
        {
            count.decrement();
        }
    }
}
