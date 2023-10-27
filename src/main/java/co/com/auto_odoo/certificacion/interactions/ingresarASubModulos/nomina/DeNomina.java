package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;


public class DeNomina implements Interaction {

  private String valor;
  private Target elemento;

  public DeNomina(String valor, Target elemento) {
    this.valor = valor;
    this.elemento = elemento;
  }

  @Step("Empleado de la lista")
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(EsperarElemento.esVisible(elemento),
            Enter.theValue(valor).into(elemento),
            Hit.the(Keys.ENTER).into(elemento));
  }
}
