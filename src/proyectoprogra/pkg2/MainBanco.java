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
public class MainBanco {
     public static void main(String[] args) throws IOException{
        Banco serv = new Banco();
        System.out.println("Iniciando servidor\n");
        serv.startServer(); 
         
         
    }
}
