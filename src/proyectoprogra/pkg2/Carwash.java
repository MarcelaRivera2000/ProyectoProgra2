
package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;


public class Carwash extends Membrecias {
    private ArrayList<String> citas=new ArrayList();

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
