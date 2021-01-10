/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.vista;

import ec.edu.monster.controller.CuentaOp;
import ec.edu.monster.controller.MovimientoOp;
import ec.edu.monster.model.Cuenta;
import ec.edu.monster.model.Movimiento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
@WebServlet(name = "CuentaCliente", urlPatterns = {"/CuentaCliente"})
public class CuentaCliente extends HttpServlet {

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
            throws ServletException, IOException, Exception {

        CuentaOp cuenta = new CuentaOp();
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Servlet MovimientosCliente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'>Movimientos del cliente: " + request.getParameter("cedula") + "</h1>");
            out.println("<table class=\"table table-hover table-dark\">\n"
                    + "  <thead>\n"
                    + "    <tr>\n"
                    + "      <th scope=\"col\">N&uacute;mero de cuenta</th>\n"
                    + "      <th scope=\"col\">Tipo de cuenta</th>\n"
                    + "      <th scope=\"col\">Saldo de la cuenta</th>\n"
                    + "      <th scope=\"col\">Seleccionar </th>\n"
                    + "    </tr>\n"
                    + "  </thead>\n"
                    + "  <tbody>\n");
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            for (Cuenta detalle : cuenta.getCuentasDeUsuario(request.getParameter("cedula"))) {//OBTENER DE LA SESION LOGEADA!!!!
                //System.out.println(detalle.getDEC_MOVIVALOR());
                //out.print("<tr><td>" + detalle.getVCH_CUENNUMERO() + "</td>" + "<td>" + detalle.getVCH_CUENTIPO() + "</td>" + "<td>" + detalle.getDEC_CUENSALDO() + "</td></tr>\n");
            }
            out.println("  </tbody>\n"
                    + "</table>"
            );
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(CuentaCliente.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (Exception ex) {
            Logger.getLogger(CuentaCliente.class.getName()).log(Level.SEVERE, null, ex);
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
