package Tema3;

import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int countDiv3 = 0;
        double sumaPrimos = 0;
        int countPrimos = 0;
        double promedioPrimos = 0;
        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            int divisores = 0;
            if (i % 2 == 0) {
                sumaPares = sumaPares + i;
            }
            if (i % 3 == 0) {
                countDiv3 = countDiv3 + 1;
            }
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores = divisores + 1;
                }
            }
            if (divisores == 2) {
                System.out.println("Número primo encontrado: " + i);
                sumaPrimos = sumaPrimos + i;
                countPrimos = countPrimos + 1;
            }
        }
        if (countPrimos > 0) {
            promedioPrimos = sumaPrimos / countPrimos;
        }
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Números divisibles entre 3: " + countDiv3);
        System.out.println("Cantidad de numeros primos encontrados: " + countPrimos);
        System.out.println("Promedio de los números primos: " + promedioPrimos);
    }
}