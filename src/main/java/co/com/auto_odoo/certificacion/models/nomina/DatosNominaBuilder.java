package co.com.auto_odoo.certificacion.models.nomina;

import java.util.List;
import java.util.Map;

public class DatosNominaBuilder {

    private String salarioBasico;
    private String alimentacion;
    private String conectividad;

    private String subConectividad;
    private String salarioBruto;
    private String parqueadero;
    private String comisiones;
    private String ingConstitutivos;
    private String ingNoConstitutivos;
    private String aporteSolPensional;
    private String salud;
    private String pension;
    private String netoPagar;
    private String arl;
    private String caja;
    private String pensionEmpleador;
    private String reteFuente;
    private String cesantias;
    private String intCesantias;
    private String prima;
    private String vacaciones;
    private String vacacionesAnual;
    private String ajusteFinal;
    private String svDefANual;
    private String vacacionesDefAnual;
    private String cesantiasDefAnual;
    private String cesantiasProvAnual;
    private String intCesantiasAnual;
    private String intCesantiasProvAnual;
    private String vacacionesHabiles;
    private String vacacionesFestivos;
    private String primaLegalSem2;
    private String primaLegalProvSem2;
    private String bonoPrimaExtraLegal;
    private String primaExtraLegal;
    private String ajusteIntCesantias;
    private String ajusteCierreSalarial;

    public DatosNominaBuilder() {
    }

    public String getSalarioBasico() {
        return salarioBasico;
    }
    public String getAlimentacion() {
        return alimentacion;
    }
    public String getConectividad() {return conectividad; }
    public String getSubConectividad() {return subConectividad; }
    public String getParqueadero() {return parqueadero; }
    public String getComisiones() {return comisiones; }
    public String getSalarioBruto() {return salarioBruto; }
    public String getIngConstitutivos() {return ingConstitutivos; }
    public String getIngNoConstitutivos() {return ingNoConstitutivos; }
    public String getAporteSolPensional() {
        return aporteSolPensional;
    }
    public String getSalud() {
        return salud;
    }
    public String getPension() {
        return pension;
    }
    public String getNetoPagar() {return netoPagar; }
    public String getArl() {
        return arl;
    }
    public String getCaja() {
        return caja;
    }
    public String getPensionEmpleador() {
        return pensionEmpleador;    }
    public String getReteFuente() {
        return reteFuente;
    }
    public String getCesantias() {
        return cesantias;
    }
    public String getIntCesantias() {
        return intCesantias;
    }
    public String getPrima() {
        return prima;
    }
    public String getVacaciones() {
        return vacaciones;
    }
    public String getVacacionesAnual() {
        return vacacionesAnual;
    }

    public String getAjusteFinal() {
        return ajusteFinal;
    }

    public String getSvDefANual() {
        return svDefANual;
    }
    public String getVacacionesDefAnual() {
        return vacacionesDefAnual;
    }

    public String getCesantiasDefAnual() {
        return cesantiasDefAnual;
    }

    public String getCesantiasProvAnual() {
        return cesantiasProvAnual;
    }

    public String getIntCesantiasAnual() {
        return intCesantiasAnual;
    }

    public String getIntCesantiasProvAnual() {
        return intCesantiasProvAnual;
    }

    public String getVacacionesHabiles() {
        return vacacionesHabiles;
    }

    public String getVacacionesFestivos() {
        return vacacionesFestivos;
    }

    public String getPrimaLegalSem2() {
        return primaLegalSem2;
    }

    public String getPrimaLegalProvSem2() {
        return primaLegalProvSem2;
    }

    public String getBonoPrimaExtraLegal() {
        return bonoPrimaExtraLegal;
    }

    public String getPrimaExtraLegal() {
        return primaExtraLegal;
    }

    public String getAjusteIntCesantias() {
        return ajusteIntCesantias;
    }

    public String getAjusteCierreSalarial() {
        return ajusteCierreSalarial;
    }


    public static DatosNominaBuilder con() {
        return new DatosNominaBuilder();
    }

    public DatosNominaBuilder salarioBasico (List<Map<String, String>> datos) {
        this.salarioBasico = datos.get(0).get("salarioBasico");
        return this; }

    public DatosNominaBuilder alimentacion (List<Map<String, String>> datos) {
        this.alimentacion = datos.get(0).get("alimentacion");
        return this;}

    public DatosNominaBuilder conectividad (List<Map<String, String>> datos) {
        this.conectividad = datos.get(0).get("conectividad");
        return this; }

    public DatosNominaBuilder subConectividad (List<Map<String, String>> datos) {
        this.subConectividad = datos.get(0).get("subConectividad");
        return this; }

    public DatosNominaBuilder parqueadero (List<Map<String, String>> datos) {
        this.parqueadero = datos.get(0).get("parqueadero");
        return this; }

    public DatosNominaBuilder comisiones (List<Map<String, String>> datos) {
        this.comisiones = datos.get(0).get("comisiones");
        return this; }


    public DatosNominaBuilder salarioBruto (List<Map<String, String>> datos) {
        this.salarioBruto = datos.get(0).get("salarioBruto");
        return this; }

        public DatosNominaBuilder ingConstitutivos (List<Map<String, String>> datos) {
        this.ingConstitutivos = datos.get(0).get("ingConstitutivos");
        return this; }

