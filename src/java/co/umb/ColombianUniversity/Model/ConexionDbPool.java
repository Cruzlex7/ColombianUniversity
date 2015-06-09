package co.umb.ColombianUniversity.Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.ds.PGPoolingDataSource;

/**
 *
 * @author Practica
 */
public class ConexionDbPool {
    
    private static ConexionDbPool conexionpool = null;
    private static PGPoolingDataSource ds = null;
    
    
    static {
        conexionpool = new ConexionDbPool();
    }    
    private ConexionDbPool(){        
        ds = new PGPoolingDataSource();
        ds.setApplicationName("postgres");
//      ds.setServerName("uckk5dc01d83.cruzlex7.koding.io");
        ds.setServerName("localhost");   
        ds.setPortNumber(5432);
        ds.setUser("postgres"); 
        ds.setPassword("www.pc.com77");
        ds.setDatabaseName("AdministracionAcademica");
        ds.setMaxConnections(50);
    }    
    public static Connection obtenerConexion(){        
        try {
            return ds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDbPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
    public void cerrarConexion(){
        ds.close();
    }    
}
