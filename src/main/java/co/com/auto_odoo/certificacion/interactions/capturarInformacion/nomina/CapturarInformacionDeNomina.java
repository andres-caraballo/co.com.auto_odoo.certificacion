package co.com.auto_odoo.certificacion.interactions.capturarInformacion.nomina;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CapturarInformacionDeNomina {


    private CapturarInformacionDeNomina() {}

    public static Performable sinNovedades() {
        return instrumented(ValoresDePagoDeNominaSinNovedades.class);
    }


}