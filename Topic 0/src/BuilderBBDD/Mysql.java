package BuilderBBDD;

public class Mysql extends ConexionBuilder{
    @Override
    public void buildNombreServer() {
        conexion.setNombreServer("Mysql");
    }

    @Override
    public void buildUser() {
        conexion.setUser("UsuarioMysql");
    }

    @Override
    public void buildPassword() {
        conexion.setPassword("1234");
    }

    @Override
    public void buildDatasource() {
        conexion.setDatasource("localhost:3306");
    }


}
