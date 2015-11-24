/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Universidad
 */
@ManagedBean
@RequestScoped
public abstract class Pregunta {
    String enunciado;

    /**
     * Creates a new instance of Pregunta
     */
    public Pregunta() {
    }

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
    public abstract void setBD();
    public abstract void updBD();
    public abstract void delBD();
    
}
