package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import co.com.auto_odoo.certificacion.interactions.EscribirValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Escribir implements Interaction {

    private String valor;
    private Target elemento;

    public Escribir(String valor, Target elemento) {
        this.valor = valor;
        this.elemento = elemento;
    }

    public static Escribir valorPlataforma(String valor, Target elemento) {
        return instrumented(Escribir.class, valor, elemento);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(valor).into(elemento));
    }
}