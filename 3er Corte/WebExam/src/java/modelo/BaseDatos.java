/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Universidad
 */
@ManagedBean
@RequestScoped
public class BaseDatos {
    private static BaseDatos INSTANCE = new BaseDatos();
    private String host;
    private String usuario;
    private String clave;
    private int puerto;
    private String servidor;
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
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        
        try {
            conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
        } catch (SQLException e) {
            System.err.println(e);
        }
        
    }//Cierre del configurador de la conexion a base de datos.
    
    /**
     * Método que devuelve el estado de la variable conexion. 
     * @return conexion
     */
    public static Connection getConexion() {
        return conexion;
    }//Cierre del método getConexion().
    
}
