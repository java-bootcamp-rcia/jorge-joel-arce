package AbstractFactoryBBDD;

public class CouchDB implements Database {
    @Override
    public void getDatabaseName() {
        System.out.println("CouchDB database");
    }
}
