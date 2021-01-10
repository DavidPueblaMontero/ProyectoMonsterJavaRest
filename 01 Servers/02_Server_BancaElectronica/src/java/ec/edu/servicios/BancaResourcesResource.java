/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.servicios;

import ec.edu.monster.controlador.UsuarioController;
import ec.edu.monster.modelo.Usuario;
import java.sql.SQLException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author john_
 */
@Path("BancaResources")
public class BancaResourcesResource {

    UsuarioController u = new UsuarioController();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BancaResourcesResource
     */
    public BancaResourcesResource() {
    }

    /**
     * Retrieves representation of an instance of
     * ec.edu.servicios.BancaResourcesResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of BancaResourcesResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void CrearCuenta(Usuario usu) throws SQLException {
        u.CrearCuenta(usu.getUsuCedula(), usu.getUsuDireccion(), usu.getUsuPassword());

        //return confirm;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String Login(Usuario usu) throws SQLException {
        String retorno = "false";
        if (u.Login(usu.getUsuCedula(), usu.getUsuPassword())) {
            retorno = "true";
        }
        return retorno;

    }
}
