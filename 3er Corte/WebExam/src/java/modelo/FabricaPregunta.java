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
public class FabricaPregunta {
;
    /**
     * Creates a new instance of FabricaPregunta
     */
    public FabricaPregunta() {
    }
    
    public Pregunta ObtenerPregunta(int tipoPregunta) {
        switch(tipoPregunta) {
            case 1:
                return new PregAbierta();
            case 2:
                return new PregFalVer();
            case 3:
                return new PregOpMulti();
            case 4:
                return new PregRelacion();
            default:
                return null;
        }
    }
    
}
