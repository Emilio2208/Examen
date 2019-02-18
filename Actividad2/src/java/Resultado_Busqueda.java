/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emilioabreumorales
 */
public class Resultado_Busqueda extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Resultado_Busqueda</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Resultado_Busqueda at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
        int id_genero = Integer.parseInt(request.getParameter("genero_pelicula"));
        String nombre = request.getParameter("nombre"); 
        ArrayList<String> Peliculas = new ArrayList<String>();
        switch(id_genero){
            case 1:
                Peliculas.add("Duro para matar");
                Peliculas.add("Glass");
                Peliculas.add("Busqueda implacable");
                break; 
                
                case 2:
                Peliculas.add("Roma");
                Peliculas.add("Titanic");
                Peliculas.add("Ghost: L sombra del amor");
                break; 
                
                case 3:
                Peliculas.add("¿Qué paso ayer?");
                Peliculas.add("Ted");
                Peliculas.add("Son como niños");
                break; 
                
                case 4:
                Peliculas.add("Cuestion de tiempo");
                Peliculas.add("La propuesta");
                Peliculas.add("Set it up");
                break; 
        }
        
        request.setAttribute("Peliculas", Peliculas);
        request.setAttribute("nombre", nombre);
        
        
        RequestDispatcher view = request.getRequestDispatcher("View_Resultado_Busqueda.jsp");
        view.forward(request, response);
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
