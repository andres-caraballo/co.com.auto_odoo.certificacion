package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import co.com.auto_odoo.certificacion.interactions.valores.transversal.ObtenerValor;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.time.LocalDate;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.PROVISION_INTERESES_CESANTIAS_INCREMENTAL;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.DIA_INICIAL_CONTRACTUAL;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.NOMBRE_EMPLEADO_IR_DETALLES_DE_EMPLEADO;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.RECORDAR_NOMBRE_EMPLEADO;
import static java.time.temporal.ChronoUnit.DAYS;

public class CalcularDiasTranscurridos implements Question<Integer> {

    public static CalcularDiasTranscurridos deIntereseCesantias(){
        return new CalcularDiasTranscurridos();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        String nombreEmpleado = actor.recall(RECORDAR_NOMBRE_EMPLEADO.toString());
        actor.attemptsTo(
                Click.on(NOMBRE_EMPLEADO_IR_DETALLES_DE_EMPLEADO.of(nombreEmpleado)),
                EsperarElemento.esClickable(DIA_INICIAL_CONTRACTUAL));

        String diaInicialSinFormato = ObtenerValor.deElemento(DIA_INICIAL_CONTRACTUAL).answeredBy(actor).toString();
        String[] arrayFechaInicial = diaInicialSinFormato.split("-");
        String diaInicialFormat = arrayFechaInicial[2] + "-" + arrayFechaInicial[1] + "-" + arrayFechaInicial[0];
//        String  requestDate = "2023-10-28";
        LocalDate myDate = LocalDate.parse(diaInicialFormat);
        LocalDate currentDate = LocalDate.now();
        long numberOFDays = DAYS.between(myDate, currentDate);
//        System.out.println(String.format("Diferencia de dias",numberOFDays));
        return (int) numberOFDays;
    }
}
