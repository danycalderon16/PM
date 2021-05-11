/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
<<<<<<< HEAD
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
=======
import java.sql.SQLException;
import java.sql.Statement;
>>>>>>> e2ad9325679610776aa17fbda5c7a13f2b5dcfa2
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author danyc
 */
public class Conexion {
<<<<<<< HEAD

    public static Connection connection;
    public static Statement consulta;
    public static boolean valido;

    public static void conectarBaseDatos(String host, String port, String database, String user, String password) {
=======
    public static Connection conexion;
    public static Statement consulta;
    public static boolean valido;
    
    public static void conectarBaseDatos() {
>>>>>>> e2ad9325679610776aa17fbda5c7a13f2b5dcfa2
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
<<<<<<< HEAD
            connection = DriverManager.getConnection(
                    url,
                    user,
                    password);
            valido = connection.isValid(50000);
=======
            conexion = DriverManager.getConnection(
                    url,"postgres", "1234");
            valido = conexion.isValid(50000);
            System.out.println("conectado");
>>>>>>> e2ad9325679610776aa17fbda5c7a13f2b5dcfa2
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error al conectar con la base de datoa de PostgreSQL (" + url + "):" + sqle.toString());
        }
    }
<<<<<<< HEAD

    public static void insertarUsuario(String nombre, String apellido, String pass, char cargo) {
        String query = "INSERT INTO usuarios (usu_nombre, usu_apellido, usu_pass, usu_rol) \n" +
                        "VALUES ('"+nombre+"','"+apellido+"','"+pass+"','"+cargo+"')";
        try {
            if (valido) {
                consulta = (Statement) connection.createStatement();
                consulta.executeUpdate(query);
                showMessageDialog(null, "Se ha insertado Correctamente el usuario");
            }            
        } catch (SQLException ex) {
            showMessageDialog(null, "Error al <INSERTAR> usuario " + ex);
        }
    }
    
    public static boolean eliminarFila(String consulta){
        Statement sentencia;
        System.out.println(consulta);
        if(valido){
            try{
                sentencia = connection.createStatement();                
                PreparedStatement st = connection.prepareStatement(consulta);
                st.executeUpdate(); 
            }catch(SQLException sql){
                showMessageDialog(null,"Error en la consulta: "+ sql.toString());
                return false;
            }        
        }else{
             showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
             return false;
        }
        return true;
    }
    
    public static ResultSet getDatos(String consulta){    
        Statement sentencia;
        ResultSet datos = null;
        if(valido){
            try{
                sentencia = connection.createStatement();
                datos = sentencia.executeQuery(consulta);
            }catch(SQLException sql){
                showMessageDialog(null,"Error en la consulta: "+ sql.toString());
            }        
        }else
             showMessageDialog(null, "Se ha perdido la conexion. Verifique con el administrador");
        return datos;
    }
    
=======
    
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
>>>>>>> e2ad9325679610776aa17fbda5c7a13f2b5dcfa2
}
