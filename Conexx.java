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
public class Conexx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
        // TODO code application logic here
      Connection con= null;
      String Url;
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      Url  = "jdbc:sqlserver://tecjulian.database.windows.net:1433;database=PooTec;user=nef;password={Admin123};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
      try {
             con = DriverManager.getConnection(Url);
             if (con != null){
                 PreparedStatement ps = null;
                 System.out.println("Conectado :D");
                 PreparedStatement stmt = con.prepareStatement("INSERT INTO curso VALUES (?)");
                 String sISBN = "k hubole perro";
                 stmt.setString(1,sISBN);
                 stmt.executeUpdate();
             }
        } catch (SQLException e) {
            System.out.println("no Conectado :<");
        }
        //return con;
        
      //Statement s = con.createStatement();
      //ResultSet rs = s.executeQuery ("SELECT id_cat FROM CATEGORIA where id_cat = (Select MAX(id_cat) FROM CATEGORIA) ORDER BY id_cat;");//sent
    }
    
    
}

    
    
   
    

