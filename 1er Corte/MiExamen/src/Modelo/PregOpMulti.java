/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class PregOpMulti extends Pregunta
{    
    ArrayList<String> opciones;

    public PregOpMulti(ArrayList<String> opciones) {
        this.opciones = opciones;
    }

    public PregOpMulti() {}

    public ArrayList<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<String> opciones) {
        this.opciones = opciones;
    }
}
