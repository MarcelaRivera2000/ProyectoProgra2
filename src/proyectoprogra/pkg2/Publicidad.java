/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

/**
 *
 * @author Mvrivera
 */
public class Publicidad {
    private String titulo,usuario,descripcion;

    public Publicidad() {
    }

    public Publicidad(String titulo, String usuario, String descripcion) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Publicidad{" + "titulo=" + titulo + ", usuario=" + usuario + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
