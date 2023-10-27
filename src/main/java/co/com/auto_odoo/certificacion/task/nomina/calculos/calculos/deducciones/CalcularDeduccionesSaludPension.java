package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.deducciones;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.deducciones.CapturarDeduccionesSaludPension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularDeduccionesSaludPension implements Task {

    public static CalcularDeduccionesSaludPension deNomina(){
        return instrumented(CalcularDeduccionesSaludPension.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarDeduccionesSaludPension.deNomina().answeredBy(actor);
    }
}
