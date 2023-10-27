package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.extraSalarial;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.extraSalarial.CapturarIngresosConstitutivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularIngresosConstitutivos implements Task {

    public static CalcularIngresosConstitutivos deNomina(){
        return instrumented(CalcularIngresosConstitutivos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarIngresosConstitutivos.deNomina().answeredBy(actor);
    }
}
