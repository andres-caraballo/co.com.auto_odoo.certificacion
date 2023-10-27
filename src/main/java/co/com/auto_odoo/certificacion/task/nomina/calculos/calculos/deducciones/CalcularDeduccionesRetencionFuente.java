package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.deducciones;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.deducciones.CapturarDeduccionesRetencionFuente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularDeduccionesRetencionFuente implements Task {

    public static CalcularDeduccionesRetencionFuente deNomina(){
        return instrumented(CalcularDeduccionesRetencionFuente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarDeduccionesRetencionFuente.deNomina().answeredBy(actor);

    }
}
