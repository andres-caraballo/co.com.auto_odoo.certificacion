package co.com.auto_odoo.certificacion.utils.enums.valoresAlmacenados;

public enum ValoresAlmacenados {
//    EMPLEADO_A_BUSCAR_SIN_NOVEDAD("WILMER DURAN HERNANDEZ");
RECORDAR_SALARIO_NETO_2("RECORDAR_SALARIO_NETO");


    private final String obtenerValor;

    ValoresAlmacenados(String obtenerValor) {
        this.obtenerValor = obtenerValor;
    }

    @Override
    public String toString() {
        return obtenerValor; }

}