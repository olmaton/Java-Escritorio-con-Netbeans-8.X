/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Miler
 */
public class Conexion {
    private static String bd="bdtutoriales";
    private static String user="mroque";
    private static String pass="system";
    private static String url="jdbc:mysql://localhost/"+bd;
    
    public Connection getConexion(){
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en conexión "+e.getMessage());
        }
        return cn;
    }
}
