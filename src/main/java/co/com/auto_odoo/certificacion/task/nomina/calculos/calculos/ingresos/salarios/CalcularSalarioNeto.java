package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.salarios;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioNeto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularSalarioNeto implements Task {

    public static CalcularSalarioNeto deNomina(){
        return instrumented(CalcularSalarioNeto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarSalarioNeto.deNomina().answeredBy(actor);

    }
}
