package co.com.auto_odoo.certificacion.questions.autenticacion;

import co.com.auto_odoo.certificacion.questions.ElementoEsperado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.VALIDACION_MODULO_CONTABILIDAD;
import static co.com.auto_odoo.certificacion.userInterface.PaginaDeInicio.VALIDACION_PANTALLA_BIENVENIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidacionLoginExitoso implements Question {

    public static ValidacionLoginExitoso enOdoo(){
        return new ValidacionLoginExitoso();
    }

    @Override
    public Object answeredBy(Actor actor) {
        if ( Visibility.of(VALIDACION_PANTALLA_BIENVENIDA).viewedBy(actor).asBoolean()) {
            actor.should(seeThat(ElementoEsperado.esVisible(VALIDACION_PANTALLA_BIENVENIDA)));
        }else if  (Visibility.of(VALIDACION_MODULO_CONTABILIDAD).viewedBy(actor).asBoolean()) {
            actor.should(seeThat(ElementoEsperado.esVisible(VALIDACION_MODULO_CONTABILIDAD)));
        }
        return true;
    }
}
