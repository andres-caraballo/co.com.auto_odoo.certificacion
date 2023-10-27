package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales.CapturarPensionEmpleador;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales.CapturarPrestacionCesantias;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularPensionEmpleador implements Task {

    public static CalcularPensionEmpleador deNomina(){
        return instrumented(CalcularPensionEmpleador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarPensionEmpleador.deNomina().answeredBy(actor);

    }
}
