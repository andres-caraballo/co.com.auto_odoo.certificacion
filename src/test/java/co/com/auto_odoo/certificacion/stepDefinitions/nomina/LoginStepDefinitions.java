package co.com.auto_odoo.certificacion.stepDefinitions.nomina;

import co.com.auto_odoo.certificacion.interactions.capturarInformacion.nomina.CapturarInformacionDeNomina;
import co.com.auto_odoo.certificacion.interactions.ingresarASubModulos.nomina.SeleccionarEmpleadoSinNovedades;
import co.com.auto_odoo.certificacion.interactions.transversales.AbrirNavegador;
import co.com.auto_odoo.certificacion.task.autenticacion.IniciarSesion;
import co.com.auto_odoo.certificacion.task.transversal.IngresarAmodulo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Dado("que (.*) quiere ingresar con el usuario: (.*) y la clave: (.*)")
    @Cuando("(.*) ingresa con el usuario: (.*) y la clave: (.*)")
    public void inicioSesion(String nombreActor, String usuario, String clave) {
        theActorCalled(nombreActor).attemptsTo(AbrirNavegador.enPagina(),
                IniciarSesion.enOdoo(usuario, clave));
    }

    @Cuando("^el ingresa al modulo de (.*) para calcular la nomina de un empleado$")
    public void ingresoNominaYCalculo(String opcionDelMenu) {
        theActorInTheSpotlight().attemptsTo(IngresarAmodulo.delMenu(opcionDelMenu));
        theActorInTheSpotlight().attemptsTo(SeleccionarEmpleadoSinNovedades.deLaLista());
        theActorInTheSpotlight().attemptsTo(CapturarInformacionDeNomina.sinNovedades());

    }

    @Entonces("^el podra visualizar que el resultado de los valores es correcto$")
    public void validacionDeValores(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enOdoo(usuario, clave));
    }
}
