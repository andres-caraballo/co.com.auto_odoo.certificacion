package co.com.auto_odoo.certificacion.interactions;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.SALARIO_BASICO_TOTAL;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.REGRESAR_A_HOJA_DE_CALCULO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Regresar implements Interaction {
    public static Regresar aHojaCalculo(){
        return instrumented(Regresar.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(REGRESAR_A_HOJA_DE_CALCULO),
                EsperarElemento.esClickable(SALARIO_BASICO_TOTAL)
        );


    }
}
