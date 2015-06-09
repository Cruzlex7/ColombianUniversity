package co.umb.ColombianUniversity.DAO;

import co.umb.ColombianUniversity.Model.CarreraModel;
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
public class CarreraDAO {

    public static ArrayList<MateriaModel> materiasPlan = new ArrayList<MateriaModel>();
    private Connection conx;

    public boolean agregarCarrera(String nombre, String titulo, int plan) {
        conx = ConexionDbPool.obtenerConexion();

        try {

            String sql = "insert into t_carrera (c_nombre_carrera,c_titulo_carrera,c_id_plan_materias) values ('" + nombre + "','" + titulo + "','" + plan + "')";
            PreparedStatement sta = conx.prepareStatement(sql);
            int dato = sta.executeUpdate();
            conx.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean agregarPlanMaterias(String nombre, String titulo) {
        conx = ConexionDbPool.obtenerConexion();
        try {

            String sql = "insert into t_plan_materia (pmat_anio_cursado,pmat_semestre_cursado) values (" + null + "," + null + ")";
            PreparedStatement sta = conx.prepareStatement(sql);
            int dato = sta.executeUpdate();

            sql = "select * from t_plan_materia order by pmat_id_plan_materia desc limit 1";
            PreparedStatement sta2 = conx.prepareStatement(sql);
            ResultSet rs = sta2.executeQuery();

            int id = -1;
            if (rs.next()) {
                id = rs.getInt(1);
            }
            conx.close();
            agregarCarrera(nombre, titulo, id);
            conx = ConexionDbPool.obtenerConexion();
            for (MateriaModel materiasPlan1 : materiasPlan) {
                sql = "insert into t_plan_materias_materia (plam_id_plan_materia,plam_id_materia) values ('" + id + "','" + materiasPlan1.getId() + "')";
                PreparedStatement sta3 = conx.prepareStatement(sql);
                dato = sta3.executeUpdate();
            }
            materiasPlan = new ArrayList<MateriaModel>();
            conx.close();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public CarreraModel buscarCarrera(int id) {
        conx = ConexionDbPool.obtenerConexion();
        CarreraModel carrera = null;
        try {

            String sql = "select * from t_carrera where c_id_carrera='" + id + "'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();

            if (datos.next()) {
                carrera = new CarreraModel(datos.getInt(1), datos.getString(2), datos.getString(3), datos.getInt(4));
            }

            conx.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return carrera;
    }

    public Object[] buscarCarreraConMaterias(int id) {
        Object[] info = new Object[2];
        ArrayList<MateriaModel> materias = new ArrayList<MateriaModel>();
        try {
            info[0] = buscarCarrera(id);
            conx = ConexionDbPool.obtenerConexion();
            String sql = "select * from t_plan_materias_materia where plam_id_plan_materia='" + ((CarreraModel) (info[0])).getIdPlan() + "'";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            MateriaDAO matDAO = new MateriaDAO();
            while (datos.next()) {
                materias.add(matDAO.buscarMateria(datos.getInt(3)));
            }
            info[1] = materias;
            conx.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }

    public ArrayList<Object[]> buscarCarrerasConMaterias() {
        conx = ConexionDbPool.obtenerConexion();
        ArrayList<Object[]> info = new ArrayList<Object[]>();
        try {
            String sql = "select * from t_carrera";
            PreparedStatement sta = conx.prepareStatement(sql);
            ResultSet datos = sta.executeQuery();
            conx.close();
            while (datos.next()) {
                info.add(buscarCarreraConMaterias(datos.getInt(1)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return info;
    }

    public String BuscarMateriasCarrera() {
        String result = "";
        try {
            conx = ConexionDbPool.obtenerConexion();
            String query = "select c_id_carrera, mat_id_materia, mat_nombre_materia from t_carrera"
                    + " inner join t_plan_materia on c_id_plan_materias = pmat_id_plan_materia"
                    + " inner join  t_plan_materias_materia on pmat_id_plan_materia = plam_id_plan_materia"
                    + " inner join t_materia on plam_id_materia = mat_id_materia";
                    
            PreparedStatement pre = conx.prepareStatement(query);
            ResultSet res = pre.executeQuery();

            while (res.next()) {
                result += ";"+res.getInt(1)+","+res.getInt(2)+","+res.getString(3);
            }
            conx.close();

        } catch (SQLException ex) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
