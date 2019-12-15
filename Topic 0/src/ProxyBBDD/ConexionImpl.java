package ProxyBBDD;

public class ConexionImpl implements Conexion {
    private String nombreServer;
    private String user;
    private String password;
    private String datasource;

    public void setNombreServer(String nombreServer) {
        this.nombreServer = nombreServer;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    @Override
    public String toString() {
        return "ConexionImpl{" +
                "nombreServer='" + nombreServer + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", datasource='" + datasource + '\'' +
                '}';
    }
}
