/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionSQL;

/**
 *
 * @author lalos
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
        Connection con=null;
    public Connection conectar() {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url= "jdbc:sqlserver://localhost:1433;databaseName=DENTALSOFT";
            con =(Connection) DriverManager.getConnection(url, "sa", "daniel21");
            System.out.println("Conexion exitosa");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error de conexion"+e.getMessage());
        }
        return con;
    }
    
  
    
}


