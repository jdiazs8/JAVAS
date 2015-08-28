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
public class PregFalVer extends Pregunta
{
    boolean status;

    public PregFalVer(boolean status) {
        this.status = status;
    }

    public PregFalVer() {}

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
