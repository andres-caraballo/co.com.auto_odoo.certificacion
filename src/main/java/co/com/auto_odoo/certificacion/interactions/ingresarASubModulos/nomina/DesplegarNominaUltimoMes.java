package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.auto_odoo.certificacion.userInterface.PaginaModuloSuperior.BTN_NOMINA_DEL_UTLIMO_MES;
import static co.com.auto_odoo.certificacion.userInterface.PaginaModuloSuperior.EMPLEADO;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.EMPLEADO_A_BUSCAR_SIN_NOVEDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DesplegarNominaUltimoMes implements Task {


    public static DesplegarNominaUltimoMes deOdoo(){
        return instrumented(DesplegarNominaUltimoMes.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EsperarElemento.esClickable(BTN_NOMINA_DEL_UTLIMO_MES),
                Click.on(BTN_NOMINA_DEL_UTLIMO_MES),
                EsperarElemento.esClickable(EMPLEADO.of(EMPLEADO_A_BUSCAR_SIN_NOVEDAD.toString())),
                Click.on(EMPLEADO.of(EMPLEADO_A_BUSCAR_SIN_NOVEDAD.toString())));
    }
}
