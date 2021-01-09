/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.services;

import ec.edu.monster.controller.ConectCuenta;
import ec.edu.monster.controller.ConectMovimiento;
import ec.edu.monster.model.Cuenta;
import ec.edu.monster.model.Movimiento;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author david
 */
@Path("Core")
public class CoreResource {

    ConectCuenta cuenta = new ConectCuenta();
    ConectMovimiento movimiento = new ConectMovimiento();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CoreResource
     */
    public CoreResource() {
    }

    /**
     * Retrieves representation of an instance of
     * ec.edu.monster.services.CoreResource
     *
     * @param id
     * @return an instance of java.lang.String
     */
    @Path("{codCuenta}")//punto1
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public boolean verificarExistenciaCuenta(@PathParam("codCuenta") String id) throws SQLException {
        //TODO return proper representation object

        return cuenta.existeCuenta(id);
    }

    @Path("cedula/{cedulaNumero}")
    @GET//punto3
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList listarCuentasDeUsuario(@PathParam("cedulaNumero") String cedula) throws SQLException {

        ArrayList<Cuenta> cuentaArray;
        cuentaArray = cuenta.obtenerListaCuentas(cedula);
        return cuentaArray;
    }

    @Path("movimiento/{numCuenta}")
    @GET//punto4
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList listarMovimientosDeUsuario(@PathParam("numCuenta") String numCuenta) throws SQLException {

        ArrayList<Movimiento> movArray;
        movArray = movimiento.mostrarMovimientos(numCuenta);
        return movArray;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void transferencia(Movimiento mov) throws SQLException {

        movimiento.transferenciaDinero(mov.getVCH_MOVICUENTORIG(), mov.getVCH_MOVICUENTDEST(), mov.getDEC_MOVIVALOR());

        //return confirm;
    }
}
