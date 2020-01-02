package AbstractFactoryBBDD;

public class Mysql implements Database{
    @Override
    public void getDatabaseName() {
        System.out.println("Mysql database");
    }
}
