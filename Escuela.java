package modelo;

import java.util.ArrayList;

/**
 * Abstraccion de una escuela similar al tec
 * @author prograTec
 */
public class Escuela {
  private String nombre;
  private String codigo;
  private ArrayList<PlanEstudio> planEstudios = new ArrayList<PlanEstudio>();
  
  /**
   * Constructor
   * @param pNombre
   * @param pCodigo 
   */
  public Escuela(String pNombre, String pCodigo){
    this.codigo = pCodigo;
    this.nombre = pNombre;    
    planEstudios = new ArrayList<PlanEstudio>();
  } 
  
  /**
   * 
   * @return nombre de la escuela 
   */
  public String getNombre() {
    return nombre;
  }
  
  /**
   * set nombre de la escuela
   * @param nombre 
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  /**
   * 
   * @return codigo de la escuela 
   */
  public String getCodigo() {
    return codigo;
  }
  
  /**
   * set codigo de escuela
   * @param codigo 
   */
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  /**
   * 
   * @return plan de estudios de escuela 
   */
  public ArrayList<PlanEstudio> getPlanEstudios() {
    return planEstudios;
  }
  
  /**
   * set plan de estudios a escuela
   * @param pPlanEstudio 
   */
  public void agregarPlanEstudios(PlanEstudio pPlanEstudio) {
    planEstudios.add(pPlanEstudio);
  }
  
  
  
  
  
}
