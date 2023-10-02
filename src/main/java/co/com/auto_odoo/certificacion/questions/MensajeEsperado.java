package co.com.auto_odoo.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;


public class MensajeEsperado implements Question<Boolean> {

    Target elemento;

    public MensajeEsperado(Target elemento) {
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(elemento).viewedBy(actor).asBoolean();
    }

    public static MensajeEsperado enPantalla(Target elemento){
        return new MensajeEsperado(elemento);
    }
}