package co.com.auto_odoo.certificacion.userInterface.llistaDeAplicaciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeAplicaciones {

    public static final Target SELECCIONAR_CARD_DE_MODULO =Target.the("card de nomina").locatedBy("//*[contains(@id,'result_app') and contains(.,'{0}')]");


}