package co.com.auto_odoo.certificacion.models.nomina;

public class CreateDatosNomina {

    private final String pensionSol;
    private final String salarioBasico;
    private final String alimentacion;
    private final String conectividad;

    private final String subConectividad;
    private final String salarioBruto;
    private final String parqueadero;
    private final String comisiones;
    private final String ingConstitutivos;
    private final String ingNoConstitutivos;
    private final String aporteSolPensional;
    private final String salud;
    private final String pension;
    private final String netoPagar;
    private final String arl;
    private final String caja;
    private final String pensionEmpleador;
    private final String reteFuente;
    private final String cesantias;
    private final String intCesantias;
    private final String prima;
    private final String vacaciones;
    private final String vacacionesAnual;
    private final String ajusteFinal;
    private final String svDefANual;
    private final String vacacionesDefAnual;
    private final String cesantiasDefAnual;
    private final String cesantiasProvAnual;
    private final String intCesantiasAnual;
    private final String intCesantiasProvAnual;
    private final String vacacionesHabiles;
    private final String vacacionesFestivos;
    private final String primaLegalSem2;
    private final String primaLegalProvSem2;
    private final String bonoPrimaExtraLegal;
    private final String primaExtraLegal;
    private final String ajusteIntCesantias;
    private final String ajusteCierreSalarial;


    public CreateDatosNomina(DatosNominaBuilder builder) {
        this.salarioBasico = builder.getSalarioBasico();
        this.alimentacion = builder.getAlimentacion();
        this.conectividad = builder.getConectividad();
        this.subConectividad = builder.getSubConectividad();
        this.parqueadero = builder.getParqueadero();
        this.comisiones = builder.getComisiones();
        this.salarioBruto = builder.getSalarioBruto();
        this.ingConstitutivos = builder.getIngConstitutivos();
        this.ingNoConstitutivos = builder.getIngNoConstitutivos();
        this.aporteSolPensional = builder.getAporteSolPensional();
        this.salud = builder.getSalud();
        this.pension = builder.getPension();
        this.netoPagar = builder.getNetoPagar();
        this.arl = builder.getArl();
        this.caja = builder.getCaja();
        this.pensionSol = builder.getAporteSolPensional();
        this.reteFuente = builder.getReteFuente();
        this.cesantias = builder.getCesantias();
        this.intCesantias = builder.getIntCesantias();
        this.prima = builder.getPrima();
        this.vacaciones = builder.getVacaciones();
        this.pensionEmpleador = builder.getPensionEmpleador();
        this.vacacionesAnual = builder.getVacacionesAnual();
        this.ajusteFinal = builder.getAjusteFinal();
        this.svDefANual = builder.getSvDefANual();
        this.vacacionesDefAnual = builder.getVacacionesDefAnual();
        this.cesantiasDefAnual = builder.getCesantiasDefAnual();
        this.cesantiasProvAnual = builder.getCesantiasProvAnual();
        this.intCesantiasAnual = builder.getIntCesantiasAnual();
        this.intCesantiasProvAnual = builder.getIntCesantiasProvAnual();
        this.vacacionesHabiles = builder.getVacacionesHabiles();
        this.vacacionesFestivos = builder.getVacacionesFestivos();
        this.primaLegalSem2 = builder.getPrimaLegalSem2();
        this.primaLegalProvSem2 = builder.getPrimaLegalProvSem2();
        this.bonoPrimaExtraLegal = builder.getBonoPrimaExtraLegal();
        this.primaExtraLegal = builder.getPrimaExtraLegal();
        this.ajusteIntCesantias = builder.getAjusteIntCesantias();
        this.ajusteCierreSalarial = builder.getAjusteCierreSalarial();
    }


    public String getSalarioBasico() { return salarioBasico;}
    public String getAlimentacion() { return alimentacion;}
    public String getConectividad() {  return conectividad;}
    public String getSubConectividad() {  return subConectividad;}
    public String getParqueadero() {  return parqueadero;}
    public String getComisiones() {  return comisiones;}
    public String getSalarioBruto() {  return salarioBruto;}
    public String getIngConstitutivos() {  return ingConstitutivos;}
    public String getIngNoConstitutivos() {  return ingNoConstitutivos;}
    public String getPensionEmpleador() { return pensionEmpleador;}
    public String getAporteSolPensional() { return aporteSolPensional;}
    public String getSalud() { return salud;}
    public String getPension() { return pension;}
    public String getNetoPagar() {  return netoPagar;}
    public String getArl() {
        return arl;
    }

    public String getCaja() {
        return caja;
    }

    public String getPensionSol() {
        return pensionSol;
    }

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

}
