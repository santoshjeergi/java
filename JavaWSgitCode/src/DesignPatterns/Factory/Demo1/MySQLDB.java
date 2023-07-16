package DesignPatterns.Factory.Demo1;

public class MySQLDB extends Database {
    @Override
    Query getQuery() {
        return new MongoQuery();
    }
}
