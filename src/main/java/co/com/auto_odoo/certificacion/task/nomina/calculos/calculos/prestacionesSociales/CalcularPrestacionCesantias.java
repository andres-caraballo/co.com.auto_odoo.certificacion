package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioNeto;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales.CapturarPrestacionCesantias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularPrestacionCesantias implements Task {

    public static CalcularPrestacionCesantias deNomina(){
        return instrumented(CalcularPrestacionCesantias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarPrestacionCesantias.deNomina().answeredBy(actor);

    }
}
