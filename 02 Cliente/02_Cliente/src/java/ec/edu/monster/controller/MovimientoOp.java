/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static ec.edu.monster.controller.Test.peticionHttpGet;
import ec.edu.monster.model.Movimiento;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class MovimientoOp {

    public ArrayList<Movimiento> getMovimientosCuentaSeleccionada(String cuentaSeleccionada) throws Exception {
        String test = peticionHttpGet("http://localhost:8080/01_Server_CoreBancario/webresources/Core/movimiento/" + cuentaSeleccionada);

        Gson gson = new Gson();
        Type listType = new TypeToken<ArrayList<Movimiento>>() {
        }.getType();
        ArrayList<Movimiento> arrayDeJson = gson.fromJson(test, listType);

        /*for (Movimiento detalle : arrayDeJson) {
            System.out.println(detalle.getDEC_MOVIVALOR());
        }*/
        return arrayDeJson;
    }

    public String peticionHttpGet(String urltogo) throws Exception {

        StringBuilder resultado = new StringBuilder();
        URL url = new URL(urltogo);
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
}
