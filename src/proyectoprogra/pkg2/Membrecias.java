/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.Serializable;

/**
 *
 * @author Mvrivera
 */
public class Membrecias implements Serializable {

    private String tipo, descripcion;

    public Membrecias() {
    }

    public Membrecias(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Membrecias{" + "tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }

}
