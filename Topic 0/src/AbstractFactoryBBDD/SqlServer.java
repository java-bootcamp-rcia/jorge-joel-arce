package AbstractFactoryBBDD;

public class SqlServer implements Database{
    @Override
    public void getDatabaseName() {
        System.out.println("SqlServer database");
    }
}
