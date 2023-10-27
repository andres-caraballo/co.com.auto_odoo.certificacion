package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioNeto;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales.CapturarPrestacionInteresCesantias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularPrestacionInteresCesantias implements Task {

    public static CalcularPrestacionInteresCesantias deNomina(){
        return instrumented(CalcularPrestacionInteresCesantias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarPrestacionInteresCesantias.deNomina().answeredBy(actor);

    }
}
