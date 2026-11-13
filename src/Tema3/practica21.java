package Tema3;

import java.util.Scanner;

public class practica21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MINIMO = 0;

        int totalSumaPares = 0;
        int totalSumaImpares = 0;
        int totalCantPares = 0;
        int totalCantImpares = 0;
        int opcion,num;
        do {
            System.out.println("Ingrese un numero mayor a 0:");
           num = scanner.nextInt();
            while (num <= MINIMO) {
                System.out.println("Error. Ingrese un numero mayor a 0:");
                num = scanner.nextInt();
            }


            for (int i = 1; i <= num; i++) {
                if (i % 2 == 0) {
                    totalSumaPares = totalSumaPares + i;
                    totalCantPares = totalCantPares + 1;
                } else {
                    totalSumaImpares = totalSumaImpares + i;
                    totalCantImpares = totalCantImpares + 1;
                }
            }
              System.out.println("Cantidad total de pares: " + totalCantPares);    
              System.out.println("Suma total de pares: " + totalSumaPares);        
              System.out.println("Cantidad total de impares: " + totalCantImpares);
              System.out.println("Suma total de impares: " + totalSumaImpares);
            System.out.println("¿Desea realizar otro calculo? 1) Si, 2) No)");
            opcion = scanner.nextInt();

        } while (opcion == 1);





    }
}