package co.com.auto_odoo.certificacion.models.nomina;

public class CreateDatosNomina {

    private final String salarioBasico;
    private final String alimentacion;
    private final String conectividad;
    private final String salarioBruto;
    private final String ingConstitutivos;
    private final String ingNoConstitutivos;
    private final String aporteSolPensional;
    private final String salud;
    private final String pension;
    private final String netoPagar;



    private final String arl;
    private final String caja;
    private final String pensionSol;
    private final String reteFuente;
    private final String cesantias;
    private final String intCesantias;
    private final String prima;
    private final String vacaciones;

    public CreateDatosNomina(DatosNominaBuilder builder) {
        this.salarioBasico = builder.getSalarioBasico();
        this.alimentacion = builder.getAlimentacion();
        this.conectividad = builder.getConectividad();
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
    }


    public String getSalarioBasico() { return salarioBasico;}
    public String getAlimentacion() { return alimentacion;}
    public String getConectividad() {  return conectividad;}
    public String getSalarioBruto() {  return salarioBruto;}
    public String getIngConstitutivos() {  return ingConstitutivos;}
    public String getIngNoConstitutivos() {  return ingNoConstitutivos;}
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

}
