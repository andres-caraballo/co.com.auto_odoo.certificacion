package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.salarios;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarCalculoSalarioBruto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CalcularSalarioBruto implements Task {

    public static CalcularSalarioBruto deNomina(){
        return instrumented(CalcularSalarioBruto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        CapturarCalculoSalarioBruto.deNomina().answeredBy(actor);
    }
}
