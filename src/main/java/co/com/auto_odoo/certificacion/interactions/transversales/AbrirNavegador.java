package co.com.auto_odoo.certificacion.interactions.transversales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.auto_odoo.certificacion.utils.enums.Urls.URL_BASE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AbrirNavegador implements Interaction {

    public static AbrirNavegador enPagina(){
        return instrumented(AbrirNavegador.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.setProperty("webdriver.chrome.driver", "/Users/AndresCaraballo/Documents/Drivers/119.0.6045.105/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        actor.attemptsTo(Open.url(String.valueOf(URL_BASE)));
    }
}
