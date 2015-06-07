/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Controller;

import co.umb.ColombianUniversity.DAO.CarreraDAO;
import co.umb.ColombianUniversity.DAO.MateriaDAO;
import co.umb.ColombianUniversity.Model.MateriaModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JorgeIvan
 */
@WebServlet(name = "AgregarMateriaPlan", urlPatterns = {"/AgregarMateriaPlan"})
public class AgregarMateriaPlan extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String codigo = request.getParameter("txtCodigoMateria");
        if(!codigo.isEmpty())
        {
            try
            {
                MateriaModel materia = new MateriaDAO().buscarMateria(Integer.parseInt(codigo));
                if(materia!=null)
                {
                    if(!estaEnLista(materia))
                    {
                        CarreraDAO.materiasPlan.add(materia);
                        response.sendRedirect("./Pages/AdCrearCarrera.jsp");
                    }
                    else
                    {
                        response.sendRedirect("./Pages/AdCrearCarrera.jsp");
                    }
                }
                else
                {
                    response.sendRedirect("./Pages/AdCrearCarrera.jsp");
                }
            }
            catch(NumberFormatException e)
            {
                response.sendRedirect("./Pages/AdCrearCarrera.jsp");
            }
        }
        else
        {
            response.sendRedirect("./Pages/AdCrearCarrera.jsp");
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

    private boolean estaEnLista(MateriaModel materia) {
        for (MateriaModel materiasPlan : CarreraDAO.materiasPlan) {
            if (materiasPlan.getId() == materia.getId()) {
                return true;
            }
        }
        return false;
    }

}
