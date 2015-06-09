/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Controller;

import co.umb.ColombianUniversity.DAO.InscripcionMateriaDAO;
import co.umb.ColombianUniversity.Model.AlumnoModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alexander
 */
public class ESInsMateriaRegistrar extends HttpServlet {

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

        InscripcionMateriaDAO inmDAO = new InscripcionMateriaDAO();

        AlumnoModel al = (AlumnoModel) (request.getSession().getAttribute("Alumno"));

        if (inmDAO.validarInscripcionMateria(al, Integer.parseInt(request.getParameter("AlumnoCarrera")))) 
        {
            inmDAO.inscribirMateria(Integer.parseInt(request.getParameter("AlumnoCarrera2")), Integer.parseInt(request.getParameter("AlumnoCarrera")));
            request.setAttribute("registro", "Registro de materia exitoso");
            request.getRequestDispatcher("EsAsignaturas.do").forward(request, response);
            
        } else {
            request.setAttribute("registro", "La materia que seleccionó ya se encuentra registrada");
            request.getRequestDispatcher("EsInscripcionMaterias.do").forward(request, response);
        }
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
