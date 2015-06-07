/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.ConexionDbPool;
import co.umb.ColombianUniversity.Model.InscripcionMateriaModel;
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
public class EstadoMateriaDao {
    
    Connection conx;
    
    public String buscarEstadoMateria(int idEstado){
           
        conx = ConexionDbPool.obtenerConexion();
        String estado = "";
        try {
            
            String sql2="select * from t_estado_materia where esm_id_estado_materia='"+idEstado+"'";
            PreparedStatement sta2 = conx.prepareStatement(sql2);
            ResultSet datos2 = sta2.executeQuery();
            
           if(datos2.next()) {         
               estado = datos2.getString(2);
            }
            
             conx.close();
             
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
  
    }
    
    
}
