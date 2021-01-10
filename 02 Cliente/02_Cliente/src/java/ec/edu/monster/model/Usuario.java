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
public class Usuario {
    private int  usuCodigo;
    private String usuNombre;
    private String usuApellido;
    private String usuCedula;
    private String usuDireccion;
    private String usuTelefono;
    private String usuEmail;
    private String usuUsuario;
    private String usuPassword;

    public Usuario() {
    }

    public Usuario(int usuCodigo, String usuNombre, String usuApellido, String usuCedula, String usuDireccion, String usuTelefono, String usuEmail, String usuUsuario, String usuPassword) {
        this.usuCodigo = usuCodigo;
        this.usuNombre = usuNombre;
        this.usuApellido = usuApellido;
        this.usuCedula = usuCedula;
        this.usuDireccion = usuDireccion;
        this.usuTelefono = usuTelefono;
        this.usuEmail = usuEmail;
        this.usuUsuario = usuUsuario;
        this.usuPassword = usuPassword;
    }

    public int getUsuCodigo() {
        return usuCodigo;
    }

    public void setUsuCodigo(int usuCodigo) {
        this.usuCodigo = usuCodigo;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApellido() {
        return usuApellido;
    }

    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }

    public String getUsuCedula() {
        return usuCedula;
    }

    public void setUsuCedula(String usuCedula) {
        this.usuCedula = usuCedula;
    }

    public String getUsuDireccion() {
        return usuDireccion;
    }

    public void setUsuDireccion(String usuDireccion) {
        this.usuDireccion = usuDireccion;
    }

    public String getUsuTelefono() {
        return usuTelefono;
    }

    public void setUsuTelefono(String usuTelefono) {
        this.usuTelefono = usuTelefono;
    }

    public String getUsuEmail() {
        return usuEmail;
    }

    public void setUsuEmail(String usuEmail) {
        this.usuEmail = usuEmail;
    }

    public String getUsuUsuario() {
        return usuUsuario;
    }

    public void setUsuUsuario(String usuUsuario) {
        this.usuUsuario = usuUsuario;
    }

    public String getUsuPassword() {
        return usuPassword;
    }

    public void setUsuPassword(String usuPassword) {
        this.usuPassword = usuPassword;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuCodigo=" + usuCodigo + ", usuNombre=" + usuNombre + ", usuApellido=" + usuApellido + ", usuCedula=" + usuCedula + ", usuDireccion=" + usuDireccion + ", usuTelefono=" + usuTelefono + ", usuEmail=" + usuEmail + ", usuUsuario=" + usuUsuario + ", usuPassword=" + usuPassword + '}';
    }
    
    
}
