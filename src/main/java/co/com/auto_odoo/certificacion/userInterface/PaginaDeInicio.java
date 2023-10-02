package co.com.auto_odoo.certificacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDeInicio {

    public static final Target BTN_IDENTIFICARSE =Target.the("btn identificarse").located(By.xpath("(//*[contains(.,'Identificarse')])[last()]"));
    public static final Target INPUT_USUARIO =Target.the("input usuario").located(By.xpath("//*[@id='login']"));
    public static final Target INPUT_CLAVE =Target.the("input clave").located(By.xpath("//*[@id='password']"));
    public static final Target BTN_LOGIN =Target.the("btn login").located(By.xpath("(//*[contains(.,'Iniciar Sesión')])[last()]"));
    public static final Target VALIDACION_PANTALLA_BIENVENIDA =Target.the("validacion de login ").located(By.xpath("//*[@class='MessagingMenuContainer']"));
    public static final Target VALIDACION_MODULO_CONTABILIDAD =Target.the("validacion login modulo de contabilidad").located(By.xpath("(//*[contains(.,'Contabilidad')])[last()]"));
    public static final Target VALIDACION_LOGIN_FALLIDO =Target.the("btn login").locatedBy("//*[@class='alert alert-danger' and contains(.,'{0}')]");
    public static final Target MENU_DE_USUARIO =Target.the("btn menu de usuario esquina superior derecha").locatedBy("//*[@class='oe_topbar_name d-none d-lg-block ms-1']");
    public static final Target BTN_CERRAR_SESION =Target.the("btn cerrar sesion").locatedBy("(//*[contains(.,'Cerrar sesión')])[last()]");
}