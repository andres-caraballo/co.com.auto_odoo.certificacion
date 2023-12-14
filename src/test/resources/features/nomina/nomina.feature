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

   Esquema del escenario: Calcular salario de empleado con bonificación salarial y auxilio no salarial
     Dado que Andres quiere ingresar con el usuario: admin y la clave: odoo16QAPayroll2023*
     Cuando el ingresa al modulo de Nómina para calcular la nomina del empleado Pedro Automatización
     Entonces el podra visualizar que el resultado de los valores es correcto segun salario con bonificación salarial
       | salarioBasico   | alimentacion   | conectividad   | parqueadero   | comisiones   | salarioBruto   | ingConstitutivos   | ingNoConstitutivos   | aporteSolPensional   | salud   | pension   | netoPagar   | arl   | caja   | pensionEmpleador   | reteFuente   | cesantias   | intCesantias   | prima   | vacaciones   |
       | <salarioBasico> | <alimentacion> | <conectividad> | <parqueadero> | <comisiones> | <salarioBruto> | <ingConstitutivos> | <ingNoConstitutivos> | <aporteSolPensional> | <salud> | <pension> | <netoPagar> | <arl> | <caja> | <pensionEmpleador> | <reteFuente> | <cesantias> | <intCesantias> | <prima> | <vacaciones> |
     Ejemplos:
       | salarioBasico | alimentacion | conectividad | parqueadero | comisiones | salarioBruto | ingConstitutivos | ingNoConstitutivos | aporteSolPensional | salud      | pension    | netoPagar    | arl       | caja       | pensionEmpleador | reteFuente | cesantias  | intCesantias | prima      | vacaciones |
       | 4.480.000,00  | 960.000,00   | 960.000,00   | 200.000,00  | 500.000,00 | 7.100.000,00 | 4.980.000,00     | 2.120.000,00       | 597.600,00         | 199.200,00 | 199.200,00 | 5.997.600,00 | 25.996,00 | 199.200,00 | 597.600,00       | 4.000,00   | 414.834,00 | 49.800,00    | 414.834,00 | 207.666,00 |

   Esquema del escenario: Calcular salario de empleado con vacaciones
     Dado que Andres quiere ingresar con el usuario: admin y la clave: odoo16QAPayroll2023*
     Cuando el ingresa al modulo de Nómina para calcular la nomina del empleado Pedro Automatización Vacaciones
     Entonces el podra visualizar que el resultado de los valores es correcto segun salario con vacaciones
       | salarioBasico   | alimentacion   | conectividad   | vacacionesHabiles   | vacacionesFestivos   | subConectividad   | salarioBruto   | primaLegalSem2   | primaLegalProvSem2   | bonoPrimaExtraLegal   | primaExtraLegal   | ingConstitutivos   | ingNoConstitutivos   | aporteSolPensional   | salud   | pension   | cesantiasDefAnual   | cesantiasProvAnual   | intCesantiasAnual   | intCesantiasProvAnual   | netoPagar   | arl   | caja   | pensionEmpleador   | ajusteIntCesantias   | ajusteCierreSalarial   | reteFuente   | cesantias   | intCesantias   | prima   | vacaciones   | vacacionesAnual   | ajusteFinal   | svDefANual   | vacacionesDefAnual   |
       | <salarioBasico> | <alimentacion> | <conectividad> | <vacacionesHabiles> | <vacacionesFestivos> | <subConectividad> | <salarioBruto> | <primaLegalSem2> | <primaLegalProvSem2> | <bonoPrimaExtraLegal> | <primaExtraLegal> | <ingConstitutivos> | <ingNoConstitutivos> | <aporteSolPensional> | <salud> | <pension> | <cesantiasDefAnual> | <cesantiasProvAnual> | <intCesantiasAnual> | <intCesantiasProvAnual> | <netoPagar> | <arl> | <caja> | <pensionEmpleador> | <ajusteIntCesantias> | <ajusteCierreSalarial> | <reteFuente> | <cesantias> | <intCesantias> | <prima> | <vacaciones> | <vacacionesAnual> | <ajusteFinal> | <svDefANual> | <vacacionesDefAnual> |
     Ejemplos:
       | salarioBasico | alimentacion | conectividad | vacacionesHabiles | vacacionesFestivos | subConectividad | salarioBruto | primaLegalSem2 | primaLegalProvSem2 | bonoPrimaExtraLegal | primaExtraLegal | ingConstitutivos | ingNoConstitutivos | aporteSolPensional | salud     | pension   | cesantiasDefAnual | cesantiasProvAnual | intCesantiasAnual | intCesantiasProvAnual | netoPagar    | arl      | caja      | pensionEmpleador | ajusteIntCesantias | ajusteCierreSalarial | reteFuente | cesantias  | intCesantias | prima      | vacaciones | vacacionesAnual | ajusteFinal | svDefANual | vacacionesDefAnual |
       | 666.666,67    | 100.000,00   | 100.000,00   | 866.666,67        | 466.666,67         | 46.868,67       | 3.317.171,67 | 1.070.303,00   | 360.405,98         | 0,00                | 0,00            | 666.666,67       | 200.000,00         | 0,00               | 80.000,00 | 80.000,00 | 2.162.445,00      | 360.407,42         | 259.493,40        | 259.493,34            | 3.157.171,67 | 3.500,00 | 80.000,00 | 240.000,00       | 1,16               | 1.802.037,58         | 0,00       | 180.203,71 | 41.446,85    | 180.202,99 | 83.333,33  | 166.666,67      | 833.333,34  | 0,00       | 133.333,33         |


    #-------------------------------- De momento hacen falta datos para calcular algunos valores --------------------------------#
  # ----- Por ejemplo:
  # ----- ARL: Se necesita la informacion para determinar el perfil de riesgo de la persona para asi determinar el porcentaje de pago de la prestacion social
  # ----- Caja: Se desconoce que valor corresponde para aplicar alguna formula o regla.
  # ----- Retencion en la fuente: La retencion en la fuente al parecer es un bug por que los porcentajes no corresponden al calculo de UVT,
  # de manera que habria que revisar con el equipo dev como determinaron llegar a descontar 4000 sin conocer el porcentaje UVT.
  # ----- Intereses a las cesantias: Para poder calcular este dato se necesita saber los dias trabajados hasta la fecha para poder calcular los intereses en funcion del saldo
  # acumulado en cesantias.
