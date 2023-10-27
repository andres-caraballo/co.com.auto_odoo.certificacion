package co.com.auto_odoo.certificacion.task.transversal;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.VALIDACION_PANTALLA_BIENVENIDA;
import static co.com.auto_odoo.certificacion.userInterface.llistaDeAplicaciones.PaginaDeAplicaciones.SELECCIONAR_CARD_DE_MODULO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAmodulo implements Task {

    private final String opcionDelMenu;

    public IngresarAmodulo(String opcionDelMenu) {
        this.opcionDelMenu = opcionDelMenu;
    }

    public static IngresarAmodulo delMenu(String opcionDelMenu){
        return instrumented(IngresarAmodulo.class, opcionDelMenu);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esVisible(VALIDACION_PANTALLA_BIENVENIDA),
                EsperarElemento.esClickable(SELECCIONAR_CARD_DE_MODULO.of(opcionDelMenu)),
                Click.on(SELECCIONAR_CARD_DE_MODULO.of(opcionDelMenu))
        );

    }
}
