/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.umb.ColombianUniversity.Controller;

import co.umb.ColombianUniversity.DAO.AlumnoDAO;
import co.umb.ColombianUniversity.DAO.UsuarioDAO;
import co.umb.ColombianUniversity.Model.AlumnoModel;
import co.umb.ColombianUniversity.Model.UsuarioModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JorgeIvan
 */
@WebServlet(name = "LoginUsuario", urlPatterns = {"/LoginUsuario.do"})
public class LoginUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        
        UsuarioModel usu =  new UsuarioDAO().login(usuario, pass);
        
        if(usu!=null)
        {
            switch(usu.getRol())
            {
                case 1:{response.sendRedirect("./Pages/AdInicio.jsp");break;}
                case 2:{response.sendRedirect("./Pages/PrInicio.jsp");break;}
                default:{
                    AlumnoDAO ald = new AlumnoDAO();
                    request.setAttribute("Alumno", ald.buscarAlumno(Integer.parseInt(usuario)));
                    request.getRequestDispatcher("EsInicio.do").forward(request, response);
                    break;
                }
            }
        }
        else
        {
            request.setAttribute("msj", "Usuario y/o conntraseña incorrectos");
            RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
            rd.forward(request, response);
        }
        
        
//         AlumnoModel al = (AlumnoModel) request.getAttribute("Alumno");
//               request.setAttribute("Nombre", al.getNombre() +" "+ al.getApellido());
//               request.getRequestDispatcher("/Pages/EsInicio.jsp").forward(request, response);
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
