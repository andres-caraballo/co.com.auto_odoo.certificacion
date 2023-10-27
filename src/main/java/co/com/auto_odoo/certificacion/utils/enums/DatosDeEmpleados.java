package co.com.auto_odoo.certificacion.utils.enums;

public enum DatosDeEmpleados {
//    EMPLEADO_A_BUSCAR_SIN_NOVEDAD("WILMER DURAN HERNANDEZ");
RECORDAR_SALARIO_NETO("RECORDAR_SALARIO_NETO"),
    RECORDAR_RETEFUENTE("RECORDAR_RETEFUENTE"),
RECORDAR__VALOR_UVT("RECORDAR_UVT"),
    EMPLEADO_A_BUSCAR_SIN_NOVEDAD("DANIEL ALFONSO MATEUS ROA");


    private final String nombreCompleto;

    DatosDeEmpleados(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() { return nombreCompleto; }

}