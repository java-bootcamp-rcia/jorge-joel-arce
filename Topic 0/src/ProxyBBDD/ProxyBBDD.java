package ProxyBBDD;

public class ProxyBBDD implements Conexion {

    private ConexionImpl dataBase = new ConexionImpl();

    public ProxyBBDD() {
    }


    @Override
    public void setNombreServer(String nombreServer) {
        dataBase.setNombreServer(nombreServer);
    }

    @Override
    public void setUser(String user) {
        dataBase.setUser(user);
    }

    @Override
    public void setPassword(String password) {
        dataBase.setPassword(password);
    }

    @Override
    public void setDatasource(String datasource) {
        dataBase.setDatasource(datasource);
    }

    public Conexion getDataBase() {
        return dataBase;
    }


}
