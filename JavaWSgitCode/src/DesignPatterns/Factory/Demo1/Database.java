package DesignPatterns.Factory.Demo1;

abstract public class Database {

    abstract Query getQuery();

    public void work(){
        Query q = getQuery();
        q.execute();
    }
}
