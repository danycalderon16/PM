/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

<<<<<<< HEAD
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static conexion.Conexion.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
=======
import conexion.LibreriaConexion;
import java.sql.SQLException;
import java.sql.Statement;
import static javax.swing.JOptionPane.showMessageDialog;
>>>>>>> e2ad9325679610776aa17fbda5c7a13f2b5dcfa2

/**
 *
 * @author danyc
 */
public class Utils {
<<<<<<< HEAD
    public static final char CAJERO = 'c';
    public static final char COCINERO = 'o';
    public static final char REPARTIDOR = 'r';
    
    public static void mostrarDatos(DefaultTableModel m, JTable tabla, Object[] identificadores, Object[] fila){
        m = (DefaultTableModel) tabla.getModel();
        m.setColumnIdentifiers(identificadores);
        ResultSet resultado = getDatos("SELECT * FROM USUARIOS");
        try{
            while(resultado.next())
                m.addRow(fila);
            tabla.setFont(new Font("Verdana",Font.BOLD,22));
            tabla.setRowHeight(26);
            tabla.setModel(m);
        }catch(SQLException sqle){
            showMessageDialog(null, "Error: "+sqle);
        }
    }
    
    public static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();  
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
        return new ImageIcon(resizedImage);
    }
=======
    
    public static LibreriaConexion libreria = new LibreriaConexion();
   
    
>>>>>>> e2ad9325679610776aa17fbda5c7a13f2b5dcfa2
}
