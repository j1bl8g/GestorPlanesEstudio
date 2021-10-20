/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Escuela;

/**
 *
 * @author j1bl8
 */
public class ConsultaEscuela extends ConexxMain {
  public boolean registrar (Escuela esc){
    LinkedList<Escuela>ListadoEscuela = new LinkedList<Escuela>();
    String cadena = "";
    PreparedStatement ps = null; 
    ListadoEscuela.add(esc);
    Connection con = getConexion();
    String sql = "INSERT INTO Escuela (codigo, nombre) VALUES(?,?)";
    int largo = ListadoEscuela.size();
    
    try{
        for (int i = 0; i < largo; i++) {
        ps = con.prepareStatement(sql);
        ps.setString(1, esc.getCodigo());
        ps.setString(2, esc.getNombre());
        ps.execute();
        }
        return true;
    } catch (SQLException e)
    {
        System.err.println(e);
        return false;
    } finally {
        try{
            con.close();
        } catch (SQLException e){
        System.err.println(e);
    }
  }     
  }    
      
    
}
