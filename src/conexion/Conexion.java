/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author danyc
 */
public class Conexion {
    public static Connection connection;
    public static Statement consulta;
    
    
    public static void conectarBaseDatos(String host, String port, String database, String user, String password) {
        String url = "";

        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el drivernde PostgreSQL: " + ex.getMessage());
            }

            connection = null;
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;
            //Conectar base de datos
            connection = DriverManager.getConnection(
                    url,
                    user,
                    password);
            boolean valid = connection.isValid(50000);
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datoa de PostgreSQL (" + url + "):" + sqle.toString());
        }
    }
}
