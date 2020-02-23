/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos_Texto {

    private Scanner sc = new Scanner(System.in);
    private String texto;
    private File archivo;
    private ArrayList<Usuario> lista;

    public Archivos_Texto() {
    }

    public Archivos_Texto(String texto, ArrayList<Usuario> lista) {
        archivo = new File(texto);
        this.lista = lista;
    }

    public void Escribir() throws Exception {
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Usuario p : lista) {
            if (p instanceof Cliente) {
                System.out.println(p);
                String prueba = p.getTipo() + "," + p.getUsuario() + "," + p.getContra() + "," + p.getNombre() + "," + p.getPais() + "," + p.getCorreo() + "," + "ubicacion" + "," + p.getFecha() + ";";
                bw.append(prueba);
            }
        }
        bw.flush();
        bw.close();
        fw.close();
    }

    public ArrayList<Usuario> Leer() {
        Scanner sc = null;
        lista=new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
            } catch (FileNotFoundException ex) {
            }
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String p = sc.next();
                String [] tokens =p.split(",");
                lista.add(new Cliente(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7]));
            }
        }
       
        return lista;
    }
}
