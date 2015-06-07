/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.AlumnoModel;
import co.umb.ColombianUniversity.Model.ConexionDbPool;
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
public class AlumnoDAO {
    
    Connection conx;
    
     public AlumnoModel buscarAlumno(int id)
    {
        conx = ConexionDbPool.obtenerConexion();
        AlumnoModel alumno = null;
        try {
            
            String sql="select * from t_alumno where alum_id_alumno='"+id+"'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            if(datos.next()) {         
                alumno = new AlumnoModel(datos.getInt(1), datos.getString(2)
                        ,datos.getString(3),datos.getInt(4),datos.getInt(5)
                      ,datos.getInt(6));
            }            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alumno;
    }
    
      public LinkedList<AlumnoModel> buscarAlumnos()
    {
        LinkedList<AlumnoModel> list = new LinkedList<AlumnoModel>();
        conx = ConexionDbPool.obtenerConexion();        
        try {
            
            String sql="select * from t_alumno";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            
            while(datos.next()) {         
               list.add(new AlumnoModel(datos.getInt(1), datos.getString(2)
                        ,datos.getString(3),datos.getInt(4),datos.getInt(5)
                      ,datos.getInt(6)));
            }
            
            conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    
    
}
