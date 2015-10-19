/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import servidor.Modelo;

/**
 *
 * @author Jorge
 */
public class Conecta implements Modelo {
    private JTextArea registro; 
    private int puerto;
    private InetAddress direccionServidor;
    
    public Conecta(){
        this.direccionServidor = null;
    }
    
    public void socket() throws UnknownHostException, IOException {
        puerto = 8000;
        try{
            direccionServidor = InetAddress.getLocalHost();
        }catch(UnknownHostException ex){
            Logger.getLogger(Conecta.class.getName()).log(Level.SEVERE, null, ex);
            this.registro.setText(this.registro.getText() + ex + "\r\n");
        }
        
        ServerSocket s = new ServerSocket(puerto);
        
        this.registro.setText(this.registro.getText() + "Servidor: " + direccionServidor.getHostName() + " en puerto " + puerto + " IP " + direccionServidor.getHostAddress() + "\r\n");
        this.registro.setText(this.registro.getText() + "Esperando conexiones...\r\n");
        
        int i = 0;
        
        while(true){
            Socket incoming = s.accept();
            Thread t = new ThreadedHandler(incoming, i++, this.registro);
            this.registro.setText(this.registro.getText() + "Cliente " + i + "\r\n");
            t.start();
        }
    }

    /**
     * Método que envía los eventos al monitor. 
     * @param registro
     */
    @Override
    public void setRegistro(JTextArea registro) {
        this.registro = registro;
        this.registro.setText(this.registro.getText() + "Iniciando el servidor.\r\n");
    }//Cierre del método setRegistro.
}
