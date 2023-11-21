package co.com.auto_odoo.certificacion.userInterface.nomina;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCalculoDeSalarioDeducciones {
    public static final Target PORCENTAJE_DEDDUCION_SALUD=Target.the("porcentaje de deduccion salud").located(By.xpath("//*[@class='o_data_row' and contains(.,'APORTE SALUD')]//*[@name='rate']"));
    public static final Target PORCENTAJE_DEDDUCION_PENSION=Target.the("porcentaje de deduccion pension").located(By.xpath("//*[@class='o_data_row' and contains(.,'APORTE PENSION')]//*[@name='rate']"));
    public static final Target NOMBRE_EMPLEADO_IR_DETALLES_DE_EMPLEADO=Target.the("dar click en el nombre del empleado").locatedBy("//*[@name='employee_id' and contains(.,'{0}')]");
    public static final Target DIA_INICIAL_CONTRACTUAL=Target.the("dia inicial de contrato").located(By.xpath("//*[@id='begin_date']"));
    public static final Target BOTON_DOCUMENTOS=Target.the("boton Documentos").located(By.xpath("//*[contains(@name,'documents_employee') and contains(.,'Documentos')]"));
    public static final Target VALOR_PERSONAS_DEPENDIENTES=Target.the("valor de dependientes").located(By.xpath("//*[contains(@class,'o_data_row')  and contains(.,'Pago Dependientes')]//*[@name='amount_contributibe']"));
    public static final Target REGRESAR_A_HOJA_DE_CALCULO=Target.the("regresar a hoja de calculo").located(By.xpath("//*[contains(@class,'o_back_button')]"));
}
