package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.auto_odoo.certificacion.userInterface.PaginaModuloSuperior.TXT_BUSCAR_EMPLEADO;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.EMPLEADO_A_BUSCAR_SIN_NOVEDAD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarEmpleadoSinNovedades implements Task {

    public static SeleccionarEmpleadoSinNovedades deLaLista(){
        return instrumented(SeleccionarEmpleadoSinNovedades.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarATodosLosRecibosDeNomina.deOdoo(),
                BuscarEmpleado.deNomina(EMPLEADO_A_BUSCAR_SIN_NOVEDAD.toString(),TXT_BUSCAR_EMPLEADO),
                DesplegarNominaUltimoMes.deOdoo(),
                Esperar.unTiempo(10000));
    }
}
