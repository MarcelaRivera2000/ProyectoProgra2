package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Ofertadores2 extends Usuario {

    private ArrayList<Membrecias> membrecias=new ArrayList();
    private int Dinero;
    
    public Ofertadores2() {
    }
    
    public Ofertadores2(String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha,int dinero) {
        super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
        this.Dinero=dinero;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }
    
    public ArrayList<Membrecias> getMembrecias() {
        return membrecias;
    }

    public void setMembrecias(ArrayList<Membrecias> membrecias) {
        this.membrecias = membrecias;
    }

    @Override
    public String toString() {
        return "Ofertadores2{" + "membrecias=" + membrecias + ", Dinero=" + Dinero + '}';
    }
}
