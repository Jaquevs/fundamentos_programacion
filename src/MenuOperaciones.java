package Tema3;

import java.util.Scanner;

public class MenuOperaciones {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int num;
        final int NUM_CERO = 0;

        do {
            System.out.println("\n MENÚ DE OPERACIONES MATEMÁTICAS");
            System.out.println("1. Calcular el cuadrado de un número");
            System.out.println("2. Calcular el cubo de un número");
            System.out.println("3. Determinar si un número es par o impar");
            System.out.println("4. Calcular la suma de los números desde 1 hasta el numero ingresado");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero positivo: ");
                    num = scanner.nextInt();
                    while (num <= NUM_CERO) {
                        System.out.print("Debe ser mayor a 0. Ingrese nuevamente: ");
                        num = scanner.nextInt();
                    }
                    int cuadrado = num * num;
                    System.out.println("El cuadrado de " + num + " es: " + cuadrado);
                    break;

                case 2:
                    System.out.print("Ingrese un número entero positivo: ");
                    num = scanner.nextInt();
                    while (num <= NUM_CERO) {
                        System.out.print("Debe ser mayor a 0. Ingrese nuevamente: ");
                        num = scanner.nextInt();
                    }
                    int cubo = num * num * num;
                    System.out.println("El cubo de " + num + " es: " + cubo);
                    break;

                case 3:
                    System.out.print("Ingrese un número entero: ");
                    num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("El número " + num + " es PAR.");
                    } else {
                        System.out.println("El número " + num + " es IMPAR.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese un número entero positivo para la suma: ");
                    num = scanner.nextInt();
                    while (num <= NUM_CERO) {
                        System.out.print("Debe ser mayor a 0. Ingrese nuevamente: ");
                        num = scanner.nextInt();
                    }
                    int suma = 0;
                    for (int i = 1; i <= num; i++) {
                        suma = suma + i;
                    }
                    System.out.println("La suma desde 1 hasta " + num + " es: " + suma);
                    break;

                case 5:
                    System.out.println(" Hasta luego.");
                    break;

                default:
                    System.out.println("Error: Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 5);

    }
}