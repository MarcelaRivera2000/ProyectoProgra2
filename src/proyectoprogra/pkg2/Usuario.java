/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.util.Date;

/**
 *
 * @author Mvrivera
 */
public class Usuario {
    private String tipo,usuario,contra,nombre,pais,correo,ubicacion;
    private Date fecha;
    
    

    public Usuario() {
    }

    public Usuario(String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, Date fecha) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.pais = pais;
        this.correo = correo;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "tipo=" + tipo + ", usuario=" + usuario + ", contra=" + contra + ", nombre=" + nombre + ", pais=" + pais + ", correo=" + correo + ", ubicacion=" + ubicacion + ", fecha=" + fecha + '}';
    }
    

    
    
    
}
