package BuilderBBDD;

public class Sqlserver extends ConexionBuilder {
    @Override
    public void buildNombreServer() {
        conexion.setNombreServer("Sql Server");
    }

    @Override
    public void buildUser() {
        conexion.setUser("UserSqlServer");
    }

    @Override
    public void buildPassword() {
        conexion.setPassword("1234");
    }

    @Override
    public void buildDatasource() {
        conexion.setDatasource("127.0.0.1:3306");
    }
}
