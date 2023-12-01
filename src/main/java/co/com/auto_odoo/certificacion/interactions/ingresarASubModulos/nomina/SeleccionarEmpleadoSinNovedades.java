package co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina;

import co.com.auto_odoo.certificacion.interactions.esperas.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static co.com.auto_odoo.certificacion.userInterface.PaginaModuloSuperior.TXT_BUSCAR_EMPLEADO;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.RECORDAR_NOMBRE_EMPLEADO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarEmpleadoSinNovedades implements Task {

    public static SeleccionarEmpleadoSinNovedades deLaLista(){
        return instrumented(SeleccionarEmpleadoSinNovedades.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        String empleado = actor.recall(RECORDAR_NOMBRE_EMPLEADO.toString());
        actor.attemptsTo(
                IngresarATodosLosRecibosDeNomina.deOdoo(),
                BuscarEmpleado.deNomina(empleado,TXT_BUSCAR_EMPLEADO),
                DesplegarNominaUltimoMes.deOdoo(),
                Esperar.unTiempo(10000));
    }
}
