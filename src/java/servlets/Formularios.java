/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Excepciones.FormularioException;
import Formularios.Formulario;
import Formularios.ListaFormularios;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Manuel
 */
public class Formularios extends HttpServlet {
    
    @Resource(name="jdbc/driveFit")
    private DataSource dataSource;

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
            throws ServletException, IOException, FormularioException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext application = getServletContext();
        
        try {
            String usuarioLogeado = (String) application.getAttribute("usuarioLogeado");
            
            ListaFormularios listaFormularios  =(ListaFormularios) application.getAttribute("formularios");
            ListaUsuarios listaUsuarios = (ListaUsuarios) application.getAttribute("usuariosRegistrados");
            
            String email = getEmail(request);
            String telefono = getTelefono(request);
            String comentario = request.getParameter("comentario");
            
            if(!usuarioLogeado.isEmpty()){    
                String[] nombreReal = listaUsuarios.getNombreCompletoSegunIdentificador(usuarioLogeado);         
                listaFormularios.mete(new Formulario(nombreReal[0], nombreReal[1], email, telefono, comentario,listaUsuarios.getCodSegunIdentificador((String) application.getAttribute("usuarioLogeado"))));
                request.setAttribute("mensajeOK", "Formulario enviado correctamente");
                application.getRequestDispatcher("/html/form.jsp").forward(request, response);
            }
            else{
                String nombreReal = request.getParameter("nombreReal");
                String apellidos = request.getParameter("apellidos");
                               
                listaFormularios.mete(new Formulario(nombreReal, apellidos, email, telefono, comentario,00));
                request.setAttribute("mensajeOK", "Formulario enviado correctamente");
                application.getRequestDispatcher("/html/form.jsp").forward(request, response);
            
            }
                 
        }catch (FormularioException ex) {
            request.setAttribute("mensajeError", ex.getMessage());
            application.getRequestDispatcher("/html/form.jsp").forward(request, response);
                      
        }
         
    }
    
    public String getTelefono(HttpServletRequest request) throws FormularioException{
    
        String telefono = request.getParameter("telefono");
        if(!Pattern.matches(Formulario.PATRON_TELEFONO, telefono)){        
            throw new FormularioException("El telefono no es válido");        
        }
        else{return telefono;}
    
    }
    
    public String getEmail(HttpServletRequest request) throws FormularioException{
    
        String email = request.getParameter("email");
        if(!Pattern.matches(Formulario.PATRON_EMAIL, email)){        
            throw new FormularioException("El email no es válido");        
        }
        else{return email;}
    
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
        try {
            processRequest(request, response);
        } catch (FormularioException ex) {
            Logger.getLogger(Formularios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formularios.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (FormularioException ex) {
            Logger.getLogger(Formularios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Formularios.class.getName()).log(Level.SEVERE, null, ex);
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
