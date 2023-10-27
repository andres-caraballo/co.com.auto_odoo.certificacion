package co.com.auto_odoo.certificacion.task.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.SALARIO_BASICO_TOTAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarACalculoDeSalario implements Task {

    public static IngresarACalculoDeSalario deNomina(){
        return instrumented(IngresarACalculoDeSalario.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EsperarElemento.esVisible(DIAS_TRABAJADOS_Y_ENTRADAS));
        double salarioBase = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(DIAS_TRABAJADOS_Y_ENTRADAS).viewedBy(actor).asString()))/ 100;
        actor.attemptsTo(
                Click.on(BTN_CALCULO_DE_SALARIO),
                EsperarElemento.esVisible(SALARIO_BASICO_TOTAL)
        );
        double salarioBasicoTotal = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString()))/ 100;
        Ensure.that(salarioBase).equals(salarioBasicoTotal);

    }
}
