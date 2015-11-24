/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Vector;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Universidad
 */
@ManagedBean
@RequestScoped
public class Constructor {
    Director director;
    private String accion;
    private int cantidad;
    private String tipo;
    /**
     * Creates a new instance of Constructor
     */
    public Constructor() {
        director = new Director();
    }

    public String getAccion() {
        if("setP".equals(accion)) {
            return "Guardar pregunta";
        }
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
