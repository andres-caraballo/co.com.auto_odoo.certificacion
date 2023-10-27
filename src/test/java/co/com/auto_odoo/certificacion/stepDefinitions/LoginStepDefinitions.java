package co.com.auto_odoo.certificacion.stepDefinitions;

import co.com.auto_odoo.certificacion.interactions.transversales.AbrirNavegador;

import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.BTN_IDENTIFICARSE;
import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.VALIDACION_LOGIN_FALLIDO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.auto_odoo.certificacion.questions.ElementoEsperado;
import co.com.auto_odoo.certificacion.questions.autenticacion.ValidacionLoginExitoso;
import co.com.auto_odoo.certificacion.task.autenticacion.IniciarSesion;
import co.com.auto_odoo.certificacion.task.autenticacion.CerrarSesion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Pero;

public class LoginStepDefinitions {

    @Dado("^que (.*) quiere abrir la pagina$")
    public void queKeissiantQuiereAbrirLaPagina(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(AbrirNavegador.enPagina());
    }

    @Cuando("^inicia sesion en el portal de odoo con usuario: (.*) y clave (.*)$")
    public void elSeRegistraDeManeraExitosa(String usuario, String clave) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enOdoo(usuario, clave)
        );

    }

    @Entonces("^el podra visualizar el mensaje de bienvenida$")
    public void podraVisualizarUnMensajeDeBienvenida() {
        theActorInTheSpotlight().should(seeThat(ValidacionLoginExitoso.enOdoo()));
    }

    @Entonces("^el podra visualizar un mensaje (.*)$")
    public void visualizarUnMensaje(String mensajeEsperado) {
        theActorInTheSpotlight().should(seeThat(ElementoEsperado.esVisible(VALIDACION_LOGIN_FALLIDO.of(mensajeEsperado))));
    }

    @Pero("^el cierra la sesion desde la sesion de usuario$")
    public void elCierrarLaSesionDesdeLaSesionDeUsuario() {
        theActorInTheSpotlight().attemptsTo(CerrarSesion.enOdoo());
    }

    @Entonces("^el podra visualizar la pantalla de inicio de sesion$")
    public void elPodraVisualizarLaPantallaDeInicioDeSesion() {
        theActorInTheSpotlight().should(seeThat(ElementoEsperado.esVisible(BTN_IDENTIFICARSE)));
    }
}
