
package proyectoprogra.pkg2;

import java.util.ArrayList;

public class Ofertadores extends Usuario {

    private ArrayList<Membrecias> membrecias=new ArrayList();
   
    public Ofertadores() {
        super();
    }

    public ArrayList<Membrecias> getMembrecias() {
        return membrecias;
    }

    public void setMembrecias(ArrayList<Membrecias> membrecias) {
        this.membrecias = membrecias;
    }

    @Override
    public String toString() {
        return "Ofertadores{" + "membrecias=" + membrecias + '}';
    }
    
    
    
}
