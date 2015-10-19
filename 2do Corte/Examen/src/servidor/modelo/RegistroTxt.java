/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JTextArea;
import servidor.Modelo;

/**
 *
 * @author Jorge
 */
public class RegistroTxt implements Modelo {
    private JTextArea registro;
    
    public RegistroTxt(String texto) {
        try
        {
            File archivo=new File("Registro.txt");
            FileWriter escribir=new FileWriter(archivo,true);
            escribir.write(texto);
            escribir.close();
        }

        catch(Exception e)
        {
            this.registro.setText(this.registro.getText() + "Error al escribir");
        }
    }

    @Override
    public void setRegistro(JTextArea registro) {
        this.registro = registro;
        this.registro.setText(this.registro.getText() + "Archivo exportado correctamente.\r\n");
    }
}
