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
public class ChPregunta {
    private static final int OP_MULTI = 1;
    private static final int ABIERTA = 2;
    private static final int FAL_VER = 3;
    private static final int RELACION = 4;
    /**
     * Creates a new instance of ChPregunta
     */
    public ChPregunta() {
    }
    
}
