package co.umb.ColombianUniversity.Controller;

import co.umb.ColombianUniversity.DAO.EstudianteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JorgeIvan
 */
@WebServlet(name = "AgregarEstudiante", urlPatterns = {"/AgregarEstudiante"})
public class AgregarEstudiante extends HttpServlet {

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
        String cedula = request.getParameter("txtDocumentoEstudiante");
        String tipoDocumento = request.getParameter("cmbTipoDocumento");
        String nombre = request.getParameter("txtPrimerNombreEstudiante");
        String segNombre = request.getParameter("txtSegundoNombreEstudiante");
        String apellido = request.getParameter("txtPrimerApellidoEstudiante");
        String segApelldio = request.getParameter("txtSegundoApellidoEstudiante");
        String genero = request.getParameter("cmbGenero");
        String avenida = request.getParameter("txtAvenida");
        String calle = request.getParameter("txtCalle");
        String carrera = request.getParameter("txtCarrera");
        String barrio = request.getParameter("txtBarrio");
        String casa = request.getParameter("txtNumeroCasa");
        EstudianteDAO estDAO = new EstudianteDAO();
        if(!cedula.isEmpty()&&!nombre.isEmpty()&&!apellido.isEmpty()&&!calle.isEmpty()&&!carrera.isEmpty()&&!barrio.isEmpty())
        {
            try
            {
                estDAO.agregarEstudiante(Integer.parseInt(cedula),nombre,segNombre,apellido,segApelldio,Integer.parseInt(tipoDocumento),avenida,calle,carrera,barrio,Integer.parseInt(casa),Integer.parseInt(genero));
                response.sendRedirect("./Pages/AdCrearEstudiante.jsp");
            }
            catch(NumberFormatException e)
            {
                response.sendRedirect("./Pages/AdCrearEstudiante.jsp");
            }
        }
        else
        {
            response.sendRedirect("./Pages/AdCrearEstudiante.jsp");
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
