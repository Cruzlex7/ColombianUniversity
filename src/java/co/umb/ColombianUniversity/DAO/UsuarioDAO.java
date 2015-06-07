package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.ConexionDbPool;
import co.umb.ColombianUniversity.Model.UsuarioModel;
import co.umb.ColombianUniversity.Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JorgeIvan
 */
public class UsuarioDAO {
    
    private Connection conx;
    
    public UsuarioModel login(String usuario,String pass)
    {
        conx = ConexionDbPool.obtenerConexion();
        UsuarioModel usu = null;
        try {
            
            String sql="select * from t_usuarios where usu_id_nombre_usuario='"+usuario+"' and usu_contrasena='"+pass+"'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            if(datos.next()) {         
                usu = new UsuarioModel(datos.getString(1), datos.getString(3), datos.getInt(2));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }
    
    
    
    
}
