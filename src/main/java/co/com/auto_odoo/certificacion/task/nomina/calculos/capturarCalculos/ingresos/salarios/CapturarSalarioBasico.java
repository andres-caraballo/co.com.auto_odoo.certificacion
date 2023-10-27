package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.SALARIO_BASICO_TOTAL;

public class CapturarSalarioBasico implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarSalarioBasico.class));

    public static CapturarSalarioBasico deNomina(){
        return new CapturarSalarioBasico();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double salarioBase = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString()))/ 100;
        return salarioBase;
    }
}
