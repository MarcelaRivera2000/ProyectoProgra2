/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco extends ConexionSockets {

    ArrayList<String> clientes = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    public Banco() throws IOException {
        super("servidor");
    }

    public void startServer() {
        try {
            
            System.out.println("Esperando...");
            cs = ss.accept();
            
            System.out.println("Cliente en línea");
            salidaCliente = new DataOutputStream(cs.getOutputStream());
            salidaCliente.writeUTF("Petición recibida y aceptada");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            while ((mensajeServidor = entrada.readLine()) != null) {
                String h = mensajeServidor;
                System.out.println("a "+h);
                String[] tokens=h.split(",");
                 conexion conect = new conexion(".//Administradores.accdb");
                    Connection con = conect.getConnection();
                    String sql = "insert into Banco(Numero Cuenta,Usuario,Tipo Usuario,Dinero Actual En Cuenta,Dinero Gastado) values (?,?,?,?,?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(tokens[1]));
                    pst.setString(2, tokens[0]);
                    pst.setString(3, tokens[2]);
                    pst.setDouble(4, Double.parseDouble(tokens[3]));
                    pst.setDouble(5, Double.parseDouble(tokens[4]));
            }
            System.out.println("Fin de la conexión");
            ss.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   
}
