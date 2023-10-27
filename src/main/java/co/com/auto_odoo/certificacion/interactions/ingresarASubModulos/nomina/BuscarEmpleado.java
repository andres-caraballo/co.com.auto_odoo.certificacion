package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarEmpleado {

  private BuscarEmpleado() {}

  public static DeNomina deNomina(String valor, Target elemento) {
    return instrumented(DeNomina.class, valor, elemento);
  }

}
