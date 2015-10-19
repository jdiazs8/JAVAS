/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controlador;

import javax.swing.JTextArea;
import servidor.modelo.*;
import servidor.vista.Monitor;


/**
 *
 * @author Jorge
 */
public class Controlador {
    private BaseDatos bd;
    private Monitor vista;
    
    public Controlador(){
        this.bd = BaseDatos.getInstance();
    }
    
    public void setBaseDato(String dataBase, String host, String port, String user, String password) {
        int puerto = Integer.parseInt(port);
        bd.setBaseDatos(dataBase, host, puerto, user, password);
    }
    
    public void setRegistro(JTextArea reg) {
        reg.setText(bd.getRegistro().getText() + "\n");
    }
}
