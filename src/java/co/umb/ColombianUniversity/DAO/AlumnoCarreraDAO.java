/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.AlumnoCarreraModel;
import co.umb.ColombianUniversity.Model.ConexionDbPool;
import co.umb.ColombianUniversity.Model.InscripcionMateriaModel;
import co.umb.ColombianUniversity.Model.MateriaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander
 */
public class AlumnoCarreraDAO {
    
    
    Connection conx;
    
    public LinkedList<AlumnoCarreraModel> buscarAlumnoCarrera(int id){
            LinkedList<AlumnoCarreraModel> list = new  LinkedList<AlumnoCarreraModel>();
     
        conx = ConexionDbPool.obtenerConexion();
       
        try {
            String sql2="select ac_id_alumno_carrera,ac_id_alumno,ac_id_carrera,"
                    + "ac_fecha_tramite,c_nombre_carrera from t_alumno_carrera"
                    + " inner join t_carrera on ac_id_carrera =c_id_carrera"
                    + " where ac_id_alumno ='"+id+"'";
            PreparedStatement sta2 = conx.prepareStatement(sql2);
            ResultSet datos2 = sta2.executeQuery();
            
            while(datos2.next()) {         
                list.add(new AlumnoCarreraModel(datos2.getInt(1), datos2.getInt(2),datos2.getInt(3),datos2.getDate(4),datos2.getString(5)));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
}
