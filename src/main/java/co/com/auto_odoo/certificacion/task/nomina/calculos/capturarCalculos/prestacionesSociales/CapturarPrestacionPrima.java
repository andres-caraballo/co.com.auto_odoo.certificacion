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

public class CapturarPrestacionPrima implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarPrestacionPrima.class));

    public static CapturarPrestacionPrima deNomina(){
        return new CapturarPrestacionPrima();
    }
    @Override
    public Double answeredBy(Actor actor) {
        //Prima = salario mensual X días trabajados / 360 (días)
        double primaEnPantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(PROVISION_DE_PRIMA).viewedBy(actor).asString()))/ 100;
        double diasTrabajadosEnPantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(DIAS_TRABAJADOS).viewedBy(actor).asString()))/ 100;
        double salarioBasico = CapturarSalarioBasico.deNomina().answeredBy(actor);
        double valorDePrimaMensual = (salarioBasico * diasTrabajadosEnPantalla)/360;
        Ensure.that(valorDePrimaMensual).equals(primaEnPantalla);
        return valorDePrimaMensual;
    }

}
