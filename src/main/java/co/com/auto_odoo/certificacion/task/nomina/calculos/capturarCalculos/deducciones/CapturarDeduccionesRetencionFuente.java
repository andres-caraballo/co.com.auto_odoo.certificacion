package co.com.auto_odoo.certificacion.task.nomina.calculos.capturarCalculos.deducciones;

import co.com.auto_odoo.certificacion.interactions.esperas.EsperarElemento;
import co.com.auto_odoo.certificacion.utils.utileriaString.UtileriaString;
import cucumber.api.java.it.Ma;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import java.util.logging.Logger;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.*;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalarioDeducciones.DIA_INICIAL_CONTRACTUAL;
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

        int valorUvt = (int) (salarioNeto/valorUnitarioUvt);
        actor.remember(RECORDAR__VALOR_UVT.toString(),valorUvt);
        String nombreEmpleado = actor.recall(RECORDAR_NOMBRE_EMPLEADO.toString());
        actor.attemptsTo(Click.on(NOMBRE_EMPLEADO_IR_DETALLES_DE_EMPLEADO.of(nombreEmpleado)),EsperarElemento.esClickable(DIA_INICIAL_CONTRACTUAL));
        actor.attemptsTo(Click.on(BOTON_DOCUMENTOS),EsperarElemento.esVisible(VALOR_PERSONAS_DEPENDIENTES));


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
        double valorUnitarioUvt = 42412;
        double valorTopeMensualUvt = 112;
        double descuentoRentaDeExenta = 0.25;
        double topeMaximoRentaExenta = 9120960;
        double topeMaximoDescuentoRentaExenta = 2792000;

        int valorUvtRecall = actor.recall(RECORDAR__VALOR_UVT.toString());
        double deduccionSaludPension = actor.recall(RECORDAR__VALOR_DEDUCCIONES_SALUD_PENSION.toString());
        double salarioBruto = actor.recall(RECORDAR_SALARIO_BRUTO.toString());
        double valorDepedientes = Double.parseDouble(UtileriaString.formatearNumeros(Text.of(VALOR_PERSONAS_DEPENDIENTES).viewedBy(actor).asString())) / 100;
        double salarioNetoSubtotal = salarioBruto - valorDepedientes - deduccionSaludPension;
        double rentaDeTrabajoExenta = salarioNetoSubtotal * descuentoRentaDeExenta;

        double cifraControl40 = Math.round((salarioBruto - deduccionSaludPension) * 0.40);
        double sumaDeducciones = (valorDepedientes + rentaDeTrabajoExenta);
        double salarioBaseParaReteFuente = salarioNetoSubtotal - rentaDeTrabajoExenta;

        double valores[] = {cifraControl40, sumaDeducciones};
        double mayor = 0;
        double menor = cifraControl40;
        for (int i=0; i < valores.length; i++){
            if (valores[i] > mayor){
                mayor = valores[i];
            }
            if (valores[i] < menor){
                menor = valores[i];
            }
        }
        System.out.println("el numero menor es: " + menor);
        double topeUvtMensual = valorUnitarioUvt * valorTopeMensualUvt;

//        double sumaDeducciones = (valorDepedientes + rentaDeTrabajoExenta);

        if (menor <= topeUvtMensual) {
            if (rentaDeTrabajoExenta <= topeMaximoDescuentoRentaExenta) {
                double valorUvt = (double) (salarioBaseParaReteFuente/valorUnitarioUvt);
//            double salarioBaseParaReteFuente = salarioNetoSubtotal - rentaDeTrabajoExenta;
                double uvtCalculado = (valorUvt - 95) * 0.19;
                int uvtTotalDeduccion = ((int)(valorUnitarioUvt * uvtCalculado)/1000);
//                int uvtTotalDeduccion = ((int)(valorUnitarioUvt * uvtCalculado));
                double reteFuente1= uvtTotalDeduccion;
                double reteFuente= Math.round(uvtTotalDeduccion)*1000;

                actor.remember(RECORDAR_RETEFUENTE.toString(), reteFuente);
            }else {

            }
        }
        double reteFuente = actor.recall(RECORDAR_RETEFUENTE.toString());
        return reteFuente;
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
