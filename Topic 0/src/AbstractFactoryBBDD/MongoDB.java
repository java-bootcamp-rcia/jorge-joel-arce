package AbstractFactoryBBDD;

public class MongoDB implements Database {
    @Override
    public void getDatabaseName() {
        System.out.println("MongoDB database");
    }
}
