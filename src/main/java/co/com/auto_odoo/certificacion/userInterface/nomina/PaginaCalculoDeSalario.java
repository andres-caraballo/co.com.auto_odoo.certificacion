package co.com.auto_odoo.certificacion.userInterface.nomina;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCalculoDeSalario {

    public static final Target BTN_CALCULO_DE_SALARIO=Target.the("Boton Calculo de salario").located(By.xpath("//*[@name ='salary_computation' and contains(.,'Cálculo del salario')]"));
    public static final Target DIAS_TRABAJADOS_Y_ENTRADAS=Target.the("Asistencia").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'Asistencia')]//*[@name='amount']"));
    public static final Target SALARIO_BASICO_TOTAL=Target.the("salario básico").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'SALARIO BÁSICO')]//*[@name='total']"));
    public static final Target PARQUEADERO=Target.the("salario básico").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'Parqueadero')]//*[@name='total']"));
    public static final Target SUBSIDIO_DE_CONECTIVIDAD=Target.the("subsidio de conectividad").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'SUBSIDIO DE CONECTIVIDAD')]//*[@name='total']"));
    public static final Target COMISIONES=Target.the("salario básico").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'COMISIONES')]//*[@name='total']"));
//    public static final Target SALARIO_BASICO_TOTAL_1=Target.the("salario básico pantalla inicial").located(By.xpath("//*[@class='o_data_row' and contains(.,'Salario básico total')]//*[@name='amount']"));
    public static final Target AUXILIO_NO_PRESTACIONAL_ALIMENTACION=Target.the("auxilio no prestacional alimentacion").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'AUXILIO NO PRESTACIONAL ALIMENTACION')]//*[@name='total']"));
    public static final Target AUXILIO_NO_PRESTACIONAL_CONECTIVIDAD=Target.the("auxilio no prestacional conectividad").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'AUXILIO NO PRESTACIONAL CONECTIVIDAD')]//*[@name='total']"));
    public static final Target BRUTO=Target.the("gross").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'Bruto')]//*[@name='total']"));
    public static final Target FONI=Target.the("foni").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'FONI')]//*[@name='total']"));
    public static final Target INGRESOS_CONSTITUTIVOS=Target.the("ingresos constitutivos").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'INGRESOS CONSTITUTIVOS')]//*[@name='total']"));
    public static final Target INGRESOS_NO_CONSTITUTIVOS=Target.the("ingresos no constitutivos").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'INGRESOS NO CONSTITUTIVOS')]//*[@name='total']"));
    public static final Target APORTE_SALUD=Target.the("aporte salud").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'APORTE SALUD')]//*[@name='total']"));
    public static final Target APORTE_PENSION=Target.the("aporte pension").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'APORTE PENSION')]//*[@name='total']"));
    public static final Target SALARIO_NETO=Target.the("neto a pagar").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'Neto a Pagar')]//*[@name='total']"));
