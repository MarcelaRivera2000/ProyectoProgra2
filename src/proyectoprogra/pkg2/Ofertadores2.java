package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Ofertadores2 extends Usuario {

    private ArrayList<Membrecias> membrecias = new ArrayList();
    private int dinero;

    public Ofertadores2() {
    }

    public Ofertadores2(int dinero, String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha) {
        super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    public ArrayList<Membrecias> getMembrecias() {
        return membrecias;
    }

    public void setMembrecias(ArrayList<Membrecias> membrecias) {
        this.membrecias = membrecias;
    }

    @Override
    public String toString() {
        return "Ofertadores2{" + "membrecias=" + membrecias + ", dinero=" + dinero + '}';
    }

   
}
