package BuilderBBDD;

public class DirectorConexion {
    private ConexionBuilder conexionBuilder;

    public void setConexionBuilder(ConexionBuilder conexionBuilder) {
        this.conexionBuilder = conexionBuilder;
    }

    public Conexion getConexion(){
        return conexionBuilder.getConexion();
    }

    public void crearConexion(){
        conexionBuilder.crearConexion();
        conexionBuilder.buildNombreServer();
        conexionBuilder.buildUser();
        conexionBuilder.buildPassword();
        conexionBuilder.buildDatasource();
    }
}
