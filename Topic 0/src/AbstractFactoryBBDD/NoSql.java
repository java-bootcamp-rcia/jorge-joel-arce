package AbstractFactoryBBDD;

public class NoSql extends AbstractFactory {
    @Override
    Database getDatabase(String database) {
        if(database.equalsIgnoreCase("MongoDB")){
            return new MongoDB();
        }else if(database.equalsIgnoreCase("CouchDB")){
            return new CouchDB();
        }
        return null;

    }
}
