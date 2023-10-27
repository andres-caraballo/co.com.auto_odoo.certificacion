package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.extraSalarial;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;

public class CapturarIngresosConstitutivos implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarIngresosConstitutivos.class));

    public static CapturarIngresosConstitutivos deNomina(){
        return new CapturarIngresosConstitutivos();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double ingresoConstitutivo = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(INGRESOS_CONSTITUTIVOS).viewedBy(actor).asString()))/ 100;
        double salarioBase = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString()))/ 100;
        if (ingresoConstitutivo==salarioBase){
            Ensure.that(ingresoConstitutivo).equals(salarioBase);
        }
        return ingresoConstitutivo;
    }

}
