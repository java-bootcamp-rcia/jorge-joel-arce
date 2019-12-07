package BuilderBBDD;

public abstract class ConexionBuilder {
    protected Conexion conexion;

    public Conexion getConexion(){
        return conexion;
    }

    public void crearConexion(){
        conexion = new Conexion();
    }

    public abstract void buildNombreServer();
    public abstract void buildUser();
    public abstract void buildPassword();
    public abstract void buildDatasource();

}
