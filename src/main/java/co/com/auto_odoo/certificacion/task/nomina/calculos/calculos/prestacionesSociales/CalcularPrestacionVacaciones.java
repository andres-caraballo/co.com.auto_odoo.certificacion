package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioNeto;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales.CapturarPrestacionVacaciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularPrestacionVacaciones implements Task {

    public static CalcularPrestacionVacaciones deNomina(){
        return instrumented(CalcularPrestacionVacaciones.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarPrestacionVacaciones.deNomina().answeredBy(actor);
    }
}
