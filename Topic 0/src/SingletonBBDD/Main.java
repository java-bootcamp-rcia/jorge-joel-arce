package SingletonBBDD;

public class Main {

    public static void main(String[] args) {
        Conexion conexion = Conexion.getConexion("jdbc:mysql://localhost:3306/prueba");
        System.out.println(conexion.getStringDeConexion());
    }
}
