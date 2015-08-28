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
public class Pregunta 
{
    private String enunciado;
    private String respuesta;
    private String tema;
    
    Pregunta(){}
    
    Pregunta(String enunciado, String respuesta, String tema){
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.tema = tema;
    }
    
    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
