package co.com.auto_odoo.certificacion.interactions.valores.transversal;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerValor implements Question<String> {

    private final Target elemento;

    private ObtenerValor(Target elemento) {
        this.elemento = elemento;
    }

    public static ObtenerValor deElemento(Target elemento) {
        return new ObtenerValor(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {
        return elemento.resolveFor(actor).getValue();
    }
}
