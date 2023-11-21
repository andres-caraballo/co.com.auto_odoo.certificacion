package co.com.auto_odoo.certificacion.questions.nomina;

import co.com.auto_odoo.certificacion.models.nomina.CreateDatosNomina;
import co.com.auto_odoo.certificacion.models.nomina.DatosNominaBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.*;
import static co.com.auto_odoo.certificacion.userInterface.nomina.PaginaCalculoDeSalario.BRUTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidacionSinNovedades implements Question {

    public final CreateDatosNomina crearDatosPersonales;

    public ValidacionSinNovedades(CreateDatosNomina crearDatosPersonales) {
        this.crearDatosPersonales = crearDatosPersonales;
    }

    public static ValidacionSinNovedades deNomina(DatosNominaBuilder createDatosPersonales){
        return new ValidacionSinNovedades(createDatosPersonales.build());
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Scroll.to(BTN_CALCULO_DE_SALARIO));
       
        String salarioBasicoTotalEnPantalla = Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString();
        String auxilioNoPrestacionalAlimentacionEnPantalla = Text.of(AUXILIO_NO_PRESTACIONAL_ALIMENTACION).viewedBy(actor).asString();
        String auxilioNoPrestacionalConectividadEnPantalla = Text.of(AUXILIO_NO_PRESTACIONAL_CONECTIVIDAD).viewedBy(actor).asString();
        String salarioBrutoEnPantalla = Text.of(BRUTO).viewedBy(actor).asString();
        String ingresoNoConstitutivoEnPantalla = Text.of(INGRESOS_NO_CONSTITUTIVOS).viewedBy(actor).asString();
        String ingresoConstitutivoEnPantalla = Text.of(INGRESOS_CONSTITUTIVOS).viewedBy(actor).asString();
        String deduccionSaludEnPantalla = Text.of(APORTE_SALUD).viewedBy(actor).asString().replace("-","");
        String deduccionPensionEnPantalla = Text.of(APORTE_PENSION).viewedBy(actor).asString().replace("-","");
        String salarioNetoEnpantalla = Text.of(SALARIO_NETO).viewedBy(actor).asString();
        String valorArlEnPantalla = Text.of(ARL).viewedBy(actor).asString();
        String valorCajaCompensacionEnPantalla = Text.of(CAJA).viewedBy(actor).asString();
        String valorPensionSolidaridad = Text.of(CAJA).viewedBy(actor).asString();
        String valorPensionEmpleadorEnPantalla = Text.of(PENSIÓN_EMPLEADOR).viewedBy(actor).asString();
        String valorReteFuenteEnPantalla = Text.of(RETENCIÓN_EN_LA_FUENTE).viewedBy(actor).asString().replace("-","");
        String valorCesantiasEnPantalla = Text.of(PROVISION_DE_CESANTIAS).viewedBy(actor).asString();
        String valorIntCesantiasEnPantalla = Text.of(PROVISION_INTERESES_CESANTIAS_INCREMENTAL).viewedBy(actor).asString();
        String valorPrimaEnPantalla = Text.of(PROVISION_DE_PRIMA).viewedBy(actor).asString();
        String valorVacacionesEnPantalla = Text.of(PROVISION_DE_VACACIONES_MENSUAL_TOTAL).viewedBy(actor).asString();

        String salarioBasicoTotal = crearDatosPersonales.getSalarioBasico();
        String auxilioNoPrestacionalAlimentacion = crearDatosPersonales.getAlimentacion();
        String auxilioNoPrestacionalConectividad = crearDatosPersonales.getConectividad();
        String salarioBruto = crearDatosPersonales.getSalarioBruto();
        String ingresoNoConstitutivo = crearDatosPersonales.getIngNoConstitutivos();
        String ingresoConstitutivo = crearDatosPersonales.getIngConstitutivos();
        String deduccionSalud = crearDatosPersonales.getSalud();
        String deduccionPension = crearDatosPersonales.getPension();
        String salarioNeto = crearDatosPersonales.getNetoPagar();
        String valorArl = crearDatosPersonales.getArl();
        String valorCajaCompensacion = crearDatosPersonales.getCaja();
        String valorPensionEmpleador = crearDatosPersonales.getPensionSol();
        String valorReteFuente = crearDatosPersonales.getReteFuente();
        String valorCesantias = crearDatosPersonales.getCesantias();
        String valorIntCesantias = crearDatosPersonales.getIntCesantias();
        String valorPrima = crearDatosPersonales.getPrima();
        String valorVacaciones = crearDatosPersonales.getVacaciones();

        actor.attemptsTo(
                Task.where("Valida Resultado de Salario Basico",
        Ensure.that(salarioBasicoTotalEnPantalla).isEqualTo(salarioBasicoTotal)),
                Task.where("Valida Resultado de Auxilio No Prestacional de Alimentacion",
        Ensure.that(auxilioNoPrestacionalAlimentacionEnPantalla).isEqualTo(auxilioNoPrestacionalAlimentacion)),
                Task.where("Valida Resultado de Auxilio No Prestacional de Conectividad",
        Ensure.that(auxilioNoPrestacionalConectividadEnPantalla).isEqualTo(auxilioNoPrestacionalConectividad)),
                Task.where("Valida Resultado de Salario Bruto",
        Ensure.that(salarioBrutoEnPantalla).isEqualTo(salarioBruto)),
                Task.where("Valida Resultado de Ingresos Constitutivos",
        Ensure.that(ingresoConstitutivoEnPantalla).isEqualTo(ingresoConstitutivo)),
                Task.where("Valida Resultado de Ingresos No Constitutivos",
        Ensure.that(ingresoNoConstitutivoEnPantalla).isEqualTo(ingresoNoConstitutivo)),
                Task.where("Valida Resultado de Pension Solidaria",
        Ensure.that(valorPensionEmpleadorEnPantalla).isEqualTo(valorPensionEmpleador)),
                Task.where("Valida Resultado de Salud",
        Ensure.that(deduccionSaludEnPantalla).isEqualTo(deduccionSalud)),
                Task.where("Valida Resultado de Pension",
        Ensure.that(deduccionPensionEnPantalla).isEqualTo(deduccionPension)),
                Task.where("Valida Resultado de Salario Neto",
        Ensure.that(salarioNetoEnpantalla).isEqualTo(salarioNeto)),
                Task.where("Valida Resultado de Arl",
        Ensure.that(valorArlEnPantalla).isEqualTo(valorArl)),
                Task.where("Valida Resultado de Caja de Compensacion",
        Ensure.that(valorCajaCompensacionEnPantalla).isEqualTo(valorCajaCompensacion)),
                Task.where("Valida Resultado de Retencion en la fuente",
        Ensure.that(valorReteFuenteEnPantalla).isEqualTo(valorReteFuente)),
                Task.where("Valida Resultado de Cesantias",
        Ensure.that(valorCesantiasEnPantalla).isEqualTo(valorCesantias)),
                Task.where("Valida Resultado de Intereses a las Cesantias",
        Ensure.that(valorIntCesantiasEnPantalla).isEqualTo(valorIntCesantias)),
                Task.where("Valida Resultado de Prima",
        Ensure.that(valorPrimaEnPantalla).isEqualTo(valorPrima)),
                Task.where("Valida Resultado de Vacaciones",
        Ensure.that(valorVacacionesEnPantalla).isEqualTo(valorVacaciones)));

        return true;
    }


}
