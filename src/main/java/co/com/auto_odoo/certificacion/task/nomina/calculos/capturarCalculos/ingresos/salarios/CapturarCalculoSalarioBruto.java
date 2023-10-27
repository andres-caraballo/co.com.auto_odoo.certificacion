package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.BRUTO;

public class CapturarCalculoSalarioBruto implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarCalculoSalarioBruto.class));

    public static CapturarCalculoSalarioBruto deNomina(){
        return new CapturarCalculoSalarioBruto();
    }

    @Override
    public Double answeredBy(Actor actor) {
        double salarioBase = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString()))/ 100;
        double auxilioNoPrestacionalAlimentacion = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(AUXILIO_NO_PRESTACIONAL_ALIMENTACION).viewedBy(actor).asString()))/ 100;
        double auxilioNoPrestacionalConectividad = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(AUXILIO_NO_PRESTACIONAL_CONECTIVIDAD).viewedBy(actor).asString()))/ 100;
        double salarioBruto = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(BRUTO).viewedBy(actor).asString()))/ 100;
        double resultado = salarioBase + auxilioNoPrestacionalAlimentacion +auxilioNoPrestacionalConectividad;
        if (salarioBruto==resultado){
            Ensure.that(salarioBruto).equals(resultado);
        }
        return resultado;
    }

}