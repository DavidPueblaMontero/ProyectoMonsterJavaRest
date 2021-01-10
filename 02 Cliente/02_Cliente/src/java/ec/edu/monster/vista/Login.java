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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n"
                    + "<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n"
                    + "<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n"
                    + "\n"
                    + "<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "	<title>Login Page</title>\n"
                    + "   \n"
                    + "	<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n"
                    + "    \n"
                    + "	<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.3.1/css/all.css\" integrity=\"sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU\" crossorigin=\"anonymous\">\n"
                    + "\n"
                    + "	<!--Custom styles-->\n"
                    + "	<style>@import url('https://fonts.googleapis.com/css?family=Numans');\n"
                    + "\n"
                    + "html,body{\n"
                    + "background-image: url('https://images.unsplash.com/photo-1488590528505-98d2b5aba04b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2250&q=80  ');\n"
                    + "background-size: cover;\n"
                    + "background-repeat: no-repeat;\n"
                    + "height: 100%;\n"
                    + "font-family: 'Numans', sans-serif;\n"
                    + "}\n"
                    + "\n"
                    + ".container{\n"
                    + "height: 100%;\n"
                    + "align-content: center;\n"
                    + "}\n"
                    + "\n"
                    + ".card{\n"
                    + "height: 370px;\n"
                    + "margin-top: auto;\n"
                    + "margin-bottom: auto;\n"
                    + "width: 400px;\n"
                    + "background-color: rgba(0,0,0,0.5) !important;\n"
                    + "}\n"
                    + "\n"
                    + ".social_icon span{\n"
                    + "font-size: 60px;\n"
                    + "margin-left: 10px;\n"
                    + "color: #FFC312;\n"
                    + "}\n"
                    + "\n"
                    + ".social_icon span:hover{\n"
                    + "color: white;\n"
                    + "cursor: pointer;\n"
                    + "}\n"
                    + "\n"
                    + ".card-header h3{\n"
                    + "color: white;\n"
                    + "}\n"
                    + "\n"
                    + ".social_icon{\n"
                    + "position: absolute;\n"
                    + "right: 20px;\n"
                    + "top: -45px;\n"
                    + "}\n"
                    + "\n"
                    + ".input-group-prepend span{\n"
                    + "width: 50px;\n"
                    + "background-color: #FFC312;\n"
                    + "color: black;\n"
                    + "border:0 !important;\n"
                    + "}\n"
                    + "\n"
                    + "input:focus{\n"
                    + "outline: 0 0 0 0  !important;\n"
                    + "box-shadow: 0 0 0 0 !important;\n"
                    + "\n"
                    + "}\n"
                    + "\n"
                    + ".remember{\n"
                    + "color: white;\n"
                    + "}\n"
                    + "\n"
                    + ".remember input\n"
                    + "{\n"
                    + "width: 20px;\n"
                    + "height: 20px;\n"
                    + "margin-left: 15px;\n"
                    + "margin-right: 5px;\n"
                    + "}\n"
                    + "\n"
                    + ".login_btn{\n"
                    + "color: black;\n"
                    + "background-color: #FFC312;\n"
                    + "width: 100px;\n"
                    + "}\n"
                    + "\n"
                    + ".login_btn:hover{\n"
                    + "color: black;\n"
                    + "background-color: white;\n"
                    + "}\n"
                    + "\n"
                    + ".links{\n"
                    + "color: white;\n"
                    + "}\n"
                    + "\n"
                    + ".links a{\n"
                    + "margin-left: 4px;\n"
                    + "}\n"
                    + ""
                    + "</style>"
                    + "</head>\n"
                    + "<body>\n"
                    + "<div class=\"container\">\n"
                    + "	<div class=\"d-flex justify-content-center h-100\">\n"
                    + "		<div class=\"card\">\n"
                    + "			<div class=\"card-header\">\n"
                    + "				<h3>Sign In</h3>\n"
                    + "			</div>\n"
                    + "			<div class=\"card-body\">\n"
                    + "				<form action='srv_login' method='post'>\n"
                    + "					<div class=\"input-group form-group\">\n"
                    + "						<div class=\"input-group-prepend\">\n"
                    + "							<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n"
                    + "						</div>\n"
                    + "						<input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"username\">\n"
                    + "						\n"
                    + "					</div>\n"
                    + "					<div class=\"input-group form-group\">\n"
                    + "						<div class=\"input-group-prepend\">\n"
                    + "							<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n"
                    + "						</div>\n"
                    + "						<input type=\"password\" class=\"form-control\" placeholder=\"password\" name=\"password\">\n"
                    + "					</div>\n"
                    + "					<div class=\"form-group\">\n"
                    + "						<input type=\"submit\" value=\"Login\" name=\"boton\" class=\"btn float-right login_btn\">\n"
                    + "					</div>\n"
                    + "				</form>\n"
                    + "			</div>\n"
                    + "		</div>\n"
                    + "	</div>\n"
                    + "</div>\n"
                    + "</body>\n"
                    + "</html>");
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
