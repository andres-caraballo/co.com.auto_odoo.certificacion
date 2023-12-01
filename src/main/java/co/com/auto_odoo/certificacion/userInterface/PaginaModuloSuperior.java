package co.com.auto_odoo.certificacion.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaModuloSuperior {

    public static final Target BTN_RECIBOS_DE_NOMINA =Target.the("card de nomina").located(By.xpath("//*[@title='Recibos de nómina']"));
    public static final Target BTN_TODOS_LOS_RECIBOS_DE_NOMINA =Target.the("card de nomina").located(By.xpath("(//*[contains(.,'Todos los recibos de nómina')])[last()]"));
    public static final Target BTN_NOMINA_DEL_UTLIMO_MES_GENERAL =Target.the("card de nomina").located(By.xpath("(//*[@class='d-flex' and contains(.,'NOMINA')])[1]"));
    public static final Target BTN_NOMINA_DEL_UTLIMO_MES =Target.the("card de nomina").located(By.xpath("(//*[@class='d-flex'])[6]"));
    public static final Target TXT_BUSCAR_EMPLEADO =Target.the("cuadro de busqueda").located(By.xpath("//*[@class='o_searchview_input']"));
    public static final Target EMPLEADO =Target.the("cuadro de busqueda").locatedBy("//*[@class='d-flex' and contains(.,'{0}')]");
}
