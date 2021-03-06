/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra.pkg2;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Empresas implements Serializable{
    private ArrayList<Publicidad> publicidad=new ArrayList();
    private String nombre,mision,vision,telefono,objetivos,politicas,ubicacion,correo,dirreccion;
    private  Image imagenInterna;

        private static final long SerialVersionUID = 333L;

    public Empresas() {
    }

        
    public Empresas(String nombre,String mision, String vision, String objetivos, String politicas, String ubicacion, String correo, String dirreccion,String telefono) {
        this.nombre = nombre;
        this.mision = mision;
        this.vision = vision;
        this.telefono=telefono;
        this.objetivos = objetivos;
        this.politicas = politicas;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.dirreccion = dirreccion;
            }

    public Empresas(Image imagenInterna) {
        this.imagenInterna = imagenInterna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    

    public ArrayList<Publicidad> getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(ArrayList<Publicidad> publicidad) {
        this.publicidad = publicidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getPoliticas() {
        return politicas;
    }

    public void setPoliticas(String politicas) {
        this.politicas = politicas;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public Image getImagenInterna() {
        return imagenInterna;
    }

    public void setImagenInterna(Image imagenInterna) {
        this.imagenInterna = imagenInterna;
    }

    @Override
    public String toString() {
        return "Empresas{" + "publicidad=" + publicidad +  ", nombre=" + nombre + ", mision=" + mision + ", vision=" + vision + ", objetivos=" + objetivos + ", politicas=" + politicas + ", ubicacion=" + ubicacion + ", correo=" + correo + ", dirreccion=" + dirreccion + ", imagenInterna=" + imagenInterna + '}';
    }
   
   
   
   
}
