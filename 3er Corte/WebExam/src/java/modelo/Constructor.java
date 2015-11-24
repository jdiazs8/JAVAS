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
    Vector<Pregunta> pregunta = new Vector<Pregunta>();
    private String accion;
    private int cantidad;
    private String tipo;
    /**
     * Creates a new instance of Constructor
     */
    public Constructor() {
        director = new Director();
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Examen solicitarPregunta() {
        return null;
    }  
    
}
