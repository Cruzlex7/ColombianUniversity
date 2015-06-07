/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.DAO;

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
public class InscripcionMateriaDAO {
    
    Connection conx;
    
    public LinkedList<InscripcionMateriaModel> buscarInscripcionMateria(int id){
            LinkedList<InscripcionMateriaModel> list = new  LinkedList<InscripcionMateriaModel>();
     
        conx = ConexionDbPool.obtenerConexion();
        
        try {
            
            String sql2="select * from t_inscripcion_materia where im_id_alumno_carrera='"+id+"'";
            PreparedStatement sta2 = conx.prepareStatement(sql2);
            ResultSet datos2 = sta2.executeQuery();
            
            while(datos2.next()) {         
               list.add(new InscripcionMateriaModel(datos2.getInt(1), datos2.getInt(2),
                        datos2.getInt(3),datos2.getInt(4),datos2.getDate(5),datos2.getDate(6)));
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
        
    
    
}
