/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.servicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:CoreResource [Core]<br>
 * USAGE:
 * <pre>
 *        NewJerseyClient client = new NewJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author john_
 */
public class CoreServicios {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/01_Server_CoreBancario/webresources";

    public CoreServicios() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("Core");
    }

    public void transferencia(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
    }

    public boolean verificarExistenciaCuenta(String codCuenta) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{codCuenta}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(Boolean.class);
    }

    public <T> T listarCuentasDeUsuario(Class<T> responseType, String cedulaNumero) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("cedula/{0}", new Object[]{cedulaNumero}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public <T> T listarMovimientosDeUsuario(Class<T> responseType, String numCuenta) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("movimiento/{0}", new Object[]{numCuenta}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(responseType);
    }

    public static String verificarExistenciaCuenta1(String cuenta) throws Exception {
        String url1 = "http://localhost:8080/01_Server_CoreBancario/webresources/Core/verificarCuenta/" + cuenta;
        StringBuilder resultado = new StringBuilder();
        URL url = new URL(url1);
        // con tipo get
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        // read buff
        BufferedReader rd = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
        String linea;
        while ((linea = rd.readLine()) != null) {
            resultado.append(linea);
        }
        // close bf
        rd.close();
        return resultado.toString();
    }

    public void close() {
        client.close();
    }

}
