/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Controller;

import co.umb.ColombianUniversity.DAO.AlumnoCarreraDAO;
import co.umb.ColombianUniversity.DAO.EstadoMateriaDao;
import co.umb.ColombianUniversity.DAO.InscripcionMateriaDAO;
import co.umb.ColombianUniversity.DAO.MateriaDAO;
import co.umb.ColombianUniversity.Model.AlumnoCarreraModel;
import co.umb.ColombianUniversity.Model.AlumnoModel;
import co.umb.ColombianUniversity.Model.InscripcionMateriaModel;
import co.umb.ColombianUniversity.Model.MateriaModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexander
 */
@WebServlet(name = "EsAsignaturas", urlPatterns = {"/EsAsignaturas.do"})
public class EsAsignaturas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AlumnoModel al = (AlumnoModel) request.getSession().getAttribute("Alumno");

        AlumnoCarreraDAO ac = new AlumnoCarreraDAO();
        LinkedList<AlumnoCarreraModel> listcarreras = ac.buscarAlumnoCarrera(al.getId());

        
        
        InscripcionMateriaDAO ins = new InscripcionMateriaDAO();
        LinkedList<InscripcionMateriaModel> lisInscripcion = new LinkedList<InscripcionMateriaModel>();
       
        for (AlumnoCarreraModel listcarrera : listcarreras) {
           lisInscripcion.addAll(ins.buscarInscripcionMateria(listcarreras.getFirst().getIdAlumnoCarrera()));
        }
       
        EstadoMateriaDao esDAO = new EstadoMateriaDao();
        
        MateriaDAO m = new  MateriaDAO();        
        for (InscripcionMateriaModel item : lisInscripcion) {
            item.setNombreMateria((m.buscarMateria(item.getIdMateria())).getNombre());
            item.setEstado(esDAO.buscarEstadoMateria(item.getIdEstadoMateria()));
        }
       
        
        request.setAttribute("asignaturas", lisInscripcion);
        request.getRequestDispatcher("/Pages/EsAsignaturas.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("Pages/EsAsignaturas.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
