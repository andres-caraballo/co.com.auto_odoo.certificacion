package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioBasico;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;

public class CapturarPrestacionCesantias implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarPrestacionCesantias.class));

    public static CapturarPrestacionCesantias deNomina(){
        return new CapturarPrestacionCesantias();
    }
    @Override
    public Double answeredBy(Actor actor) {
        //Cesantías = salario mensual X días trabajados / 360 (días)
        double valorEnPantallaCesantias = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PROVISION_DE_CESANTIAS).viewedBy(actor).asString()))/ 100;
        double diasTrabajadosEnPantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(DIAS_TRABAJADOS).viewedBy(actor).asString()))/ 100;
        double salarioBasico = CapturarSalarioBasico.deNomina().answeredBy(actor);
        double cesantias = (salarioBasico * diasTrabajadosEnPantalla)/360;
        Ensure.that(valorEnPantallaCesantias).equals(cesantias);
        return cesantias;
    }

}
