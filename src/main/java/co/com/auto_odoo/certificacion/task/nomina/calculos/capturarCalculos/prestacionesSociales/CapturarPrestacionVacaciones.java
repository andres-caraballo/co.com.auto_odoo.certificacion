package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioBasico;
import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios.CapturarSalarioNeto;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;

public class CapturarPrestacionVacaciones implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarPrestacionVacaciones.class));

    public static CapturarPrestacionVacaciones deNomina(){
        return new CapturarPrestacionVacaciones();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double vacacionesEnPantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PROVISION_DE_VACACIONES_MENSUAL_TOTAL).viewedBy(actor).asString()))/ 100;
        double salarioBasico = CapturarSalarioBasico.deNomina().answeredBy(actor);
        double valorDeVacacionMensual = salarioBasico/24;
        Ensure.that(valorDeVacacionMensual).equals(vacacionesEnPantalla);
        return valorDeVacacionMensual;
    }

}
