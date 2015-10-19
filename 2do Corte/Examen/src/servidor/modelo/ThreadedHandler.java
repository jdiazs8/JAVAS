/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JTextArea;

/**
 *
 * @author Jorge
 */
public class ThreadedHandler extends Thread {
    
    public ThreadedHandler(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }
    
    private Socket incoming;
    private int idclient;
    private final String RESP = "<html>...</html>\r\n";
    private JTextArea jTextArea1;
    
    public ThreadedHandler(Socket i, int c, JTextArea jTextArea1) {
        this.incoming = i;
        this.idclient = c;
        this.jTextArea1 = jTextArea1;
    }
    
    @Override
    public void run() {
        BufferedReader in = null;
        try{
            in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            try(PrintWriter out = new PrintWriter(incoming.getOutputStream(),true)) {
                System.out.print("Cliente "+idclient+"\r\n");
                String line = null;
                do{
                    while(!(line = in.readLine()).equals("") && incoming.isBound()) {
                        this.jTextArea1.setText(this.jTextArea1.getText()+"\r\n"+line+" cliente: "+String.valueOf(idclient));
                    }
                    out.println(RESP);
                }while(!line.equals("bye"));
                in.close();
            }
            incoming.close();
        }catch(IOException ex) {
            System.out.println(ex);
        }finally {
            try{
                in.close();
            }catch(IOException ex){
                System.out.println(ex);
            }
        }
    }
}
