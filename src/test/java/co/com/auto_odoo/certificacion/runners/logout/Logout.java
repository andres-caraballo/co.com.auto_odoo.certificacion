package co.com.auto_odoo.certificacion.runners.logout;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/autenticacion/logout.feature",
        glue = "co/com/auto_odoo/certificacion/stepDefinitions"
)
public class Logout {

}
