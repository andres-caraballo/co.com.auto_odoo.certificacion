package co.com.auto_odoo.certificacion.interactions.capturarInformacion.nomina;

import co.com.auto_odoo.certificacion.interactions.Regresar;
import co.com.auto_odoo.certificacion.task.nomina.IngresarACalculoDeSalario;

import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.deducciones.CalcularDeduccionesRetencionFuente;
import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.deducciones.CalcularDeduccionesSaludPension;
import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.extraSalarial.CalcularIngresosConstitutivos;
import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.extraSalarial.CalcularIngresosNoConstitutivos;
import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.salarios.CalcularSalarioBruto;
import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.ingresos.salarios.CalcularSalarioNeto;
import co.com.auto_odoo.certificacion.task.nomina.calculos.calculos.prestacionesSociales.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ValoresDePagoDeNominaSinNovedades implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresarACalculoDeSalario.deNomina(),
                CalcularSalarioBruto.deNomina(),
                CalcularIngresosNoConstitutivos.deNomina(),
                CalcularIngresosConstitutivos.deNomina(),
                CalcularDeduccionesSaludPension.deNomina(),
                CalcularDeduccionesRetencionFuente.deNomina(),
                Regresar.aHojaCalculo()
//                CalcularSalarioNeto.deNomina(),
//                CalcularPensionEmpleador.deNomina(),
//                CalcularPrestacionCesantias.deNomina(),
//                CalcularPrestacionInteresCesantias.deNomina(),
//                Regresar.aHojaCalculo(),
//                CalcularPrestacionPrima.deNomina(),
//                CalcularPrestacionVacaciones.deNomina()
        );
    }
}
