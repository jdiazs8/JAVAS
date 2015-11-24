/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JTextArea;
import servidor.Modelo;

 /**
 * Esta clase establece la información para conectarse a la base de datos.
 * @author: Jorge Diaz Serrato, Sandra Milena Ramirez.
 * @version: V2.1, 18/10/2015
 */
public class BaseDatos implements Modelo {
    
    //Datos de la clase.
    private static final BaseDatos INSTANCE = new BaseDatos();
    private String host;
    private String usuario;
    private String clave;
    private int puerto;
    private String servidor;
    private JTextArea registro;
    private static Connection conexion = null;

    /**
     * Constructor de la base de datos.
     */
    private BaseDatos() {
    }//Cierre del constructor
    
    /**
     * Método que devuelve una instancia de la clase BaseDatos. 
     * @return instance
     */
    public static BaseDatos getInstance(){
        return INSTANCE;
    }//Cierre del instanciador.
    
    /**
     * Método que cofigura la base de datos. 
     * @param baseDatos
     * @param host
     * @param puerto
     * @param usuario
     * @param clave
     */
    public void setBaseDatos(String baseDatos, String host, int puerto, String usuario, String clave) {
        this.host = host;
        this.puerto = puerto;
        this.usuario = usuario;
        this.clave = clave;
        
        this.servidor="jdbc:mysql://" + this.host + ":" + this.puerto + "/" + baseDatos;
        this.registro.setText(this.registro.getText() + "Usuario: " + this.usuario + "\r\r\n" + this.servidor + "\r\r\n");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            this.registro.setText(this.registro.getText() + "Error al cargar el driver: " + e + "\r\n");
        }
        
        try {
            conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
        } catch (SQLException e) {
            this.registro.setText(this.registro.getText() + "Error al conectar con el servidor: " + e + "\r\n");
        }
        
        if(conexion != null)
            this.registro.setText(this.registro.getText() + "Conectado a " + baseDatos + "\r\n");
    }//Cierre del configurador de la conexion a base de datos.
    
    /**
     * Método que devuelve el estado de la variable conexion. 
     * @return conexion
     */
    public static Connection getConexion() {
        return conexion;
    }//Cierre del método getConexion().
    
    /**
     * Método que envía los eventos al monitor. 
     * @param registro
     */
    @Override
    public void setRegistro(JTextArea registro) {
        this.registro = registro;
        this.registro.setText(this.registro.getText() + "Conexión de la base de datos.\r\n");
    }//Cierre del método setRegistro.
}