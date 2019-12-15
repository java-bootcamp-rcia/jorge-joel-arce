package ProxyBBDD;

public class Main {

    public static void main(String[] args) {


        Conexion conexion= new ProxyBBDD();
        conexion.setNombreServer("Mysql");
        conexion.setUser("qwery");
        conexion.setPassword("1234");
        conexion.setDatasource("localhost:3306");
        System.out.println(((ProxyBBDD) conexion).getDataBase());
    }
}
