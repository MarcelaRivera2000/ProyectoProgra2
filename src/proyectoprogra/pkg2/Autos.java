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
    private String marca,modelo,cilindraje,tipo,transmision;
    private int año;

    public Autos() {
    }

    public Autos(String marca, String modelo, String cilindraje, String tipo, String transmision, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.transmision = transmision;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Autos{" + "marca=" + marca + ", modelo=" + modelo + ", cilindraje=" + cilindraje + ", tipo=" + tipo + ", transmision=" + transmision + ", a\u00f1o=" + año + '}';
    }
    

    
    
}
