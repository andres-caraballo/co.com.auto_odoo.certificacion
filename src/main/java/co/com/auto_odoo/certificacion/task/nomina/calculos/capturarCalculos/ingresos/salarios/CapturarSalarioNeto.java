package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.ingresos.salarios;

import co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.deducciones.CapturarDeduccionesSaludPension;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.SALARIO_NETO;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.RECORDAR_RETEFUENTE;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.RECORDAR_SALARIO_NETO;

public class CapturarSalarioNeto implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarSalarioNeto.class));

    public static CapturarSalarioNeto deNomina(){
        return new CapturarSalarioNeto();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double salarioNetoEnpantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_NETO).viewedBy(actor).asString()))/ 100;
        double valorDeduccionSaludPension = CapturarDeduccionesSaludPension.deNomina().answeredBy(actor);
        double valorSalarioBruto = CapturarCalculoSalarioBruto.deNomina().answeredBy(actor);
//        double valorReteFuente = actor.recall(RECORDAR_RETEFUENTE.toString());
        double reteFuente = actor.recall(RECORDAR_RETEFUENTE.toString());
        double salarioNeto = valorSalarioBruto - valorDeduccionSaludPension - reteFuente;
        actor.remember(RECORDAR_SALARIO_NETO.toString(), salarioNeto);
        boolean validacionSalariNeto = salarioNeto==salarioNetoEnpantalla;

        if (salarioNeto==salarioNetoEnpantalla){
            Ensure.that(salarioNeto).equals(salarioNetoEnpantalla);
        }

        return Double.valueOf(salarioNeto +" "+ salarioNetoEnpantalla);
//        return salarioNetoEnpantalla;
//        return salarioNeto  + salarioNetoEnpantalla;

    }
}
