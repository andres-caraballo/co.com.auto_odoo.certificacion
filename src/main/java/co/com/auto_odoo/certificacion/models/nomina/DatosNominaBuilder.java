package co.com.auto_odoo.certificacion.models.nomina;

import java.util.List;
import java.util.Map;

public class DatosNominaBuilder {

    private String salarioBasico;
    private String alimentacion;
    private String conectividad;
    private String salarioBruto;
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

    public String getSalarioBasico() {
        return salarioBasico;
    }
    public String getAlimentacion() {
        return alimentacion;
    }
    public String getConectividad() {return conectividad; }
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
        return pensionEmpleador;
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


    public CreateDatosNomina build() {
        return new CreateDatosNomina(this);
    }



}
