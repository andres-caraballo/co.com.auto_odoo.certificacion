package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.deducciones;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.PORCENTAJE_DEDDUCION_PENSION;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.PORCENTAJE_DEDDUCION_SALUD;

public class CapturarDeduccionesSaludPension implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarDeduccionesSaludPension.class));

    public static CapturarDeduccionesSaludPension deNomina(){
        return new CapturarDeduccionesSaludPension();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double salarioBase = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString()))/ 100;
        double porcentajeDeduccionSalud = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PORCENTAJE_DEDDUCION_SALUD).viewedBy(actor).asString()))/ 10000;
        double porcentajeDeduccionPension = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PORCENTAJE_DEDDUCION_PENSION).viewedBy(actor).asString()))/ 10000;
        double deduccionSalud = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(APORTE_SALUD).viewedBy(actor).asString()))/ 100;
        double deduccionPension = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(APORTE_PENSION).viewedBy(actor).asString()))/ 100;
        double porcentajeDeSalud = (salarioBase * porcentajeDeduccionSalud)/100;
        double porcentajeDePension = (salarioBase * porcentajeDeduccionPension)/100;
        boolean validacionSalud = porcentajeDeSalud==deduccionSalud;
        boolean validacionPension = porcentajeDePension==deduccionPension;

        double totalDeduccionSaludPension = deduccionSalud + deduccionPension;
        return  totalDeduccionSaludPension;
    }

}
