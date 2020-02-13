/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.function.ObjDoubleConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mvrivera
 */
public class Ficheros_Binarios {

    public Ficheros_Binarios() {
    }
    
    public void escribir(){
        File file;
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        
        file=new File("FicherosBinarios.bin");
        try {
            fileOutputStream=new FileOutputStream(file);
            try {
                objectOutputStream=new ObjectOutputStream(fileOutputStream);
                Usuario f=new Usuario();
                
                objectOutputStream.writeObject(f);
            } catch (IOException ex) {
              
            }
        } catch (FileNotFoundException ex) {
           
        }
    }
    
    
    public void leer(){
          File file;
          FileInputStream fileInputStream;
          ObjectInputStream objectInputStream;
          
          
          
          file=new File("FicherosBinarios.bin");
        try {
            fileInputStream =new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            Object data=objectInputStream.readObject();
            Ofertadores ofe=(Ofertadores)data;
           
            
            
        } catch (FileNotFoundException ex) {
        
        } catch (IOException ex) {
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ficheros_Binarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
