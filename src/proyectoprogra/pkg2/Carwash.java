/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Carwash extends Membrecias{
    private ArrayList<String> citas=new ArrayList();

    public Carwash() {
    }

    public Carwash(String tipo, String descripcion) {
        super(tipo, descripcion);
    }
    

    public ArrayList<String> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<String> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Carwash{" + "citas=" + citas + '}';
    }

    
    
    
    
    
    
    
    
}
