package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.ConexionDbPool;
import co.umb.ColombianUniversity.Model.ProfesorModel;
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
public class ProfesorDAO {
    
    private Connection conx;
    
    public ProfesorModel buscarProfesor(int id)
    {
        conx = ConexionDbPool.obtenerConexion();
        ProfesorModel profesor = null;
        try {
            
            String sql="select * from t_profesor where pro_id_profesor='"+id+"'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            if(datos.next()) {         
                profesor = new ProfesorModel(datos.getInt(1), datos.getString(2), datos.getString(4), datos.getString(3), datos.getString(5));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profesor;
    }
    
    public ArrayList<ProfesorModel> buscarProfesores()
    {
        conx = ConexionDbPool.obtenerConexion();
        ArrayList<ProfesorModel> profesores = new ArrayList<ProfesorModel>();
        try {
            
            String sql="select * from t_profesor";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            while(datos.next()) {         
                profesores.add(new ProfesorModel(datos.getInt(1), datos.getString(2), datos.getString(4), datos.getString(3), datos.getString(5)));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profesores;
    }
    
    public ArrayList<Object[]> buscarProfesoresyAlumnos()
    {
        conx = ConexionDbPool.obtenerConexion();
        ArrayList<Object[]> profesores = new ArrayList<Object[]>();
        try {
            
            String sql="select t_profesor_alumno.pa_id_profesor,t_profesor.pro_nombre,t_profesor_alumno.pa_id_alumno,t_alumno.alum_nombre from t_profesor_alumno inner join t_profesor on t_profesor_alumno.pa_id_profesor = t_profesor.pro_id_profesor inner join t_alumno on t_profesor_alumno.pa_id_alumno = t_alumno.alum_id_alumno";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            while(datos.next()) {         
                profesores.add(new Object[]{datos.getInt(1), datos.getString(2), datos.getInt(3), datos.getString(4)});
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profesores;
    }
    
    public ArrayList<Object[]> buscarAlumnosyCarrera()
    {
        conx = ConexionDbPool.obtenerConexion();
        ArrayList<Object[]> profesores = new ArrayList<Object[]>();
        try {
            
            String sql="select t_profesor_alumno.pa_id_alumno,t_alumno.alum_nombre,t_alumno.alum_apellido from t_profesor_alumno inner join t_alumno on t_profesor_alumno.pa_id_alumno = t_alumno.alum_id_alumno";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            while(datos.next()) {         
                profesores.add(new Object[]{datos.getInt(1), datos.getString(2), datos.getString(3)});
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profesores;
    }
    
    public boolean agregarProfesor(int id,String nombre,String segundoNombre,String apellido,String segundoApellido)
    {
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql="insert into t_profesor values ('"+id+"','"+nombre+"','"+apellido+"','"+segundoNombre+"','"+segundoApellido+"')";
            PreparedStatement sta = conx.prepareStatement(sql);
            int dato = sta.executeUpdate();
            
            conx.close();
            
            conx = ConexionDbPool.obtenerConexion();
            String sql2="insert into t_usuarios values ('"+id+"','"+2+"','"+id+"')";
            PreparedStatement sta2 = conx.prepareStatement(sql2);
            int dato2 = sta2.executeUpdate();
            conx.close();
            return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean asignarEstudiante(int idEstudiante,int idProfesor)
    {
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql="insert into t_profesor_alumno (pa_id_alumno,pa_id_profesor) values ('"+idEstudiante+"','"+idProfesor+"')";
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
            
            String sql="delete from t_profesor where pro_id_profesor='"+id+"'";
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
