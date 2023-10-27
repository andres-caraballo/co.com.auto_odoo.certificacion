package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.auto_odoo.certificacion.userInterface.PaginaModuloSuperior.BTN_RECIBOS_DE_NOMINA;
import static co.com.auto_odoo.certificacion.userInterface.PaginaModuloSuperior.BTN_TODOS_LOS_RECIBOS_DE_NOMINA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarATodosLosRecibosDeNomina implements Task {


    public static IngresarATodosLosRecibosDeNomina deOdoo(){
        return instrumented(IngresarATodosLosRecibosDeNomina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RECIBOS_DE_NOMINA),
                EsperarElemento.esClickable(BTN_TODOS_LOS_RECIBOS_DE_NOMINA),
                Click.on(BTN_TODOS_LOS_RECIBOS_DE_NOMINA)
        );
    }
}
