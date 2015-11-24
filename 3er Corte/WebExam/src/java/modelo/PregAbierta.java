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
public class PregAbierta extends Pregunta {
    String respuesta;

    /**
     * Creates a new instance of PregAbierta
     */
    public PregAbierta() {
    }
    
    public PregAbierta(String enunciado, String respuesta) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public void setBD() {
        
    }

    @Override
    public void updBD() {
        
    }

    @Override
    public void delBD() {
        
    }
   
    
}
