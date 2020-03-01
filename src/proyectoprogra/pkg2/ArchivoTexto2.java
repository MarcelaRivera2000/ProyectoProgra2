/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class ArchivoTexto2 {

    private Scanner sc = new Scanner(System.in);
    private File archivo;
    private Empresas p;
    private String texto;

    public ArchivoTexto2(String texto) {
        archivo = new File(texto);
        this.p = setEmpresa(p);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Empresas getEmpresa() {
        return p;
    }

    public Empresas setEmpresa(Empresas empresa) {
        return this.p = empresa;
    }

    public void Escribir() throws Exception {
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        String prueba = p.getNombre()+ "," + p.getMision()+ "," + p.getVision()+ "," + p.getObjetivos()+ "," + p.getPoliticas()+ "," + p.getUbicacion()+ "," + p.getCorreo() + "," + p.getDirreccion()+","+p.getTelefono()+ ";\n";
        bw.append(prueba);

        bw.flush();
        bw.close();
        fw.close();
    }

    public Empresas Leer() {
        Scanner sc = null;
        Empresas u =new Empresas();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
            } catch (FileNotFoundException ex) {
            }
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String p = sc.next();
                String[] tokens = p.split(",");
                if (tokens.length >= 9) {
                     u = new Empresas(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7],tokens[8]);
                }
            }
        }
        return u;
    }

}
