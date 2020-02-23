/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ficheros_Binarios {

    private ArrayList<Usuario> ofertadores;
    private File archivo = null;

    public Ficheros_Binarios() {
    }

    public Ficheros_Binarios(String archivoo, ArrayList<Usuario> ofertadores) {
        this.archivo= new File(archivoo);
        this.ofertadores = ofertadores;
    }

    public void cargarArcihivo() {
        try {
            ofertadores = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ( (temp = (Usuario) objeto.readObject()) != null ) {
                        ofertadores.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : ofertadores) {
                if (t instanceof Ofertadores){
                bw.writeObject(t);      
                }
              
            }
            bw.flush();
        } catch (Exception e) {
            
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                
            }
        }
    }

}
