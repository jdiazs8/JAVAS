/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

/**
 *
 * @author Jorge
 */
public class Pregunta {
    private String materia;
    private int nivel;
    private String enunciado;
    private String respuesta;
    
    public Pregunta(){
       
    }

    public Pregunta(String materia, int nivel, String Enunciado, String respuesta) {
        this.materia = materia;
        this.nivel = nivel;
        this.enunciado = Enunciado;
        this.respuesta = respuesta;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String Enunciado) {
        this.enunciado = Enunciado;
    }

    public String getRespuesta() {
        return respuesta; 
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
