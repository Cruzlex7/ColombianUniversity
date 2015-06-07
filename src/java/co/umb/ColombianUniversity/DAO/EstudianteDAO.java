package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.ConexionDbPool;
import co.umb.ColombianUniversity.Model.EstudianteModel;
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
public class EstudianteDAO {
    
    private Connection conx;
    
    public EstudianteModel buscarProfesor(int id)
    {
        conx = ConexionDbPool.obtenerConexion();
        EstudianteModel estudiante = null;
        try {
            
            String sql="select t_alumno.alum_id_alumno,t_alumno.alum_nombre,t_alumno.alum_segundo_nombre,t_alumno.alum_apellido,t_alumno.alum_segundo_apellido,t_tipo_documento.td_documento,t_domicilio.dom_avenida,t_domicilio.dom_calle,t_domicilio.dom_carrera,t_domicilio.dom_barrio,t_domicilio.dom_numero_casa, t_genero.g_genero from t_alumno inner join t_tipo_documento on t_alumno.alum_id_tipo_documento = t_tipo_documento.td_id_documento inner join t_domicilio on t_domicilio.dom_id_alumno = t_alumno.alum_id_alumno inner join t_genero on t_alumno.alum_id_genero = t_genero.g_id_genero where alum_id_alumno='"+id+"'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            if(datos.next()) {         
                estudiante = new EstudianteModel(datos.getInt(1), datos.getString(2), datos.getString(3), datos.getString(4), datos.getString(5), datos.getString(6), datos.getString(7), datos.getString(8), datos.getString(9), datos.getString(10), datos.getInt(11), datos.getString(12));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estudiante;
    }
    
    public ArrayList<EstudianteModel> buscarEstudiantes()
    {
        conx = ConexionDbPool.obtenerConexion();
        ArrayList<EstudianteModel> estudiantes = new ArrayList<EstudianteModel>();
        try {
            
            String sql="select t_alumno.alum_id_alumno,t_alumno.alum_nombre,t_alumno.alum_segundo_nombre,t_alumno.alum_apellido,t_alumno.alum_segundo_apellido,t_tipo_documento.td_documento,t_domicilio.dom_avenida,t_domicilio.dom_calle,t_domicilio.dom_carrera,t_domicilio.dom_barrio,t_domicilio.dom_numero_casa, t_genero.g_genero from t_alumno inner join t_tipo_documento on t_alumno.alum_id_tipo_documento = t_tipo_documento.td_id_documento inner join t_domicilio on t_domicilio.dom_id_alumno = t_alumno.alum_id_alumno inner join t_genero on t_alumno.alum_id_genero = t_genero.g_id_genero";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            while(datos.next()) {         
                estudiantes.add(new EstudianteModel(datos.getInt(1), datos.getString(2), datos.getString(3), datos.getString(4), datos.getString(5), datos.getString(6), datos.getString(7), datos.getString(8), datos.getString(9), datos.getString(10), datos.getInt(11), datos.getString(12)));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estudiantes;
    }
    
    public boolean agregarEstudiante(int documento, String nombre, String segNombre, String apellido, String segApellido, int tipoDocumento, String avenida, String calle, String carrera, String barrio, int casa,int genero)
    {
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql="insert into t_alumno values ('"+documento+"','"+nombre+"','"+apellido+"','"+tipoDocumento+"','"+genero+"','"+segNombre+"','"+segApellido+"')";
            PreparedStatement sta = conx.prepareStatement(sql);
            int dato = sta.executeUpdate();
            
            conx.close();
            
            conx = ConexionDbPool.obtenerConexion();
            String sql2="insert into t_usuarios values ('"+documento+"','"+3+"','"+documento+"')";
            PreparedStatement sta2 = conx.prepareStatement(sql2);
            int dato2 = sta2.executeUpdate();
            conx.close();
            
            conx = ConexionDbPool.obtenerConexion();
            String sql3="insert into t_domicilio (dom_avenida,dom_calle,dom_carrera,dom_barrio,dom_numero_casa,dom_id_alumno) values ('"+avenida+"','"+calle+"','"+carrera+"','"+barrio+"','"+casa+"','"+documento+"')";
            PreparedStatement sta3 = conx.prepareStatement(sql3);
            int dato3 = sta3.executeUpdate();
            conx.close();
            return true;
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminarEstudiante(int id)
    {
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql="delete from t_alumno where alum_id_alumno='"+id+"'";
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
