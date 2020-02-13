/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class Renta extends Membrecias {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Autos> autos = new ArrayList();

    public Renta() {
    }

    public Renta(String tipo, String descripcion) {
        super(tipo, descripcion);
    }
    

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    @Override
    public String toString() {
        return "Renta{" + "autos=" + autos + '}';
    }

    public void reserva() {
        String tipo = "";
        System.out.println("Ingrese el tipo de vehiculo que desea reservar\n1.Uber\n2.Busito\n3.Mudanza ");
        int op = leer.nextInt();
        switch (op) {
            case 1:
                tipo = "uber";
                break;
            case 2:
                tipo = "busito";
                break;
            case 3:
                tipo = "mudanza";
                break;
        }
        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i) instanceof Busito) {
                System.out.println(i+" "+autos.get(i));
            }
            if (autos.get(i) instanceof Uber) {
                System.out.println(i+" "+autos.get(i));
            }
            if (autos.get(i) instanceof Camion_Mudanza) {
                 System.out.println(i+" "+autos.get(i));
            }
        }
        System.out.println("Ingrese la posicion del "+tipo+" que desea rentar: ");
        int opp=leer.nextInt();
        
    }

}
