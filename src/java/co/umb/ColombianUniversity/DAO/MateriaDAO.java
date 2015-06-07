package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.ConexionDbPool;
import co.umb.ColombianUniversity.Model.MateriaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JorgeIvan
 */
public class MateriaDAO {
    
    private Connection conx;
    
    public MateriaModel buscarMateria(int id)
    {
        conx = ConexionDbPool.obtenerConexion();
        MateriaModel materia = null;
        try {
            
            String sql="select * from t_materia where mat_id_materia='"+id+"'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            if(datos.next()) {         
                materia = new MateriaModel(datos.getInt(1), datos.getString(2));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materia;
    }
    
    public ArrayList<MateriaModel> buscarMaterias()
    {
        conx = ConexionDbPool.obtenerConexion();
        ArrayList<MateriaModel> materias = new ArrayList<MateriaModel>();
        try {
            
            String sql="select * from t_materia";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            while(datos.next()) {         
                materias.add(new MateriaModel(datos.getInt(1), datos.getString(2)));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return materias;
    }
    
    public boolean agregarMateria(String nombre)
    {
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql="insert into t_materia (mat_nombre_materia) values ('"+nombre+"')";
            PreparedStatement sta = conx.prepareStatement(sql);
            int dato = sta.executeUpdate();
            conx.close();
            return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminarMateria(int id)
    {
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql="delete from t_materia where mat_id_materia='"+id+"'";
            PreparedStatement sta = conx.prepareStatement(sql);
            int dato = sta.executeUpdate();
            conx.close();
            return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
