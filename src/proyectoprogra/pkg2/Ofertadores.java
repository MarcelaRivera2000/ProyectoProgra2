
package proyectoprogra.pkg2;

import java.io.Serializable;
import java.util.ArrayList;

public class Ofertadores extends Usuario implements Serializable{

    private ArrayList<Membrecias> membrecias=new ArrayList();
    private ArrayList<Autos> autos=new ArrayList();
    private ArrayList<Empresas> empresa=new ArrayList();

    private static final long SerialVersionUID = 777L;
    
    public Ofertadores() {
    }

    public Ofertadores(String tipo, String usuario, String contra, String nombre, String pais, String correo, String ubicacion, String fecha) {
        super(tipo, usuario, contra, nombre, pais, correo, ubicacion, fecha);
    }

    public ArrayList<Empresas> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(ArrayList<Empresas> empresa) {
        this.empresa = empresa;
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
        return "Ofertadores{"+super.toString() + " membrecias=" + membrecias + ", autos=" + autos + ", empresa=" + empresa + '}';
    }

 
    
    
    
}
