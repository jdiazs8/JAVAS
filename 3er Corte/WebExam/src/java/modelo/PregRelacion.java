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
public class PregRelacion extends Pregunta {
    Vector<String> opcion = new Vector<String>();
    Vector<String> relacion = new Vector<String>();
    /**
     * Creates a new instance of PregRelacion
     */
    public PregRelacion() {
    }
    
    public PregRelacion(String enunciado, Vector<String> opcion, Vector<String> relacion) {
        this.enunciado = enunciado;
        this.opcion = opcion;
        this.relacion = relacion;
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
