/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controlador;

import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.JTextArea;
import servidor.Modelo;
import servidor.modelo.*;

/**
 *
 * @author Jorge
 */
public class Controlador implements Modelo, AccionPregunta {
    private BaseDatos bd;
    private Conecta iniServer;
    private JTextArea registro;
    private RegistroTxt expRegistro;
    private AccionPregunta pregunta;
    
    public Controlador(){
        bd = BaseDatos.getInstance();
        iniServer = new Conecta();
        registro = new JTextArea();
    }
    
    public void setBaseDato(String dataBase, String host, String port, String user, String password) {
        bd.setRegistro(registro);
        int puerto = Integer.parseInt(port);
        bd.setBaseDatos(dataBase, host, puerto, user, password);
    }
    
    public void conectarServidor() throws UnknownHostException, IOException {
        iniServer.setRegistro(registro);
        iniServer.socket();
    } 
    
    public void ExportarRegistro() {
        expRegistro  = new RegistroTxt(registro.getText());
        expRegistro.setRegistro(registro);
        pregunta = new Pregunta();
        pregunta.crearPregunta();
    }
    
    public void preguntas() {
        this.pregunta = new Pregunta();
    }
    
   
    @Override
    public void setRegistro(JTextArea registro) {
        this.registro = registro;
    }

    @Override
    public void crearPregunta() {
        pregunta.crearPregunta();
    }

    @Override
    public void eliminarPregunta() {

    }

    @Override
    public void modificarPregunta() {

    }
}
