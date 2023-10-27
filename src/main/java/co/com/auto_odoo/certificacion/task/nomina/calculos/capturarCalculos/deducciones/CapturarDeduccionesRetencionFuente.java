package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.deducciones;

import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;
import static co.com.auto_odoo.certificacion.utils.enums.DatosDeEmpleados.*;

public class CapturarDeduccionesRetencionFuente implements Question<Double> {

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CapturarDeduccionesRetencionFuente.class));

    public static CapturarDeduccionesRetencionFuente deNomina(){
        return new CapturarDeduccionesRetencionFuente();
    }
    @Override
    public Double answeredBy(Actor actor) {
        double valorReteFuenteEnPantalla = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(RETENCIÓN_EN_LA_FUENTE).viewedBy(actor).asString()))/ 100;
        double valorUnitarioUvt = 42412;
//        double salarioNeto = CapturarSalarioNeto.deNomina().answeredBy(actor);
        double salarioNeto = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(SALARIO_NETO).viewedBy(actor).asString()))/ 100;
        actor.remember(RECORDAR_SALARIO_NETO.toString(),salarioNeto);
        int valorUvt = (int) (salarioNeto/valorUnitarioUvt);
        actor.remember(RECORDAR__VALOR_UVT.toString(),valorUvt);

        if (valorUvt >= 2300) {
            categoriaMarginalSiete(actor);
        }

        if (valorUvt >= 945) {
            if (valorUvt <=2300) {
                categoriaMarginalSeis(actor);
            }
        }

        if (valorUvt >= 640) {
            if (valorUvt <=945) {
                categoriaMarginalCinco(actor);
            }
        }

        if (valorUvt >= 360) {
            if (valorUvt <=640) {
                categoriaMarginalCuatro(actor);
            }
        }

        if (valorUvt >= 150) {
            if (valorUvt <=360) {
                categoriaMarginalTres(actor);
            }
        }

        if (valorUvt >= 95) {
            if (valorUvt <=150) {
                categoriaMarginalDos(actor);
            }
        }

        if (valorUvt >= 0) {
        if (valorUvt <=95) {
            categoriaMarginalUno(actor);
        }
        }


        boolean resultado = valorUvt<=95;
        return Double.valueOf(valorUvt);
    }
    private void categoriaMarginalUno(Actor actor) {

    }

    private double categoriaMarginalDos(Actor actor) {
        int valorUvtRecall = actor.recall(RECORDAR__VALOR_UVT.toString());
        double salarioNeto = actor.recall(RECORDAR_SALARIO_NETO.toString());
        double valorUnitarioUvt = 42412;
        double uvtCalculado = (valorUvtRecall-95)*0.19;
        double uvtTotalDeduccion = valorUnitarioUvt*uvtCalculado;
        actor.remember(RECORDAR_RETEFUENTE.toString(),uvtTotalDeduccion);
        return uvtTotalDeduccion;
    }

    private void categoriaMarginalTres(Actor actor) {

    }

    private void categoriaMarginalCuatro(Actor actor) {

    }

    private void categoriaMarginalCinco(Actor actor) {

    }
    private void categoriaMarginalSeis(Actor actor) {

    }
    private void categoriaMarginalSiete(Actor actor) {

    }

}
