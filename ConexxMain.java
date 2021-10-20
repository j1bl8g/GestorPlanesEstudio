package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author j1bl8
 */
public class ConexxMain {
    public  Connection getConexion() {
        Connection con= null;
        String Url;
        try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbpoo", "root","admin");
             if (con != null){
                 System.out.println("Conectado");
             }
        } catch (SQLException e) {
            System.out.println(":v");
        }
        return con; 
   }
    
}    
  
     
    
    


    
    
   
    

