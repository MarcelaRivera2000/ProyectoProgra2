
package proyectoprogra.pkg2;

import java.util.ArrayList;

public class Ofertadores extends Usuario {

    private ArrayList<Membrecias> membrecias=new ArrayList();
    private ArrayList<Autos> autos=new ArrayList();

    public Ofertadores() {
    }

    public Ofertadores(String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha) {
        super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
    }
    
  

    public ArrayList<Membrecias> getMembrecias() {
        return membrecias;
    }

    public void setMembrecias(ArrayList<Membrecias> membrecias) {
        this.membrecias = membrecias;
    }

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "Ofertadores{" + "membrecias=" + membrecias + ", autos=" + autos + '}';
    }
 
    
    
    
}
