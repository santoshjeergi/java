package DesignPatterns.Factory.Demo1;

public class MongoDB extends Database {
    @Override
    Query getQuery() {
        return new MongoQuery();
    }
}
