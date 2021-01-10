/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
@WebServlet(name = "MovimientosCliente", urlPatterns = {"/MovimientosCliente"})
public class MovimientosCliente extends HttpServlet {

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
            out.println("<title>Servlet MovimientosCliente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Movimientos de la cuenta: " + request.getParameter("numCuenta")+ "</h1>");
            out.print("<table class=\"table table-hover table-dark\">\n"
                    + "  <thead>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"col\">Fecha Movimiento</th>\n"
                    + "      <th scope=\"col\">Tipo Movimiento</th>\n"
                    + "      <th scope=\"col\">Valor Movimiento</th>\n"
                    + "      <th scope=\"col\">Saldo Final Transacción</th>\n"
                    + "      <th scope=\"col\">Cuenta que realizó el movimiento </th>\n"
                    + "    </tr>\n"
                    + "  </thead>\n"
                    + "  <tbody>\n"
                    + "    <tr>\n"
                    + "      <td>Mark</td>\n"
                    + "      <td>Mark</td>\n"
                    + "      <td>Otto</td>\n"
                    + "      <td>@mdo</td>\n"
                    + "      <td>Mark</td>\n"
                    + "    </tr>\n"
                    + "    <tr>\n"
                    + "      <td>Mark</td>\n"
                    + "      <td>Jacob</td>\n"
                    + "      <td>Thornton</td>\n"
                    + "      <td>Mark</td>\n"
                    + "      <td>@fat</td>\n"
                    + "    </tr>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"row\">3</th>\n"
                    + "      <td colspan=\"2\">Larry the Bird</td>\n"
                    + "      <td>@twitter</td>\n"
                    + "    </tr>\n"
                    + "  </tbody>\n"
                    + "</table>");
            out.println("</body>");
            out.println("</html>");

            out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">");

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
