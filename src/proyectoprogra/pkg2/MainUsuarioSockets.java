/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.IOException;

/**
 *
 * @author Mvrivera
 */
public class MainUsuarioSockets {

    public static void main(String[] args) throws IOException {
        UsuarioSockets cli = new UsuarioSockets();

        System.out.println("Iniciando cliente\n");
        cli.startClient(Usuario, NumCuenta, tipo, dineroAcutal, dineroGastado);
    }
    static String NumCuenta;
    static String Usuario;
    static String tipo;
    static double dineroAcutal, dineroGastado;

    public static void nuevousuario( String u,String n, String t, double da, double dg) {
        NumCuenta = n;
        Usuario = u;
        tipo = t;
        dineroAcutal = da;
        dineroGastado = dg;
    }

}
