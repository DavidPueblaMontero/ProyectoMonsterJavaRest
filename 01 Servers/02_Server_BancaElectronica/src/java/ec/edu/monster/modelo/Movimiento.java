/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.modelo;

import java.sql.Date;

/**
 *
 * @author john_
 */
public class Movimiento {

    private int INT_MOVICODIGO;
    private int INT_CUENCODIGO;
    private Date DTT_MOVIFECHA;
    private String VCH_MOVITIPO;
    private float DEC_MOVIVALOR;
    private float DEC_MOVISALDOFINAL;
    private String VCH_MOVICUENTORIG;
    private String VCH_MOVICUENTDEST;

    public Movimiento() {
    }

    public Movimiento(Date DTT_MOVIFECHA, String VCH_MOVITIPO, float DEC_MOVIVALOR, float DEC_MOVISALDOFINAL) {
        this.DTT_MOVIFECHA = DTT_MOVIFECHA;
        this.VCH_MOVITIPO = VCH_MOVITIPO;
        this.DEC_MOVIVALOR = DEC_MOVIVALOR;
        this.DEC_MOVISALDOFINAL = DEC_MOVISALDOFINAL;
    }

    public Movimiento(float DEC_MOVIVALOR, String VCH_MOVICUENTORIG, String VCH_MOVICUENTDEST) {
        this.DEC_MOVIVALOR = DEC_MOVIVALOR;
        this.VCH_MOVICUENTORIG = VCH_MOVICUENTORIG;
        this.VCH_MOVICUENTDEST = VCH_MOVICUENTDEST;
    }

    public Movimiento(int INT_MOVICODIGO, int INT_CUENCODIGO, Date DTT_MOVIFECHA, String VCH_MOVITIPO, float DEC_MOVIVALOR, float DEC_MOVISALDOFINAL, String VCH_MOVICUENTORIG, String VCH_MOVICUENTDEST) {
        this.INT_MOVICODIGO = INT_MOVICODIGO;
        this.INT_CUENCODIGO = INT_CUENCODIGO;
        this.DTT_MOVIFECHA = DTT_MOVIFECHA;
        this.VCH_MOVITIPO = VCH_MOVITIPO;
        this.DEC_MOVIVALOR = DEC_MOVIVALOR;
        this.DEC_MOVISALDOFINAL = DEC_MOVISALDOFINAL;
        this.VCH_MOVICUENTORIG = VCH_MOVICUENTORIG;
        this.VCH_MOVICUENTDEST = VCH_MOVICUENTDEST;
    }

    public int getINT_MOVICODIGO() {
        return INT_MOVICODIGO;
    }

    public void setINT_MOVICODIGO(int INT_MOVICODIGO) {
        this.INT_MOVICODIGO = INT_MOVICODIGO;
    }

    public int getINT_CUENCODIGO() {
        return INT_CUENCODIGO;
    }

    public void setINT_CUENCODIGO(int INT_CUENCODIGO) {
        this.INT_CUENCODIGO = INT_CUENCODIGO;
    }

    public Date getDTT_MOVIFECHA() {
        return DTT_MOVIFECHA;
    }

    public void setDTT_MOVIFECHA(Date DTT_MOVIFECHA) {
        this.DTT_MOVIFECHA = DTT_MOVIFECHA;
    }

    public String getVCH_MOVITIPO() {
        return VCH_MOVITIPO;
    }

    public void setVCH_MOVITIPO(String VCH_MOVITIPO) {
        this.VCH_MOVITIPO = VCH_MOVITIPO;
    }

    public float getDEC_MOVIVALOR() {
        return DEC_MOVIVALOR;
    }

    public void setDEC_MOVIVALOR(float DEC_MOVIVALOR) {
        this.DEC_MOVIVALOR = DEC_MOVIVALOR;
    }

    public float getDEC_MOVISALDOFINAL() {
        return DEC_MOVISALDOFINAL;
    }

    public void setDEC_MOVISALDOFINAL(float DEC_MOVISALDOFINAL) {
        this.DEC_MOVISALDOFINAL = DEC_MOVISALDOFINAL;
    }

    public String getVCH_MOVICUENTORIG() {
        return VCH_MOVICUENTORIG;
    }

    public void setVCH_MOVICUENTORIG(String VCH_MOVICUENTORIG) {
        this.VCH_MOVICUENTORIG = VCH_MOVICUENTORIG;
    }

    public String getVCH_MOVICUENTDEST() {
        return VCH_MOVICUENTDEST;
    }

    public void setVCH_MOVICUENTDEST(String VCH_MOVICUENTDEST) {
        this.VCH_MOVICUENTDEST = VCH_MOVICUENTDEST;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "INT_MOVICODIGO=" + INT_MOVICODIGO + ", INT_CUENCODIGO=" + INT_CUENCODIGO + ", DTT_MOVIFECHA=" + DTT_MOVIFECHA + ", VCH_MOVITIPO=" + VCH_MOVITIPO + ", DEC_MOVIVALOR=" + DEC_MOVIVALOR + ", DEC_MOVISALDOFINAL=" + DEC_MOVISALDOFINAL + ", VCH_MOVICUENTORIG=" + VCH_MOVICUENTORIG + ", VCH_MOVICUENTDEST=" + VCH_MOVICUENTDEST + '}';
    }

    
}
