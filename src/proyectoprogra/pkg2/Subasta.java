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
public class Subasta implements Serializable{
   private Autos auto;
   private Ofertadores2 ofertador;
   private String Descripcion;
   private double costoinicial;
   private int estado;

    public Subasta() {
    }

    public Subasta(Autos auto, Ofertadores2 ofertador, String Descripcion, double costoinicial, int estado) {
        this.auto = auto;
        this.ofertador = ofertador;
        this.Descripcion = Descripcion;
        this.costoinicial = costoinicial;
        this.estado = estado;
    }

 

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public Autos getAuto() {
        return auto;
    }

    public void setAuto(Autos auto) {
        this.auto = auto;
    }

    public Ofertadores2 getOfertador() {
        return ofertador;
    }

    public void setOfertador(Ofertadores2 ofertador) {
        this.ofertador = ofertador;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getCostoinicial() {
        return costoinicial;
    }

    public void setCostoinicial(double costoinicial) {
        this.costoinicial = costoinicial;
    }

    @Override
    public String toString() {
        return "Subasta{" + "auto=" + auto + ", ofertador=" + ofertador + ", Descripcion=" + Descripcion + ", costoinicial=" + costoinicial + ", estado=" + estado + '}';
    }

  
   
    
    
    
    
    
}
