package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioBasico;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;

public class CapturarPensionEmpleador implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarPensionEmpleador.class));

    public static CapturarPensionEmpleador deNomina(){
        return new CapturarPensionEmpleador();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double valorPensionEnPantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PENSIÓN_EMPLEADOR).viewedBy(actor).asString()))/ 100;
        double porcentajePensionEmpleador = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PORCENTAJE_PENSION_EMPLEADOR).viewedBy(actor).asString()))/ 10000;
        double salarioBasico = CapturarSalarioBasico.deNomina().answeredBy(actor);
        double pensionEmpleador = (salarioBasico * porcentajePensionEmpleador)/100;
        boolean validacionPensionEmpleador = pensionEmpleador==valorPensionEnPantalla;

        if (pensionEmpleador==valorPensionEnPantalla){
            Ensure.that(pensionEmpleador).equals(pensionEmpleador);
        }

        return Double.valueOf(String.valueOf(pensionEmpleador + valorPensionEnPantalla));
    }

}
