/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author john_
 */
@WebServlet(name = "Transferencia", urlPatterns = {"/Transferencia"})
public class Transferencia extends HttpServlet {

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
            out.println(""

                    + ""
                    + "<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n"
                    + "        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n"
                    + "        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n"
                    + "        <title>Crear empleado</title>\n"
                    + "    </head>\n"
                    + "    <body>\n"
                    + "        <div class=\"container mt-5\">\n"
                    + "            <div class=\"row\">\n"
                    + "                <div class=\"col-sm\">\n"
                    + "\n"
                    + "                    <form action=\"crear.jsp\" method=\"post\">\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"nombre\">Nombre</label>\n"
                    + "                            <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" placeholder=\"Nombre\" required=\"required\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"direccion\">Direccion</label>\n"
                    + "                            <input type=\"text\" class=\"form-control\" id=\"direccion\" name=\"direccion\" placeholder=\"Direccion\" required=\"required\">\n"
                    + "                        </div>\n"
                    + "                        <div class=\"form-group\">\n"
                    + "                            <label for=\"telefono\">Telefono</label>\n"
                    + "                            <input type=\"text\" class=\"form-control\" id=\"telefono\" name=\"telefono\" placeholder=\"Telefono\" required=\"required\">\n"
                    + "                        </div>\n"
                    + "                        <button type=\"submit\" name=\"enviar\" class=\"btn btn-primary\">Guardar <i class=\"fa fa-floppy-o\" aria-hidden=\"true\"></i></button>\n"
                    + "                    </form>\n"
                    + "\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </div>");
            if (request.getParameter("enviar") != null) {
                String nombre = request.getParameter("nombre");
                String direccion = request.getParameter("direccion");
                String telefono = request.getParameter("telefono");
                
                try {
                    Connection con = null;
                    Statement st = null;
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/jsp?user=root&password=");
                    st = con.createStatement();
                    st.executeUpdate("insert into empledos (nombre,direccion,telefono) values('" + nombre + "','" + direccion + "','" + telefono + "');");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } catch (Exception e) {
                    out.print(e);
                }
                
            }
            
            out.print("    </body>\n"
                    + "</html>\n"
                    + "");
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
