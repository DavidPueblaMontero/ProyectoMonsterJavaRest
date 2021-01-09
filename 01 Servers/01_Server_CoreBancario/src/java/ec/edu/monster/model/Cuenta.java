/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.model;

import java.sql.Date;

/**
 *
 * @author john_
 */
public class Cuenta {
    private int INT_CUENCODIGO;
    private int INT_CLIECODIGO;
    private String VCH_CUENNUMERO;
    private String VCH_CUENTIPO;
    private float DEC_CUENSALDO;
    private Date DTT_CUENFECHACREACION;

    public Cuenta() {
    }

    public Cuenta(int INT_CUENCODIGO, int INT_CLIECODIGO, String VCH_CUENNUMERO, String VCH_CUENTIPO, float DEC_CUENSALDO, Date DTT_CUENFECHACREACION) {
        this.INT_CUENCODIGO = INT_CUENCODIGO;
        this.INT_CLIECODIGO = INT_CLIECODIGO;
        this.VCH_CUENNUMERO = VCH_CUENNUMERO;
        this.VCH_CUENTIPO = VCH_CUENTIPO;
        this.DEC_CUENSALDO = DEC_CUENSALDO;
        this.DTT_CUENFECHACREACION = DTT_CUENFECHACREACION;
    }

    public int getINT_CUENCODIGO() {
        return INT_CUENCODIGO;
    }

    public void setINT_CUENCODIGO(int INT_CUENCODIGO) {
        this.INT_CUENCODIGO = INT_CUENCODIGO;
    }

    public int getINT_CLIECODIGO() {
        return INT_CLIECODIGO;
    }

    public void setINT_CLIECODIGO(int INT_CLIECODIGO) {
        this.INT_CLIECODIGO = INT_CLIECODIGO;
    }

    public String getVCH_CUENNUMERO() {
        return VCH_CUENNUMERO;
    }

    public void setVCH_CUENNUMERO(String VCH_CUENNUMERO) {
        this.VCH_CUENNUMERO = VCH_CUENNUMERO;
    }

    public String getVCH_CUENTIPO() {
        return VCH_CUENTIPO;
    }

    public void setVCH_CUENTIPO(String VCH_CUENTIPO) {
        this.VCH_CUENTIPO = VCH_CUENTIPO;
    }

    public float getDEC_CUENSALDO() {
        return DEC_CUENSALDO;
    }

    public void setDEC_CUENSALDO(float DEC_CUENSALDO) {
        this.DEC_CUENSALDO = DEC_CUENSALDO;
    }

    public Date getDTT_CUENFECHACREACION() {
        return DTT_CUENFECHACREACION;
    }

    public void setDTT_CUENFECHACREACION(Date DTT_CUENFECHACREACION) {
        this.DTT_CUENFECHACREACION = DTT_CUENFECHACREACION;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "INT_CUENCODIGO=" + INT_CUENCODIGO + ", INT_CLIECODIGO=" + INT_CLIECODIGO + ", VCH_CUENNUMERO=" + VCH_CUENNUMERO + ", VCH_CUENTIPO=" + VCH_CUENTIPO + ", DEC_CUENSALDO=" + DEC_CUENSALDO + ", DTT_CUENFECHACREACION=" + DTT_CUENFECHACREACION + '}';
    }
    
    
    
}
