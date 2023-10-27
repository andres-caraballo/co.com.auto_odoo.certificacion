package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioNeto;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales.CapturarPrestacionPrima;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularPrestacionPrima implements Task {

    public static CalcularPrestacionPrima deNomina(){
        return instrumented(CalcularPrestacionPrima.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarPrestacionPrima.deNomina().answeredBy(actor);

    }
}
