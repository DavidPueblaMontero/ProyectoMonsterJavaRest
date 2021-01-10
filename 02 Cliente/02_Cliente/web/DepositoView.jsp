<%-- 
    Document   : DepositoView
    Created on : Jan 2, 2021, 11:09:44 PM
    Author     : john_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <title>Depósito</title>
    </head>
    <body>
        <script>
            function soloNumeros(evt) {

                // code is the decimal ASCII representation of the pressed key.
                var code = (evt.which) ? evt.which : evt.keyCode;

                if (code == 8) { // backspace.
                    return true;
                } else if (code >= 48 && code <= 57) { // is a number.
                    return true;
                } else { // other keys.
                    alert("Ingresar solo números")
                    return false;
                }
            }
        
            
            
        </script>
        <div class="container">
            <div class="row mt-2">
                <div class="col-sm">
                    <div class="col-sm">
                        <br>
                        <form action="ImporteServlet" method="get">
                            <div class="form-group">
                                <label for="cuenta">Cuenta</label>
                                <input type="text"  class="form-control" id="cuenta" name="cuenta" placeholder="No Cuenta" required="required" onkeypress="return soloNumeros(event);">
                                <label for="importe">Importe</label>
                                <input type="text"  class="form-control" id="importe" name="importe" placeholder="Importe" required="required" onkeypress="return soloNumeros(event);">
                            </div>

                            <button type="submit"  class="btn btn-primary" ">Procesar </button>
                            <a href="index.jsp" class="btn btn-primary  "  >Regresar</a>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
<%
    if (request.getAttribute("estado") != null) {

        if (request.getAttribute("estado").equals(-1)) {

            out.print("<script>alert('Error en el proceso, revise sus datos')</script>");
        } else {
            out.print("<script>alert('Transacción exitosa')</script>");

        }
        //System.out.println("" + estado);
        request.setAttribute("estado", null);
    }

%>

