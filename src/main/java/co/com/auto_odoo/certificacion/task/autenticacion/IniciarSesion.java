package co.com.auto_odoo.certificacion.task.autenticacion;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import co.com.auto_odoo.certificacion.interactions.valores.transversal.ObtenerValor;
import co.com.auto_odoo.certificacion.questions.ElementoEsperado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;


public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public static IniciarSesion enOdoo(String usuario, String clave){
        return Tasks.instrumented(IniciarSesion.class, usuario, clave);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random = new Random();
        random.nextInt();

        if (Visibility.of(BTN_NEW_ODOO).viewedBy(actor).asBoolean()) {
            actor.attemptsTo(EsperarElemento.esVisible(BTN_NEW_ODOO),
                    Click.on(BTN_NEW_ODOO),
                    WaitUntil.the(INPUT_USUARIO, isClickable()).forNoMoreThan(20).seconds(),
                    Enter.theValue(usuario).into(INPUT_USUARIO),
                    Enter.theValue(clave).into(INPUT_CLAVE),
                    Click.on(BTN_LOGIN));
        }else {
            actor.attemptsTo(
                    WaitUntil.the(BTN_IDENTIFICARSE, isClickable()).forNoMoreThan(20).seconds(),
                    Click.on(BTN_IDENTIFICARSE),
                    WaitUntil.the(INPUT_USUARIO, isClickable()).forNoMoreThan(20).seconds(),
                    Enter.theValue(usuario).into(INPUT_USUARIO),
                    Enter.theValue(clave).into(INPUT_CLAVE),
                    Click.on(BTN_LOGIN));
        }
    }

}
