/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Excepciones.AltaUsuarioException;
import Usuarios.ListaUsuarios;
import Usuarios.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Propietario
 */
public class ModificarUsuarios extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        ServletContext application = getServletContext();
        
        
        ListaUsuarios listaUsuarios = (ListaUsuarios) application.getAttribute("usuariosRegistrados");
        try{
        
        Usuario usuario = recogerNuevoUsuario(request);      
        listaUsuarios.update(usuario);
        request.setAttribute("mensajeOK", "El usuario se ha modificado correctamente");
        application.getRequestDispatcher("/index.jsp").forward(request, response);
     
        }catch(AltaUsuarioException ex){
            request.setAttribute("mensajeError", ex.getMessage());
            application.getRequestDispatcher("/modificarUsuarios.jsp").forward(request, response);

        }

    }
    
    public Usuario recogerNuevoUsuario(HttpServletRequest request) throws AltaUsuarioException, SQLException{
        
        ServletContext application = getServletContext();
        ListaUsuarios lista = (ListaUsuarios)application.getAttribute("usuariosRegistrados");
        
        String nombreUsuario = getNombreUsuario(request);       
        String email = getEmail(request);
              
        if(!(lista.buscarUsuario(email) == null) || !(lista.buscarUsuario(nombreUsuario) == null)){
            throw new AltaUsuarioException("Ya existe un usuario con ese nombre o email");
        }
        else{       
        String[] nombreCompleto = getNombreReal(request);
        String contraseña = getContraseña(request);  
        int numUsuarios = lista.getNumUsuarios()-1;
        return new Usuario(numUsuarios,nombreUsuario, email,  nombreCompleto[0], nombreCompleto[1], contraseña);   
    }
}
    
    public String getNombreUsuario(HttpServletRequest request) throws AltaUsuarioException{
        
        String nombreUsuario = request.getParameter("nombreUsuario");
        
        if(nombreUsuario.isEmpty()){throw new AltaUsuarioException("El nombre de usuario no puede estar vacío");}
        else if(!Pattern.matches(Usuario.PATRON_NOMBRE_USUARIO, nombreUsuario))
            {throw new AltaUsuarioException("El nombre de usuario debe tener entre 4 y 8 carácteres");}
        return nombreUsuario;
    
    }
    
    public String getEmail(HttpServletRequest request) throws AltaUsuarioException{
    
        String email = request.getParameter("email");
        
        if(email.isEmpty()){throw new AltaUsuarioException("El email no puede estar vacío");}
        
        else if(!Pattern.matches(Usuario.PATRON_EMAIL, email)){throw new AltaUsuarioException("El email debe ser válido");}
    
        return email;
    
    }
    
    public String getContraseña(HttpServletRequest request) throws AltaUsuarioException{
    
        String contraseña = request.getParameter("password");
        
        if(contraseña.isEmpty()){throw new AltaUsuarioException("La contraseña no puede estar vacía");}
        else if (!Pattern.matches(Usuario.PATRON_CONTRASEÑA, contraseña))
        {throw new AltaUsuarioException("La contraseña debe ser un numero de 4 cifras");}
    
        return contraseña;
    
    }
    
    public String[] getNombreReal(HttpServletRequest request) throws AltaUsuarioException{
    
        String nombre =  request.getParameter("nombreReal");     
        String apellidos =  request.getParameter("apellidos");
        String[] nombreCompleto = new String[2];
        
        if(nombre.isEmpty() || apellidos.isEmpty()){      
            throw new AltaUsuarioException("Tanto el nombre como los apellidos no deben estar vacíos");
        }
        nombreCompleto[0] = nombre;
        nombreCompleto[1] = apellidos;
    
        return nombreCompleto;
   
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
            Logger.getLogger(ModificarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ModificarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
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
