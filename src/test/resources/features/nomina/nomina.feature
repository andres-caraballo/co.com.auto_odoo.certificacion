#language: es

 Característica: Calcular Nomina de empleado sin novedades
   yo como usuario de odoo deseo ingresar al modulo de nomina
   para validar sus funcionalidades del calculo de salario sin novedades

  Esquema del escenario: Calcular salario de empleado sin novedades
     Dado que Andres quiere ingresar con el usuario: admin y la clave: odoo16pailotSh2023*
     Cuando el ingresa al modulo de Nómina para calcular la nomina del empleado DANIEL ALFONSO MATEUS ROA
     Entonces el podra visualizar que el resultado de los valores es correcto
       | salarioBasico   | alimentacion   | conectividad   | salarioBruto   | ingConstitutivos   | ingNoConstitutivos   | aporteSolPensional   | salud   | pension   | netoPagar   | arl   | caja   | pensionEmpleador   | reteFuente   | cesantias   | intCesantias   | prima   | vacaciones   |
       | <salarioBasico> | <alimentacion> | <conectividad> | <salarioBruto> | <ingConstitutivos> | <ingNoConstitutivos> | <aporteSolPensional> | <salud> | <pension> | <netoPagar> | <arl> | <caja> | <pensionEmpleador> | <reteFuente> | <cesantias> | <intCesantias> | <prima> | <vacaciones> |
    Ejemplos:
      | salarioBasico | alimentacion | conectividad | salarioBruto | ingConstitutivos | ingNoConstitutivos | aporteSolPensional | salud      | pension    | netoPagar    | arl       | caja       | pensionEmpleador | reteFuente | cesantias  | intCesantias | prima      | vacaciones |
      | 4.480.000,00  | 960.000,00   | 960.000,00   | 6.400.000,00 | 4.480.000,00     | 1.920.000,00       | 537.600,00         | 179.200,00 | 179.200,00 | 6.037.600,00 | 23.400,00 | 179.200,00 | 537.600,00       | 4.000,00   | 373.333,33 | 153.066,66   | 373.331,84 | 186.666,67 |



  #-------------------------------- De momento hacen falta datos para calcular algunos valores --------------------------------#
  # ----- Por ejemplo:
  # ----- ARL: Se necesita la informacion para determinar el perfil de riesgo de la persona para asi determinar el porcentaje de pago de la prestacion social
  # ----- Caja: Se desconoce que valor corresponde para aplicar alguna formula o regla.
  # ----- Retencion en la fuente: La retencion en la fuente al parecer es un bug por que los porcentajes no corresponden al calculo de UVT,
  # de manera que habria que revisar con el equipo dev como determinaron llegar a descontar 4000 sin conocer el porcentaje UVT.
  # ----- Intereses a las cesantias: Para poder calcular este dato se necesita saber los dias trabajados hasta la fecha para poder calcular los intereses en funcion del saldo
  # acumulado en cesantias.

