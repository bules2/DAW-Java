package org.iesgrancapitan.PROGR.ejemplos.ej04POO;

/**
 * Ejemplo de uso de clase genérica.
 * 
 * Se trata de una clase parametrizada sobre uno o más tipos.
 * 
 * @author Rafael del Castillo Gomariz
 *
 * @param <T>
 * 
 * T será reemplazado por un tipo real cuando se cree un objeto.
 * 
 * Ejemplos: 
 * 
 *      ClaseGenerica<Double> d = new ClaseGenerica<>();
 *      var e = new ClaseGenerica<Integer>(10);
 */

public class ClaseGenerica<T extends Number> {
  
  private T atributo;

  public ClaseGenerica() {
    this.atributo = null;
  }
  
  public ClaseGenerica(T atributo) {
    this.atributo = atributo;
  }

  public T getAtributo() {
    return atributo;
  }

  public void setAtributo(T atributo) {
    this.atributo = atributo;
  }

  public String getTipo() {
    return this.atributo.getClass().getName();
  }

}
