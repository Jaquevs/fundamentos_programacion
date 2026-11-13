package Tema4;

import java.util.Scanner;

public class calificaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int estudiantes = scanner.nextInt();

        int[] calificaciones = new int[estudiantes];


        for (int i = 0; i < estudiantes; i++) {

            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();

            while (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                System.out.print("Ingrese nuevamente la calificación: ");
                calificaciones[i] = scanner.nextInt();
            }
        }

        int suma = 0;
        int mayor = calificaciones[0];
        int menor = calificaciones[0];
        int aprobados = 0;
        int reprobados = 0;


        for (int i = 0; i < estudiantes; i++) {

            suma = suma + calificaciones[i];
            if (calificaciones[i] > mayor) {
                mayor = calificaciones[i];
            }

            if (calificaciones[i] < menor) {
                menor = calificaciones[i];
            }

            if (calificaciones[i] >= 70) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }
        }


        System.out.println("\nCalificaciones ingresadas:");

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + calificaciones[i]);
        }


        System.out.println("\nPromedio: " + (suma / estudiantes));
        System.out.println("Calificación más alta: " + mayor);
        System.out.println("Calificación más baja: " + menor);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Porcentaje de aprobación: " + ((aprobados * 100) / estudiantes) + "%");

    }
}