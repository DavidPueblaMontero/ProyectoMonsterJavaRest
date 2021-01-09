/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.monster.model;

/**
 *
 * @author john_
 */
public class Cliente {

    private  int INT_CLIECODIGO;
    private  String VCH_CLIENOMBRE;
    private  String VCH_CLIEAPELLIDO;
    private  String VCH_CLIECEDULA;
    private  String VCH_CLIEDIRECCION;
    private  String VCH_CLIETELEFONO;
    private  String VCH_CLIEEMAIL;

    public Cliente(int INT_CLIECODIGO, String VCH_CLIENOMBRE, String VCH_CLIEAPELLIDO, String VCH_CLIECEDULA, String VCH_CLIEDIRECCION, String VCH_CLIETELEFONO, String VCH_CLIEEMAIL) {
        this.INT_CLIECODIGO = INT_CLIECODIGO;
        this.VCH_CLIENOMBRE = VCH_CLIENOMBRE;
        this.VCH_CLIEAPELLIDO = VCH_CLIEAPELLIDO;
        this.VCH_CLIECEDULA = VCH_CLIECEDULA;
        this.VCH_CLIEDIRECCION = VCH_CLIEDIRECCION;
        this.VCH_CLIETELEFONO = VCH_CLIETELEFONO;
        this.VCH_CLIEEMAIL = VCH_CLIEEMAIL;
    }

    public Cliente() {
    }

    
    
    public int getINT_CLIECODIGO() {
        return INT_CLIECODIGO;
    }

    public void setINT_CLIECODIGO(int INT_CLIECODIGO) {
        this.INT_CLIECODIGO = INT_CLIECODIGO;
    }

    public String getVCH_CLIENOMBRE() {
        return VCH_CLIENOMBRE;
    }

    public void setVCH_CLIENOMBRE(String VCH_CLIENOMBRE) {
        this.VCH_CLIENOMBRE = VCH_CLIENOMBRE;
    }

    public String getVCH_CLIEAPELLIDO() {
        return VCH_CLIEAPELLIDO;
    }

    public void setVCH_CLIEAPELLIDO(String VCH_CLIEAPELLIDO) {
        this.VCH_CLIEAPELLIDO = VCH_CLIEAPELLIDO;
    }

    public String getVCH_CLIECEDULA() {
        return VCH_CLIECEDULA;
    }

    public void setVCH_CLIECEDULA(String VCH_CLIECEDULA) {
        this.VCH_CLIECEDULA = VCH_CLIECEDULA;
    }

    public String getVCH_CLIEDIRECCION() {
        return VCH_CLIEDIRECCION;
    }

    public void setVCH_CLIEDIRECCION(String VCH_CLIEDIRECCION) {
        this.VCH_CLIEDIRECCION = VCH_CLIEDIRECCION;
    }

    public String getVCH_CLIETELEFONO() {
        return VCH_CLIETELEFONO;
    }

    public void setVCH_CLIETELEFONO(String VCH_CLIETELEFONO) {
        this.VCH_CLIETELEFONO = VCH_CLIETELEFONO;
    }

    public String getVCH_CLIEEMAIL() {
        return VCH_CLIEEMAIL;
    }

    public void setVCH_CLIEEMAIL(String VCH_CLIEEMAIL) {
        this.VCH_CLIEEMAIL = VCH_CLIEEMAIL;
    }

    @Override
    public String toString() {
        return "Cliente{" + "INT_CLIECODIGO=" + INT_CLIECODIGO + ", VCH_CLIENOMBRE=" + VCH_CLIENOMBRE + ", VCH_CLIEAPELLIDO=" + VCH_CLIEAPELLIDO + ", VCH_CLIECEDULA=" + VCH_CLIECEDULA + ", VCH_CLIEDIRECCION=" + VCH_CLIEDIRECCION + ", VCH_CLIETELEFONO=" + VCH_CLIETELEFONO + ", VCH_CLIEEMAIL=" + VCH_CLIEEMAIL + '}';
    }
    
    
    
}
