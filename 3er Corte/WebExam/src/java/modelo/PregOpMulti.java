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
public class PregOpMulti extends Pregunta {
    Vector<String> respuesta = new Vector<String>();
    /**
     * Creates a new instance of PregOpMulti
     */
    public PregOpMulti() {
    }

    public PregOpMulti(String enunciado, Vector<String> respuesta) {
        this.enunciado = enunciado;
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
