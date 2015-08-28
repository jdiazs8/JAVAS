/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jorge
 */
public abstract class FabricaPregunta {
    protected Pregunta esqPregunta = null;
    public abstract Pregunta fabricarPregunta();
}
