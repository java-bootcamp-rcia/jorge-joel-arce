package AbstractFactoryBBDD;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("sql");
        Database bbdd1 = abstractFactory.getDatabase("mysql");
        bbdd1.getDatabaseName();

        AbstractFactory abstractFactory2 = FactoryProducer.getFactory("sql");
        Database bbdd2 = abstractFactory2.getDatabase("sqlserver");
        bbdd2.getDatabaseName();

        AbstractFactory abstractFactory3 = FactoryProducer.getFactory("nosql");
        Database bbdd3 = abstractFactory3.getDatabase("mongodb");
        bbdd3.getDatabaseName();
        AbstractFactory abstractFactory4 = FactoryProducer.getFactory("nosql");
        Database bbdd4 = abstractFactory4.getDatabase("couchdb");
        bbdd4.getDatabaseName();
    }
}
