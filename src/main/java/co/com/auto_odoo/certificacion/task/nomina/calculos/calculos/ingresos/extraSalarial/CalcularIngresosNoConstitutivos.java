package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.extraSalarial;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.extraSalarial.CapturarIngresosNoConstitutivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularIngresosNoConstitutivos implements Task {

    public static CalcularIngresosNoConstitutivos deNomina(){
        return instrumented(CalcularIngresosNoConstitutivos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarIngresosNoConstitutivos.deNomina().answeredBy(actor);
    }
}
