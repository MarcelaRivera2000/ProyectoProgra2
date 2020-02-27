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

   // private ArrayList<Ofertadores> listaOfertadores = new ArrayList();
    private ArrayList<Ofertadores2> listaOfertadores = new ArrayList();
    private File archivo = null;

    public Ficheros_Binarios() {
    }
    
    public Ficheros_Binarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Ofertadores2> getListaPersonas() {
        return listaOfertadores;
    }

    public void setListaPersonas(ArrayList<Ofertadores2> listaAlumnos) {
        this.listaOfertadores = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAlumno(Ofertadores2 a) {
        listaOfertadores.add(a);
    }

    public void cargarArchivo() {
        try {
            listaOfertadores = new ArrayList();
            Ofertadores2 temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Ofertadores2) objeto.readObject()) != null) {
                        listaOfertadores.add(temp);
                       
                       
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
            for (Ofertadores2 t : listaOfertadores) {
                System.out.println("1. "+t);
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
