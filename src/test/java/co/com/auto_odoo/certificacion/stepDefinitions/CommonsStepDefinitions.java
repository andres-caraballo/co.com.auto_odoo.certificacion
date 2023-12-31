package co.com.auto_odoo.certificacion.stepDefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonsStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Managed
    WebDriver myDriver;


    @Before
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Andres").can(BrowseTheWeb.with(myDriver));
    }

}
