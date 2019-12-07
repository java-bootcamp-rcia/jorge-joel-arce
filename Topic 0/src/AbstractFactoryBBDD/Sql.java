package AbstractFactoryBBDD;

public class Sql extends AbstractFactory {
    @Override
    Database getDatabase(String database) {
        if (database.equalsIgnoreCase("Mysql")){
            return new Mysql();
        }else if(database.equalsIgnoreCase("SqlServer")){
            return new SqlServer();
        }
        return null;
    }
}
