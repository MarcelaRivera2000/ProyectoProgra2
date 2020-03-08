/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class Renta extends Membrecias    {
ArrayList<Autos> autos=new ArrayList();

    public Renta(String tipo, String descripcion) {
        super(tipo, descripcion);
    }

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "Renta{" + "autos=" + autos + '}';
    }
}
