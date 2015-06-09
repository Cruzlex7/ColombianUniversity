/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Controller;

import co.umb.ColombianUniversity.DAO.AlumnoCarreraDAO;
import co.umb.ColombianUniversity.DAO.CarreraDAO;
import co.umb.ColombianUniversity.Model.AlumnoCarreraModel;
import co.umb.ColombianUniversity.Model.AlumnoModel;
import java.io.IOException;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexander
 */
public class EsInscripcionMaterias extends HttpServlet {

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

        AlumnoModel al = null;
        if (request.getSession().getAttribute("Alumno") != null) {
            al = (AlumnoModel) request.getSession().getAttribute("Alumno");
        }
        if (al != null) {
            AlumnoCarreraDAO ac = new AlumnoCarreraDAO();
            LinkedList<AlumnoCarreraModel> listcarreras = ac.buscarAlumnoCarrera(al.getId());

            CarreraDAO cDAO = new CarreraDAO();
            String materiasCarrera = cDAO.BuscarMateriasCarrera();
            if(materiasCarrera.length() > 0)
                request.setAttribute("materiasCarrera", materiasCarrera);            
            
            request.setAttribute("carreras", listcarreras);
            request.getRequestDispatcher("Pages/EsInscripcionMaterias.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("../index.jsp").forward(request, response);
        }
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
        processRequest(request, response);
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
