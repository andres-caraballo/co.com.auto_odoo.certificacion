package co.com.auto_odoo.certificacion.task.nomina.calculos.calculos;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import static java.time.temporal.ChronoUnit.DAYS;

public class Calculos {

    @Test
    public void diferenciaDias() {
        String fechaInicialSinFormato = "09-11-2021";
        String[] arrayFechaInicial = fechaInicialSinFormato.split("-");
        String diaInicialFormat = arrayFechaInicial[2] + "-" + arrayFechaInicial[1] + "-" + arrayFechaInicial[0];
        String requestDate = diaInicialFormat;
//        String  requestDate = "2023-10-28";
        LocalDate myDate = LocalDate.parse(requestDate);

        LocalDate currentDate = LocalDate.now();

        long numberOFDays = DAYS.between(myDate, currentDate);

        System.out.println(String.format("The diff of days is %d", numberOFDays) + diaInicialFormat);
    }

    @Test
    public void arrayFor(){
        String[] nombres = {"Juan", "José", "Miguel","Antonio"};

        for (int i=0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    @Test
    public void nativoMinMax(){
//        Integer[] valores = {2417000, 4750000, 1991000, 100};
        double valores[] = {2417000, 1991000};
        double mayor = 0;
        double menor = 2417000;
        for (int i=0; i < valores.length; i++){
            if (valores[i] > mayor){
                mayor = valores[i];
            }
            if (valores[(int) i] < menor){
                menor = valores[(int) i];
            }
        }
        System.out.println("el numero menor es: " + menor);
       }

    @Test
    public void arrayMinMax(){
        Integer[] numeros = {1991000, 2417000};

        // Encontrar el valor mínimo
        int minimo = Collections.min(Arrays.asList(numeros));
        System.out.println("El valor mínimo es: " + minimo);

        // Encontrar el valor máximo
        int maximo = Collections.max(Arrays.asList(numeros));
        System.out.println("El valor máximo es: " + maximo);

    }

    @Test
    public void redondear(){
        double numero = 4.191;
        System.out.println("Originalmente el número es: " + (numero *1000));
        // Hacia arriba si decimal es >= 5, o sea
        // 1.5 sube a 2, 1.51 sube a 2, 1.90 sube a 2
        // pero 1.49 o 1.4999999 baja a 1, igual que 1.1 o 1.2,
        // etcétera
        System.out.println("Con round: " + Math.round(numero)*1000);
        // Forzar hacia abajo sin importar decimal. Tanto 1.9 como 1.1
        // se convierten en 1
        System.out.println("Con floor: " + Math.floor(numero));
        // Lo contrario de floor. Forzar hacia arriba. Tanto
        // 1.1 como 1.9 suben a 2
        System.out.println("Con ceil: " + Math.ceil(numero));

	/*
		La salida es:
			Originalmente el número es: 15.1
			Con round: 15
			Con floor: 15.0
			Con ceil: 16.0
	*/
    }

        public static void main (String[]args){
            //Declaramos las variables de número mayor, menor y donde se almacenará
            //el número que digitemos.

            //Adicional declaramos nuestro Scanner para capturar desde el teclado.
            int menor;
            int mayor;
            int num;
            Scanner sc = new Scanner(System.in);

            int num1 = 1991000;
            int num2 = 2417000;

            int[] valores = {num2, num1};

            //Pedimos el número y ese lo ponemos como mayor y como menor para posterior
            //poder realizar la comparación de si el número que ingresamos es mayor o
            //menor que los que hemos digitado
            System.out.println(valores);
            num = sc.nextInt();
            menor = num;
            mayor = num;

            //Ahora entramos en un for, la condición deberá ser la cantidad de números
            //total - 1 ya que ya ingresamos un número, si deseas ingresar 20 números
            //entonces la condición irá hasta 19 siempre y cuando la hagas como la tengo
            for (int i = 1; i <= 1; i++) {
                //Pedimos el número y lo capturamos en num
                System.out.println(valores);
                num = sc.nextInt();

                //Comparamos si num es mayor que el número mayor hasta el momento
                //y de ser así, entonces ese será el nuevo número mayor
                if (num > mayor) {
                    mayor = num;
                }
                //Por el contrario si es menor que el número menor, será el nuevo menor
                if (num < menor) {
                    menor = num;
                }
            }

            //Luego simplemente imprimimos el mayor y el menor
            System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
        }


}
