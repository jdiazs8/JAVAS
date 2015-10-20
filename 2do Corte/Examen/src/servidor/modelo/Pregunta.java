/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JTextArea;

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
    public void crearPregunta() {
        CallableStatement cs;
        
        try{
            cs = BaseDatos.getConexion().prepareCall("{CALL insertarPregunta(?,?,?,?,?)}");
            String s1 = "Enunciado de prueba.";
            cs.setString(1, s1);
            cs.setString(2, "Respuesta de prueba");
            cs.setInt(3, 1);
            cs.setInt(4, 2);
            cs.setInt(5, 1);
            cs.execute();
        }catch (SQLException e) {
            System.err.println("Error en la INSERCIÓN " + e);
        }
    }

    @Override
    public void eliminarPregunta() {
        
    }

    @Override
    public void modificarPregunta() {
        
    }

    @Override
    public void setRegistro(JTextArea registro) {
        
    }
}
