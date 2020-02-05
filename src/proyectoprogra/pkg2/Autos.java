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
public class Autos {
    private String marca,color,tipo_combustible,tipo;
    private double kilometraje;
    private int serie;

    public Autos() {
    }

    public Autos(String marca, String color, String tipo_combustible, double kilometraje, int serie,String tipo) {
        this.marca = marca;
        this.color = color;
        this.tipo_combustible = tipo_combustible;
        this.kilometraje = kilometraje;
        this.serie = serie;
        this.tipo=tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Autos{" + "marca=" + marca + ", color=" + color + ", tipo_combustible=" + tipo_combustible + ", tipo=" + tipo + ", kilometraje=" + kilometraje + ", serie=" + serie + '}';
    }


    
    
}
