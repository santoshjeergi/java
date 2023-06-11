package Synchonization.Sol1LocksSynchorizedMethods;

public class Counter {
    private int countVal;
    Counter(int countVal)
    {
        this.countVal = countVal;
    }
   synchronized int getCountVal()
    {
        return countVal;
    }
    synchronized void  incCount(int i)
    {
        countVal +=i;
    }

}
