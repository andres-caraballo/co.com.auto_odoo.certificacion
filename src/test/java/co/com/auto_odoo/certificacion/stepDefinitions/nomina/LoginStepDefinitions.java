package co.com.auto_odoo.certificacion.stepDefinitions.nomina;

import co.com.auto_odoo.certificacion.interactions.capturarInformacion.nomina.CapturarInformacionDeNomina;
import co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina.SeleccionarEmpleadoSinNovedades;
import co.com.auto_odoo.certificacion.interactions.transversales.AbrirNavegador;
import co.com.auto_odoo.certificacion.models.nomina.DatosNominaBuilder;
import co.com.auto_odoo.certificacion.questions.nomina.ValidacionBonificaciónSalarial;
import co.com.auto_odoo.certificacion.questions.nomina.ValidacionSinNovedades;
import co.com.auto_odoo.certificacion.task.autenticacion.IniciarSesion;
import co.com.auto_odoo.certificacion.task.transversal.IngresarAmodulo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.RECORDAR_NOMBRE_EMPLEADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Dado("que (.*) quiere ingresar con el usuario: (.*) y la clave: (.*)")
    @Cuando("(.*) ingresa con el usuario: (.*) y la clave: (.*)")
    public void inicioSesion(String nombreActor, String usuario, String clave) {
        theActorCalled(nombreActor).attemptsTo(AbrirNavegador.enPagina(),
                IniciarSesion.enOdoo(usuario, clave));
    }

    @Cuando("el ingresa al modulo de (.*) para calcular la nomina del empleado (.*)")
    public void ingresoNominaYCalculo(String opcionDelMenu, String nombreEmpleado) {
        theActorInTheSpotlight().remember(RECORDAR_NOMBRE_EMPLEADO.toString(),nombreEmpleado);
        theActorInTheSpotlight().attemptsTo(IngresarAmodulo.delMenu(opcionDelMenu));
        theActorInTheSpotlight().attemptsTo(SeleccionarEmpleadoSinNovedades.deLaLista());
        theActorInTheSpotlight().attemptsTo(CapturarInformacionDeNomina.sinNovedades());

    }

    @Entonces("^el podra visualizar que el resultado de los valores es correcto$")
    public void validacionDeValores(List<Map< String, String>> datos) {
    theActorInTheSpotlight().should(seeThat(ValidacionSinNovedades.deNomina(DatosNominaBuilder.con()
            .salarioBasico(datos)
            .alimentacion(datos)
            .conectividad(datos)
            .salarioBruto(datos)
            .ingConstitutivos(datos)
            .ingNoConstitutivos(datos)
            .aporteSolPensional(datos)
            .salud(datos)
            .pension(datos)
            .netoPagar(datos)
            .arl(datos)
            .caja(datos)
            .pensionEmpleador(datos)
            .reteFuente(datos)
            .cesantias(datos)
            .intCesantias(datos)
            .prima(datos)
            .vacaciones(datos))));
    }

    @Entonces("^el podra visualizar que el resultado de los valores es correcto segun salario con bonificación salarial$")
    public void validacionDeValoresConBonificacion(List<Map< String, String>> datos) {
        theActorInTheSpotlight().should(seeThat(ValidacionBonificaciónSalarial.deNomina(DatosNominaBuilder.con()
                .salarioBasico(datos)
                .alimentacion(datos)
                .parqueadero(datos)
                .conectividad(datos)
                .comisiones(datos)
                .salarioBruto(datos)
                .ingConstitutivos(datos)
                .ingNoConstitutivos(datos)
                .aporteSolPensional(datos)
                .salud(datos)
                .pension(datos)
                .netoPagar(datos)
                .arl(datos)
                .caja(datos)
                .pensionEmpleador(datos)
                .reteFuente(datos)
                .cesantias(datos)
                .intCesantias(datos)
                .prima(datos)
                .vacaciones(datos))));
    }
}
