package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

public class Ofertadores2 extends Usuario{

    private ArrayList<Membrecias> membrecias=new ArrayList();

    public Ofertadores2() {
    }

    public Ofertadores2(String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha) {
        super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
    }

    public ArrayList<Membrecias> getMembrecias() {
        return membrecias;
    }

    public void setMembrecias(ArrayList<Membrecias> membrecias) {
        this.membrecias = membrecias;
    }

    

    @Override
    public String toString() {
        return "Ofertadores2{" + "membrecias=" + membrecias + '}';
    }
    

    
    
    

 

   
 
    
    
    
}
