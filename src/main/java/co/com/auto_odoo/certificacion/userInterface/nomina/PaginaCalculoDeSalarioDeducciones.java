package co.com.auto_odoo.certificacion.userInterface.nomina;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCalculoDeSalarioDeducciones {
    public static final Target PORCENTAJE_DEDDUCION_SALUD=Target.the("porcentaje de deduccion salud").located(By.xpath("//*[@class='o_data_row' and contains(.,'APORTE SALUD')]//*[@name='rate']"));
    public static final Target PORCENTAJE_DEDDUCION_PENSION=Target.the("porcentaje de deduccion pension").located(By.xpath("//*[@class='o_data_row' and contains(.,'APORTE PENSION')]//*[@name='rate']"));
}
