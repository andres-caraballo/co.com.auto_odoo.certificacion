package co.com.auto_odoo.certificacion.task.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.*;
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

        actor.attemptsTo(
                WaitUntil.the(BTN_IDENTIFICARSE, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_IDENTIFICARSE),
                WaitUntil.the(INPUT_USUARIO, isClickable()).forNoMoreThan(20).seconds(),
                Enter.theValue(usuario).into(INPUT_USUARIO),
                Enter.theValue(clave).into(INPUT_CLAVE),
                Click.on(BTN_LOGIN));
//                Enter.theValue(correo).into(INPUT_CORREO),
//                Click.on(DESPLEGAR_LISTA_DE_MES),
//                Click.on(MES_DE_LA_LISTA.of("May")),
//                Click.on(DESPLEGAR_LISTA_DE_DIAS),
//                Click.on(DIA_DE_LA_LISTA.of("10")),
//                Click.on(DESPLEGAR_LISTA_DE_ANIOS),
//                Click.on(ANIO_DE_LA_LISTA.of("1990")),
//                Click.on(BTN_NEXT_LOCATION_SIGUIENTE));

    }


}