//    public static final Target SALARIO_NETO=Target.the("neto a pagar").located(By.xpath("//*[@class='o_data_row' and contains(.,'Salario neto')]//*[@name='total']"));
    public static final Target ARL=Target.the("arl").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'ARL')]//*[@name='total']"));
    public static final Target CAJA=Target.the("caja").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'CAJA')]//*[@name='total']"));
    public static final Target APORTE_FONDO_SOLIDARIDAD_Y_SUBSISTENCIA=Target.the("aporte fondo solidaridad y subsistencia").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'APORTE FONDO SOLIDARIDAD Y SUBSISTENCIA')]//*[@name='total']"));
    public static final Target PENSIÓN_EMPLEADOR=Target.the("pensión empleador").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PENSIÓN EMPLEADOR')]//*[@name='total']"));
    public static final Target RETENCIÓN_EN_LA_FUENTE=Target.the("retención en la fuente").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'RETENCIÓN EN LA FUENTE')]//*[@name='total']"));
    public static final Target PROVISION_DE_CESANTIAS=Target.the("provision de cesantias").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION DE CESANTIAS')]//*[@name='total']"));
    public static final Target PROVISION_INTERESES_CESANTIAS_INCREMENTAL=Target.the("provision intereses cesantias - incremental").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION INTERESES CESANTIAS - INCREMENTAL')]//*[@name='total']"));
    public static final Target PROVISION_DE_PRIMA=Target.the("provision de prima").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION DE PRIMA')]//*[@name='total']"));
    public static final Target PROVISION_DE_VACACIONES_MENSUAL_TOTAL=Target.the("provision de vacaciones mensual total").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION DE VACACIONES MENSUAL TOTAL')]//*[@name='total']"));
    public static final Target DIAS_TRABAJADOS=Target.the("dias trabajados mensual total").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'SALARIO BÁSICO')]//*[@name='quantity']"));
    public static final Target PORCENTAJE_PENSION_EMPLEADOR=Target.the("porcentaje pension empleador").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PENSIÓN EMPLEADOR')]//*[@name='rate']"));
    public static final Target ULTIMA_FILA_DE_LA_HOJA=Target.the("ultima hoja de la fila").located(By.xpath("(//*[contains(@class,'o_data_cell')])[1]"));

    public static final Target VACACIONES_HÁBILES=Target.the("Vacaciones Hábiles").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'VACACIONES HÁBILES')]//*[@name='total']"));
    public static final Target VACACIONES_FESTIVOS=Target.the("Vacaciones Festivos").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'VACACIONES FESTIVOS')]//*[@name='total']"));
    public static final Target PRIMA_LEGAL_SEMESTRE_2=Target.the("Prima Legal Semestre 2").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PRIMA LEGAL SEMESTRE 2')]//*[@name='total']"));
    public static final Target PRIMA_LEGAL_PROVISIONES_SEMESTRE_2=Target.the("Prima Legal Provisiones Semestre 2").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PRIMA LEGAL PROVISIONES SEMESTRE 2')]//*[@name='total']"));
    public static final Target BONO_PRIMA_EXTRALEGAL=Target.the("Bono Prima Extralegal").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'BONO PRIMA EXTRALEGAL')]//*[@name='total']"));
    public static final Target PRIMA_EXTRALEGAL=Target.the("Prima Extralegal").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PRIMA EXTRALEGAL')]//*[@name='total']"));
    public static final Target CESANTIAS_DEFINITIVAS_ANUAL=Target.the("Cesantias Definitivas Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'CESANTIAS DEFINITIVAS  ANUAL')]//*[@name='total']"));
    public static final Target CESANTIAS_PROVISONES_ANUAL=Target.the("Cesantias Provisones Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'CESANTIAS PROVISONES  ANUAL')]//*[@name='total']"));
    public static final Target INTERESES_SOBRE_CESANTIAS_ANUAL=Target.the("Intereses Sobre Cesantias Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'INTERESES SOBRE CESANTIAS  ANUAL')]//*[@name='total']"));
    public static final Target INTERESES_CESANTIAS_PROVISONES_ANUAL=Target.the("Intereses Cesantias Provisones Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'INTERESES CESANTIAS PROVISONES  ANUAL')]//*[@name='total']"));
    public static final Target AJUSTE_DE_INTERESES_DE_CESANTÍAS=Target.the("Ajuste De Intereses De Cesantías").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'AJUSTE DE INTERESES DE CESANTÍAS')]//*[@name='total']"));
    public static final Target AJUSTE_DE_CIERRE_SALARIAL=Target.the("Ajuste De Cierre Salarial").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'AJUSTE DE CIERRE SALARIAL')]//*[@name='total']"));
    public static final Target PROVISION_DE_VACACIONES_ANUAL=Target.the("Provision De Vacaciones Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION DE VACACIONES ANUAL')]//*[@name='total']"));
    public static final Target AJUSTE_FINAL=Target.the("Ajuste Final").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'AJUSTE FINAL')]//*[@name='total']"));
    public static final Target PROVISION_DE_SV_DEFINITIVA_ANUAL=Target.the("Provision De Sv Definitiva Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION DE SV DEFINITIVA ANUAL')]//*[@name='total']"));
    public static final Target PROVISION_DE_VACACIONES_DEFINITIVA_ANUAL=Target.the("Provision De Vacaciones Definitiva Anual").located(By.xpath("//*[contains(@class,'o_data_row') and contains(.,'PROVISION DE VACACIONES DEFINITIVA ANUAL')]//*[@name='total']"));


}
