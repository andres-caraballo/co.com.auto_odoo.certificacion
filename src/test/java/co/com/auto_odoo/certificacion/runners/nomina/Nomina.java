package co.com.auto_odoo.certificacion.runners.nomina;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/nomina/nomina.feature:17",
        glue = "co/com/auto_odoo/certificacion/stepDefinitions"
)
public class Nomina {

}