        public DatosNominaBuilder ingNoConstitutivos (List<Map<String, String>> datos) {
        this.ingNoConstitutivos = datos.get(0).get("ingNoConstitutivos");
        return this; }

        public DatosNominaBuilder aporteSolPensional (List<Map<String, String>> datos) {
        this.aporteSolPensional = datos.get(0).get("aporteSolPensional");
        return this; }

        public DatosNominaBuilder salud (List<Map<String, String>> datos) {
        this.salud = datos.get(0).get("salud");
        return this;}

        public DatosNominaBuilder pension (List<Map<String, String>> datos) {
        this.pension = datos.get(0).get("pension");
        return this;}

        public DatosNominaBuilder netoPagar (List<Map<String, String>> datos) {
        this.netoPagar = datos.get(0).get("netoPagar");
        return this; }

        public DatosNominaBuilder arl (List<Map<String, String>> datos) {
        this.arl = datos.get(0).get("arl");
        return this; }

        public DatosNominaBuilder caja (List<Map<String, String>> datos) {
        this.caja = datos.get(0).get("caja");
        return this; }

        public DatosNominaBuilder pensionEmpleador (List<Map<String, String>> datos) {
        this.pensionEmpleador = datos.get(0).get("pensionEmpleador");
        return this; }

        public DatosNominaBuilder reteFuente (List<Map<String, String>> datos) {
        this.reteFuente = datos.get(0).get("reteFuente");
        return this; }

       public DatosNominaBuilder cesantias (List<Map<String, String>> datos) {
        this.cesantias = datos.get(0).get("cesantias");
        return this; }

        public DatosNominaBuilder intCesantias (List<Map<String, String>> datos) {
        this.intCesantias = datos.get(0).get("intCesantias");
        return this; }

        public DatosNominaBuilder prima (List<Map<String, String>> datos) {
        this.prima = datos.get(0).get("prima");
        return this; }

            public DatosNominaBuilder vacaciones (List<Map<String, String>> datos) {
        this.vacaciones = datos.get(0).get("vacaciones");
        return this; }

    public DatosNominaBuilder vacacionesAnual (List<Map<String, String>> datos) {
        this.vacacionesAnual = datos.get(0).get("vacacionesAnual");
        return this; }

    public DatosNominaBuilder ajusteFinal (List<Map<String, String>> datos) {
        this.ajusteFinal = datos.get(0).get("ajusteFinal");
        return this; }

    public DatosNominaBuilder svDefANual (List<Map<String, String>> datos) {
        this.svDefANual = datos.get(0).get("svDefANual");
        return this; }

    public DatosNominaBuilder vacacionesDefAnual (List<Map<String, String>> datos) {
        this.vacacionesDefAnual = datos.get(0).get("vacacionesDefAnual");
        return this; }

    public DatosNominaBuilder cesantiasDefAnual (List<Map<String, String>> datos) {
        this.cesantiasDefAnual = datos.get(0).get("cesantiasDefAnual");
        return this; }
    public DatosNominaBuilder cesantiasProvAnual (List<Map<String, String>> datos) {
        this.cesantiasProvAnual = datos.get(0).get("cesantiasProvAnual");
        return this; }
    public DatosNominaBuilder intCesantiasAnual (List<Map<String, String>> datos) {
        this.intCesantiasAnual = datos.get(0).get("intCesantiasAnual");
        return this; }

    public DatosNominaBuilder intCesantiasProvAnual (List<Map<String, String>> datos) {
        this.intCesantiasProvAnual = datos.get(0).get("intCesantiasProvAnual");
        return this; }

    public DatosNominaBuilder vacacionesHabiles (List<Map<String, String>> datos) {
        this.vacacionesHabiles = datos.get(0).get("vacacionesHabiles");
        return this; }

    public DatosNominaBuilder vacacionesFestivos (List<Map<String, String>> datos) {
        this.vacacionesFestivos = datos.get(0).get("vacacionesFestivos");
        return this; }

    public DatosNominaBuilder primaLegalSem2 (List<Map<String, String>> datos) {
        this.primaLegalSem2 = datos.get(0).get("primaLegalSem2");
        return this; }

    public DatosNominaBuilder primaLegalProvSem2 (List<Map<String, String>> datos) {
        this.primaLegalProvSem2 = datos.get(0).get("primaLegalProvSem2");
        return this; }

    public DatosNominaBuilder bonoPrimaExtraLegal (List<Map<String, String>> datos) {
        this.bonoPrimaExtraLegal = datos.get(0).get("bonoPrimaExtraLegal");
        return this; }

    public DatosNominaBuilder primaExtraLegal (List<Map<String, String>> datos) {
        this.primaExtraLegal = datos.get(0).get("primaExtraLegal");
        return this; }

    public DatosNominaBuilder ajusteIntCesantias (List<Map<String, String>> datos) {
        this.ajusteIntCesantias = datos.get(0).get("ajusteIntCesantias");
        return this; }

    public DatosNominaBuilder ajusteCierreSalarial (List<Map<String, String>> datos) {
        this.ajusteCierreSalarial = datos.get(0).get("ajusteCierreSalarial");
        return this; }

    public CreateDatosNomina build() {
        return new CreateDatosNomina(this);
    }

}
