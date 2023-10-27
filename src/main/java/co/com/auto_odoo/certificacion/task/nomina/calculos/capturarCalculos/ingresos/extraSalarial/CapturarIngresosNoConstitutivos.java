package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.extraSalarial;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;

public class CapturarIngresosNoConstitutivos implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarIngresosNoConstitutivos.class));

    public static CapturarIngresosNoConstitutivos deNomina(){
        return new CapturarIngresosNoConstitutivos();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double ingresoNoConstitutivo = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(INGRESOS_NO_CONSTITUTIVOS).viewedBy(actor).asString()))/ 100;
        double auxilioNoPrestacionalAlimentacion = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(AUXILIO_NO_PRESTACIONAL_ALIMENTACION).viewedBy(actor).asString()))/ 100;
        double auxilioNoPrestacionalConectividad = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(AUXILIO_NO_PRESTACIONAL_CONECTIVIDAD).viewedBy(actor).asString()))/ 100;
        double resultadoIngresoNoConstitutivo =  auxilioNoPrestacionalAlimentacion +auxilioNoPrestacionalConectividad;
        if (ingresoNoConstitutivo==resultadoIngresoNoConstitutivo){
            Ensure.that(ingresoNoConstitutivo).equals(resultadoIngresoNoConstitutivo);
        }

        return resultadoIngresoNoConstitutivo;
    }

}
