/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author danyc
 */
public class Conexion {
    public static Connection conexion;
    public static Statement consulta;
    public static boolean valido;
    
    public static void conectarBaseDatos() {
        String url = "";

        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el drivernde PostgreSQL: " + ex.getMessage());
            }

            conexion = null;
            url = "jdbc:postgresql://localhost:5432/pizzamanager";
            //Conectar base de datos
            conexion = DriverManager.getConnection(
                    url,"postgres", "1234");
            valido = conexion.isValid(50000);
            System.out.println("conectado");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datoa de PostgreSQL (" + url + "):" + sqle.toString());
        }
    }
    
        public static void insertarUsuario(){
        try {
            if (valido) {
                consulta = (Statement) conexion.createStatement();                
                consulta.executeUpdate("INSERT INTO usuario VALUES ('daniel','c','calderon',''123456)");
                showMessageDialog(null, "Se ha insertado Correctamente el usuario");
            }
        } catch (SQLException sqle) {
            showMessageDialog(null, "Error al <INSERTAR> en <ENTIDAD> "+sqle);
        }
    }
}
