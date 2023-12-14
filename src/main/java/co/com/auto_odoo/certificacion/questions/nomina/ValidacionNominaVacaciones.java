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

public class ValidacionNominaVacaciones implements Question {

    public final CreateDatosNomina crearDatosPersonales;

    public ValidacionNominaVacaciones(CreateDatosNomina crearDatosPersonales) {
        this.crearDatosPersonales = crearDatosPersonales;
    }

    public static ValidacionNominaVacaciones deNomina(DatosNominaBuilder createDatosPersonales){
        return new ValidacionNominaVacaciones(createDatosPersonales.build());
    }

    @Override
    public Object answeredBy(Actor actor) {
        actor.attemptsTo(Scroll.to(BTN_CALCULO_DE_SALARIO));
        String salarioBasicoTotalEnPantalla = Text.of(SALARIO_BASICO_TOTAL).viewedBy(actor).asString();
        String auxilioNoPrestacionalAlimentacionEnPantalla = Text.of(AUXILIO_NO_PRESTACIONAL_ALIMENTACION).viewedBy(actor).asString();
        String auxilioNoPrestacionalConectividadEnPantalla = Text.of(AUXILIO_NO_PRESTACIONAL_CONECTIVIDAD).viewedBy(actor).asString();
        String vacacionesHabilesEnPantalla = Text.of(VACACIONES_HÁBILES).viewedBy(actor).asString();
        String vacacionesFestivosEnPantalla = Text.of(VACACIONES_FESTIVOS).viewedBy(actor).asString();
        String subsidioConectividadEnPantalla = Text.of(SUBSIDIO_DE_CONECTIVIDAD).viewedBy(actor).asString();
        String salarioBrutoEnPantalla = Text.of(BRUTO).viewedBy(actor).asString();
        String primaLegalSem2EnPantalla = Text.of(PRIMA_LEGAL_SEMESTRE_2).viewedBy(actor).asString();
        String primaLegalProvSem2EnPantalla = Text.of(PRIMA_LEGAL_PROVISIONES_SEMESTRE_2).viewedBy(actor).asString();
        String primaExtraLegalEnPantalla = Text.of(PRIMA_EXTRALEGAL).viewedBy(actor).asString();
        String bonoPrimaExtraLegalEnPantalla = Text.of(BONO_PRIMA_EXTRALEGAL).viewedBy(actor).asString();
        String ingresoConstitutivoEnPantalla = Text.of(INGRESOS_CONSTITUTIVOS).viewedBy(actor).asString();
        String ingresoNoConstitutivoEnPantalla = Text.of(INGRESOS_NO_CONSTITUTIVOS).viewedBy(actor).asString();
        String aporteFondoSolidaridadEnPantalla = Text.of(APORTE_FONDO_SOLIDARIDAD_Y_SUBSISTENCIA).viewedBy(actor).asString();
        String deduccionSaludEnPantalla = Text.of(APORTE_SALUD).viewedBy(actor).asString().replace("-","");
        String deduccionPensionEnPantalla = Text.of(APORTE_PENSION).viewedBy(actor).asString().replace("-","");
        String cesantiasDefAnualEnPantalla = Text.of(CESANTIAS_DEFINITIVAS_ANUAL).viewedBy(actor).asString().replace("-","");
        String cesantiasProvAnualEnPantalla = Text.of(CESANTIAS_PROVISONES_ANUAL).viewedBy(actor).asString().replace("-","");
        String intCesantiasAnualEnPantalla = Text.of(INTERESES_SOBRE_CESANTIAS_ANUAL).viewedBy(actor).asString().replace("-","");
        String intCesantiasProvAnualEnPantalla = Text.of(INTERESES_CESANTIAS_PROVISONES_ANUAL).viewedBy(actor).asString().replace("-","");
        String salarioNetoEnpantalla = Text.of(SALARIO_NETO).viewedBy(actor).asString();
        String valorArlEnPantalla = Text.of(ARL).viewedBy(actor).asString();
        String valorCajaCompensacionEnPantalla = Text.of(CAJA).viewedBy(actor).asString();
        String valorPensionEmpleadorEnPantalla = Text.of(PENSIÓN_EMPLEADOR).viewedBy(actor).asString();
        String ajusteIntCesantiasEnPantalla = Text.of(AJUSTE_DE_INTERESES_DE_CESANTÍAS).viewedBy(actor).asString().replace("-","");
        String ajusteCierreSalarialEnPantalla = Text.of(AJUSTE_DE_CIERRE_SALARIAL).viewedBy(actor).asString();
        String valorReteFuenteEnPantalla = Text.of(RETENCIÓN_EN_LA_FUENTE).viewedBy(actor).asString().replace("-","");
        String valorCesantiasEnPantalla = Text.of(PROVISION_DE_CESANTIAS).viewedBy(actor).asString();
        String valorIntCesantiasEnPantalla = Text.of(PROVISION_INTERESES_CESANTIAS_INCREMENTAL).viewedBy(actor).asString();
        String valorPrimaEnPantalla = Text.of(PROVISION_DE_PRIMA).viewedBy(actor).asString();
        String valorVacacionesEnPantalla = Text.of(PROVISION_DE_VACACIONES_MENSUAL_TOTAL).viewedBy(actor).asString();
        String provVacacionesAnualEnPantalla = Text.of(PROVISION_DE_VACACIONES_ANUAL).viewedBy(actor).asString();
        String ajusteFinalEnPantalla = Text.of(AJUSTE_FINAL).viewedBy(actor).asString();
        String provisionSvDefAnualEnPantalla = Text.of(PROVISION_DE_SV_DEFINITIVA_ANUAL).viewedBy(actor).asString();
        String provisionVacacionesDefAnualEnPantalla = Text.of(PROVISION_DE_VACACIONES_DEFINITIVA_ANUAL).viewedBy(actor).asString();

        String salarioBasicoTotal = crearDatosPersonales.getSalarioBasico();
        String auxilioNoPrestacionalAlimentacion = crearDatosPersonales.getAlimentacion();
        String auxilioNoPrestacionalConectividad = crearDatosPersonales.getConectividad();
        String vacacionesHabiles = crearDatosPersonales.getVacacionesHabiles();
        String vacacionesFestivos = crearDatosPersonales.getVacacionesFestivos();
        String subsidioConectividad = crearDatosPersonales.getSubConectividad();
        String salarioBruto = crearDatosPersonales.getSalarioBruto();
        String primaLegalSem2 = crearDatosPersonales.getPrimaLegalSem2();
        String primaLegalProvSem2 = crearDatosPersonales.getPrimaLegalProvSem2();
        String bonoPrimaExtraLegal = crearDatosPersonales.getBonoPrimaExtraLegal();
        String primaExtraLegal = crearDatosPersonales.getPrimaExtraLegal();
        String ingresoConstitutivo = crearDatosPersonales.getIngConstitutivos();
        String ingresoNoConstitutivo = crearDatosPersonales.getIngNoConstitutivos();
        String aporteFondoSolidaridad = crearDatosPersonales.getAporteSolPensional();
        String deduccionSalud = crearDatosPersonales.getSalud();
        String deduccionPension = crearDatosPersonales.getPension();
        String cesantiasDefAnual = crearDatosPersonales.getCesantiasDefAnual();
        String cesantiasProvAnual = crearDatosPersonales.getCesantiasProvAnual();
        String intCesantiasAnual = crearDatosPersonales.getIntCesantiasAnual();
        String intCesantiasProvAnual = crearDatosPersonales.getIntCesantiasProvAnual();
        String salarioNeto = crearDatosPersonales.getNetoPagar();
        String valorArl = crearDatosPersonales.getArl();
        String valorCajaCompensacion = crearDatosPersonales.getCaja();
        String valorPensionEmpleador = crearDatosPersonales.getPensionEmpleador();
        String ajusteIntCesantias = crearDatosPersonales.getAjusteIntCesantias();
        String ajusteCierreSalarial = crearDatosPersonales.getAjusteCierreSalarial();
        String valorReteFuente = crearDatosPersonales.getReteFuente();
        String valorCesantias = crearDatosPersonales.getCesantias();
        String valorIntCesantias = crearDatosPersonales.getIntCesantias();
        String valorPrima = crearDatosPersonales.getPrima();
        String valorVacaciones = crearDatosPersonales.getVacaciones();
        String valorVacacionesAnual = crearDatosPersonales.getVacacionesAnual();
        String ajusteFinal = crearDatosPersonales.getAjusteFinal();
        String provDeSvDefAnual = crearDatosPersonales.getSvDefANual();
        String provVacacionesDefAnual = crearDatosPersonales.getVacacionesDefAnual();

        actor.attemptsTo(
                Task.where("Valida Resultado de Salario Basico",
        Ensure.that(salarioBasicoTotalEnPantalla).isEqualTo(salarioBasicoTotal)),
                Task.where("Valida Resultado de Auxilio No Prestacional de Alimentacion",
        Ensure.that(auxilioNoPrestacionalAlimentacionEnPantalla).isEqualTo(auxilioNoPrestacionalAlimentacion)),

                Task.where("Valida Resultado de Auxilio No Prestacional de Conectividad",
        Ensure.that(auxilioNoPrestacionalConectividadEnPantalla).isEqualTo(auxilioNoPrestacionalConectividad)),

                Task.where("Valida Resultado de Vacaciones habiles",
        Ensure.that(vacacionesHabilesEnPantalla).isEqualTo(vacacionesHabiles)),

                Task.where("Valida Resultado de Vacaciones festivos",
        Ensure.that(vacacionesFestivosEnPantalla).isEqualTo(vacacionesFestivos)),

                Task.where("Valida Resultado de subsidio de conectividad",
        Ensure.that(subsidioConectividadEnPantalla).isEqualTo(subsidioConectividad)),

                Task.where("Valida Resultado de Prima legal segundo semestre",
        Ensure.that(primaLegalSem2EnPantalla).isEqualTo(primaLegalSem2)),

                Task.where("Valida Resultado de Provision Prima legal segundo semestre",
        Ensure.that(primaLegalProvSem2EnPantalla).isEqualTo(primaLegalProvSem2)),

                Task.where("Valida Resultado de Prima Extralegal",
        Ensure.that(primaExtraLegalEnPantalla).isEqualTo(primaExtraLegal)),

                Task.where("Valida Resultado de bono de Prima Extra legal",
        Ensure.that(bonoPrimaExtraLegalEnPantalla).isEqualTo(bonoPrimaExtraLegal)),

                Task.where("Valida Resultado de aporte fondo de solidaridad",
        Ensure.that(aporteFondoSolidaridadEnPantalla).isEqualTo(aporteFondoSolidaridad)),

                Task.where("Valida Resultado de cesantias definida anual",
        Ensure.that(cesantiasDefAnualEnPantalla).isEqualTo(cesantiasDefAnual)),

                Task.where("Valida Resultado de cesantias provisional anual",
        Ensure.that(cesantiasProvAnualEnPantalla).isEqualTo(cesantiasProvAnual)),

                Task.where("Valida Resultado de intereses a cesantias definida anual",
        Ensure.that(intCesantiasAnualEnPantalla).isEqualTo(intCesantiasAnual)),

                Task.where("Valida Resultado de intereses a cesantias provisional anual",
        Ensure.that(intCesantiasProvAnualEnPantalla).isEqualTo(intCesantiasProvAnual)),

                Task.where("Valida Resultado de ajuste interes a las cesantias",
        Ensure.that(ajusteIntCesantiasEnPantalla).isEqualTo(ajusteIntCesantias)),

                Task.where("Valida Resultado de ajuste cierre salarial",
        Ensure.that(ajusteCierreSalarialEnPantalla).isEqualTo(ajusteCierreSalarial)),

                Task.where("Valida Resultado de valor vacaciones anual",
        Ensure.that(provVacacionesAnualEnPantalla).isEqualTo(valorVacacionesAnual)),
                Task.where("Valida Resultado de valor ajuste final",
        Ensure.that(ajusteFinalEnPantalla).isEqualTo(ajusteFinal)),

                Task.where("Valida Resultado de valor provision de sv anual",
        Ensure.that(provisionSvDefAnualEnPantalla).isEqualTo(provDeSvDefAnual)),

                Task.where("Valida Resultado de valor provision de vacaciones definida anual",
        Ensure.that(provisionVacacionesDefAnualEnPantalla).isEqualTo(provVacacionesDefAnual)),

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
