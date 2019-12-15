package SingletonBBDD;

public class Conexion {

    private static Conexion conexion;
    private String stringDeConexion;

    private Conexion(String stringDeConexion){
        this.stringDeConexion = stringDeConexion;
    }

    public static Conexion getConexion(String stringDeConexion){

        if(conexion==null){
            conexion = new Conexion(stringDeConexion);
        }
        return conexion;
    }

    public static Conexion getConexion() {
        return conexion;
    }

    public static void setConexion(Conexion conexion) {
        Conexion.conexion = conexion;
    }

    public String getStringDeConexion() {
        return stringDeConexion;
    }

    public void setStringDeConexion(String stringDeConexion) {
        this.stringDeConexion = stringDeConexion;
    }
}
