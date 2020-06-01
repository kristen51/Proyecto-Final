/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Excepciones.AltaUsuarioException;
import Excepciones.IniciarSesionException;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.Resource;
import javax.security.auth.login.LoginException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Propietario
 */
@WebServlet(name = "Logins", urlPatterns = {"/Logins"})
public class Logins extends HttpServlet {

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
            throws ServletException, IOException, SQLException, IniciarSesionException{
        response.setContentType("text/html;charset=UTF-8");
        ServletContext application = getServletContext();
        
        ListaUsuarios lista = (ListaUsuarios)application.getAttribute("usuariosRegistrados");
        String identificador = request.getParameter("identificador");
        String contraseñaIntroducida = getContraseña(request);
        try{
            
            lista.buscarUsuario(identificador, contraseñaIntroducida);
            
            application.setAttribute("usuarioLogeado", "hola");
            request.setAttribute("mensajeOK", "Muy bien makina");
            application.getRequestDispatcher("/menupruebas.jsp").forward(request, response);
            
                      
        }catch(IniciarSesionException ex){
            
            request.setAttribute("mensajeError", ex.getMessage());
            application.getRequestDispatcher("/usuario/login.jsp").forward(request, response);
        
        }
     
    }
    
    public void comprobarUsuario(String identificador,String contraseña,ListaUsuarios lista) throws SQLException, IniciarSesionException{
    
        lista.buscarUsuario(identificador, contraseña);

    }
     public String getContraseña(HttpServletRequest request) throws IniciarSesionException{
    
        String contraseña = "1234";
        
        if(contraseña.isEmpty()){throw new IniciarSesionException("La contraseña no puede estar vacía");}
        else if (!Pattern.matches(Usuario.PATRON_CONTRASEÑA, contraseña))
        {throw new IniciarSesionException("La contraseña debe ser un numero de 4 cifras");}
        
    
        return contraseña;
    
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
        } catch (SQLException ex) {
            Logger.getLogger(Logins.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IniciarSesionException ex) {
            Logger.getLogger(Logins.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(Logins.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IniciarSesionException ex) {
            Logger.getLogger(Logins.class.getName()).log(Level.SEVERE, null, ex);
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
