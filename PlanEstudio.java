package modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 * Abstraccion de un plan de estudios, similarar al del tec
 * @author prograTec
 */
public class PlanEstudio {
  private String numeroPlan;
  private LocalDate fechaEntradaVigencia;
  private Curso miCurso;
  
  /**
   * Constructor
   * @param pNumeroPlan
   * @param pFechaEntradaVigencia
   * @param pDiaContratacion
   * @param pMesContratacion
   * @param pAnoContratacion 
   */
  public PlanEstudio(String pNumeroPlan, Date pFechaEntradaVigencia, 
                     int pDiaContratacion, int pMesContratacion,
                     int pAnoContratacion){
      
    this.numeroPlan = pNumeroPlan;
    this.fechaEntradaVigencia = LocalDate.of(pAnoContratacion, pMesContratacion, pDiaContratacion);
  }
  
  /**
   * 
   * @return numero de plan del plan de estudios 
   */
  public String getNumeroPlan() {
    return numeroPlan;
  }
  
  /**
   * set numero de plan 
   * @param numeroPlan 
   */
  public void setNumeroPlan(String numeroPlan) {
    this.numeroPlan = numeroPlan;
  }
  
  /**
   * 
   * @return fecha vigencia del plan de estudios 
   */
  public LocalDate getFechaEntradaVigencia() {
    return fechaEntradaVigencia;
  }
  
  /**
   * set fecha entrada en vigencia del plan de estudios
   * @param fechaEntradaVigencia 
   */
  public void setFechaEntradaVigencia(LocalDate fechaEntradaVigencia) {
    this.fechaEntradaVigencia = fechaEntradaVigencia;
  }
  
  /**
   * 
   * @return curso del plan de estudios 
   */
  public Curso getMiCurso() {
    return miCurso;
  }

  /**
   * set curso a plan de estudios
   * @param pCurso 
   */
  public void setMiCurso(Curso pCurso) {
    miCurso = pCurso;
  }
  
  
  
  
    
}
