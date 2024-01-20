package Test.Designpatterns.practiceSingleton;

import DesignPatterns.Singleton.DBFDemo;

public class Thread2 implements Runnable{
    DBFDemo dbfDemo;
    @Override
    public void run() {
        dbfDemo = DBFDemo.getInstance();
        System.out.println("Thread2:" + dbfDemo);
    }
}
