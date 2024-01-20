package Test.Synchronization;

public class Counter {
    private int count;

/*   synchronized void increment() {
        count++;
    }
*/
    void increment() {
        synchronized (this) {
            count++;
        }
    }

    /*synchronized void decrement()
    {
        count--;
    }*/
    void decrement()
    {
        synchronized (this) {
            count--;
        }
    }
    int getCount()
    {
        return count;
    }
}
