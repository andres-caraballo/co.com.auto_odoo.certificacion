package co.com.auto_odoo.certificacion.task.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import co.com.auto_odoo.certificacion.task.autenticacion.IniciarSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.BTN_CERRAR_SESION;
import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.MENU_DE_USUARIO;

public class CerrarSesion implements Task {

    public static CerrarSesion enOdoo(){
        return Tasks.instrumented(CerrarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(MENU_DE_USUARIO),
                Click.on(MENU_DE_USUARIO));
        actor.attemptsTo(
                MoveMouse.to(BTN_CERRAR_SESION),
                Click.on(BTN_CERRAR_SESION)
        );

    }
}
