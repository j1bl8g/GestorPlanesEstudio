package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Escuela;
import vista.RegistroEscuela;

/**
 *
 * @author j1bl8
 */
public class CtrlEscuela implements ActionListener {
  private Escuela esc;
  private RegistroEscuela frm2;    
  private ConsultaEscuela modS;
  
//constructor de clase
  public CtrlEscuela(Escuela esc, RegistroEscuela frm2, ConsultaEscuela modS ){
    this.esc = esc;
    this.frm2 = frm2;
    this.modS = modS;
    //botones
    this.frm2.btnRegistrarEscuela.addActionListener(this);
  }

    
  
  //metodo para iniciar vista
    public void iniciar(){
      frm2.setTitle("REGISTRO_ESCUELA");
      frm2.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    //detectar que boton se preciona
    if(ae.getSource() == frm2.btnRegistrarEscuela){
        //tomar valores de caja de texto y meterlos al modelo
        esc.setNombre(frm2.textFieldNombreEscuela.getText());
        esc.setCodigo(frm2.textFieldCodigoEscuela.getText());
       
       
    if (modS.registrar(esc)){
            JOptionPane.showMessageDialog(null, "Registro guardado");
        } else{
            JOptionPane.showMessageDialog(null, ":<");
        }
    }
    }
  
    
}
