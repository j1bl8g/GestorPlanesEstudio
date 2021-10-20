package main;

import controlador.ConsultaEscuela;
import controlador.CtrlEscuela;
import modelo.Escuela;
import vista.RegistroEscuela;

/**
 *
 * @author j1bl8
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Escuela esc1 = new Escuela();
        ConsultaEscuela conEsc = new ConsultaEscuela();
        
         RegistroEscuela frm = new RegistroEscuela();
         
        CtrlEscuela ctrl;
        ctrl = new CtrlEscuela (esc1, frm, conEsc);
        ctrl.iniciar();
        
        
         frm.setVisible(true);
        
    }
    
}
