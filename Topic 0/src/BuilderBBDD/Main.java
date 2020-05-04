package BuilderBBDD;

public class Main {
    public static void main(String[] args) {
        DirectorConexion directorConexion = new DirectorConexion();
        ConexionBuilder mysql = new Mysql();
        ConexionBuilder sqlserver = new Sqlserver();

        directorConexion.setConexionBuilder(mysql);
        directorConexion.crearConexion();
        Conexion conexion = directorConexion.getConexion();

        System.out.println(conexion);
    }
}
