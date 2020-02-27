/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.io.Serializable;

/**
 *
 * @author Mvrivera
 */
public class CitasCarwash  implements Serializable{
    private String fecha;
    private String Hora;
    private Autos auto;
    private Cliente cliente;

    public CitasCarwash() {
    }

    public CitasCarwash(String fecha, String Hora, Autos auto, Cliente cliente) {
        this.fecha = fecha;
        this.Hora = Hora;
        this.auto = auto;
        this.cliente = cliente;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public Autos getAuto() {
        return auto;
    }

    public void setAuto(Autos auto) {
        this.auto = auto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CitasCarwash{" + "fecha=" + fecha + ", Hora=" + Hora + ", auto=" + auto + ", cliente=" + cliente + '}';
    }
    
    
    
}
