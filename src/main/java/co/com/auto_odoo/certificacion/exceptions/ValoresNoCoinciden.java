package co.com.auto_odoo.certificacion.exceptions;

public class ValoresNoCoinciden extends AssertionError {
  public static final String CAMPOS_NO_COINCIDEN = "Los valores no coinciden";

  public ValoresNoCoinciden(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
