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
public class Pregunta implements AccionPregunta{
    private String materia;
    private int nivel;
    private String enunciado;
    private String respuesta;
    private String tipoPregunta;
    
    public Pregunta() {
        
    }

    public Pregunta(String materia, int nivel, String Enunciado, String respuesta, String tipoPregunta) {
        this.materia = materia;
        this.nivel = nivel;
        this.enunciado = Enunciado;
        this.respuesta = respuesta;
        this.tipoPregunta = tipoPregunta;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
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

    @Override
    public void crear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
