package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;

public class CapturarPrestacionInteresCesantias implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarPrestacionInteresCesantias.class));

    public static CapturarPrestacionInteresCesantias deNomina(){
        return new CapturarPrestacionInteresCesantias();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double valorEnpantallaInteresCesantias = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PROVISION_INTERESES_CESANTIAS_INCREMENTAL).viewedBy(actor).asString()))/ 100;
        //Cesantías x Días trabajados x 0,12 ÷ 360
        // se desconocen los dias trabajados desde el inicio a la fecha actual
//        Ensure.that(ingresoNoConstitutivo).equals(resultadoIngresoNoConstitutivo);
        return valorEnpantallaInteresCesantias;
    }

}
