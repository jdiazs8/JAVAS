/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

import servidor.Modelo;

/**
 * Clase interface que implementa los modelos básicos de los metodos para el tratamientode de la información de las preguntas.
 * @author: Jorge Diaz Serrato, Sandra Milena Ramirez.
 * @version: V2.1, 18/10/2015
 */
public interface AccionPregunta extends Modelo {
    
    public void crearPregunta();
    public void eliminarPregunta();
    public void modificarPregunta();
}
