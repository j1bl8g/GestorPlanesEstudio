package modelo;

import java.util.ArrayList;

/**
 * Abstraccion de un curso similares a los del tec
 * @author prograTec.
 */
public class Curso {
  private String nombre;
  private String codigo;
  private int creditos;
  private int horasLectivas;
  private ArrayList<Curso> miCorrequisito = new ArrayList<Curso>();
  private ArrayList<Curso> miRequisito = new ArrayList<Curso>();
  
  /**
   * Constructor de Curso
   * @param pNombre
   * @param pCodigo
   * @param pCreditos
   * @param pHorasLectivas 
   */
  public Curso(String pNombre, String pCodigo, int pCreditos, 
              int pHorasLectivas){
  
    this.codigo = pCodigo;
    this.creditos = pCreditos;
    this.horasLectivas = pHorasLectivas;
    this.nombre = pNombre;  
    miCorrequisito = new ArrayList<Curso>();
    miRequisito = new ArrayList<Curso>();
  }
  
  /**
   * 
   * @return nombre del curso 
   */
  public String getNombre() {
    return nombre;
  }
  
  /**
   * set nombre del curso
   * @param nombre 
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  /**
   * 
   * @return codigo del curso 
   */
  public String getCodigo() {
    return codigo;
  }
  
  /**
   * set codigo de curso
   * @param codigo 
   */
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  
  /**
   * 
   * @return creditos del curso 
   */
  public int getCreditos() {
    return creditos;
  }
  
  /**
   * set creditos del curso
   * @param creditos 
   */
  public void setCreditos(int creditos) {
    this.creditos = creditos;
  }
  
  /**
   * 
   * @return horas lectivas del curso 
   */
  public int getHorasLectivas() {
    return horasLectivas;
  }
  
  /**
   * set horas lectivas del curso
   * @param horasLectivas  
   */
  public void setHorasLectivas(int horasLectivas) {
    this.horasLectivas = horasLectivas;
  }
  
  /**
   * 
   * @return correquisitos del curso 
   */
  public ArrayList<Curso> getMiCorrequisito() {
    return miCorrequisito;
  }
  
  /**
   * set correquitiso del curso
   * @param pCurso 
   */
  public void agregarCorrequisito(Curso pCurso){
    miCorrequisito.add(pCurso);    
  }
  
  /**
   * 
   * @return requisitos del curso 
   */
  public ArrayList<Curso> getMiRequisito() {
    return miRequisito;
  }
  
  /**
   * set requisito del curso
   * @param pCurso 
   */
  public void agregarRequisito(Curso pCurso){
    miRequisito.add(pCurso);    
  }
  
  
}
