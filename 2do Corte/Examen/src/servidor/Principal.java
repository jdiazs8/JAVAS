/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import javax.swing.JFrame;
import servidor.controlador.Controlador;
import servidor.vista.Monitor;

/**
 *
 * @author Jorge
 */
public class Principal {
    public static void main(String[] args){
        Controlador cont = new Controlador();
        Monitor vista = new Monitor(cont);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.pack();
        vista.setVisible(true);
    }
    
}
