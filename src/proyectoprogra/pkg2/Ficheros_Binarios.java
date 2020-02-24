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
        this.archivo = new File(archivoo);
        this.ofertadores = ofertadores;
    }

    public void escribir() {
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        File file;
        file = new File("FicherosBinarios.bin");

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Usuario i : ofertadores) {
                if (i instanceof Ofertadores) {
                    objectOutputStream.writeObject(i);
                }
            }

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }

    }

    public void leer() {
        try {
            ofertadores = new ArrayList();
            Ofertadores temporal;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temporal = (Ofertadores) objeto.readObject()) != null) {
                        ofertadores.add(temporal);
                        System.out.println(temporal);
                    }
                } catch (Exception e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
        }
    }
}
