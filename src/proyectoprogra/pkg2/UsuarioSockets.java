/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class UsuarioSockets extends ConexionSockets {

    public UsuarioSockets() throws IOException {
        super("cliente");
    }

    public void startClient(String Usuario, String NumCuenta, String tipo, double dineroAcutal, double dineroGastado) {
        String datos = Usuario + "," + NumCuenta + "," + tipo + "," + dineroAcutal + "," + dineroGastado;
        System.out.println(datos);
        try {
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            entradaServidor = new DataInputStream(cs.getInputStream());
            salidaServidor.writeUTF(datos);
            cs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
