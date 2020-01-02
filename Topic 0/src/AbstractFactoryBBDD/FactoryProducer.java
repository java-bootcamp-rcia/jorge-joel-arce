package AbstractFactoryBBDD;

public class FactoryProducer {
    public static AbstractFactory getFactory(String flag){
        if(flag.equalsIgnoreCase("sql")){
            return new Sql();
        }else if(flag.equalsIgnoreCase("nosql")){
            return new NoSql();
        }
        return null;
    }
}
