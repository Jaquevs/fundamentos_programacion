package Tema3;
import java.util.Scanner;
public class cafeteria {
        public static void main(String[] args) {
            Scanner scanner  = new Scanner(System.in);
            int  satisfechos = 0, insatisfechos = 0, max = 0,nota,total,i;
            double promedio=0,suma=0;
            String servicio;
            System.out.print("Cantidad de clientes: ");
             total = scanner.nextInt();
            while (total <= 0) {
                System.out.print("Debe ser mayor a 0. Intente de nuevo: ");
                total = scanner.nextInt();
            }

            for ( i = 1; i <= total; i++) {
                System.out.print("Calificación cliente " + i + " (1-10): ");
                 nota = scanner.nextInt();

                while (nota < 1 || nota > 10) {
                    System.out.print("Error. Ingrese una nota del 1 al 10: ");
                    nota = scanner.nextInt();
                }

                suma = suma+nota;
                if (nota >= 7){ satisfechos++;} else {insatisfechos++;}
                if (nota > max) {max = nota;}
            }

             promedio = suma / total;

            if (promedio >= 8) {servicio = "Excelente servicio";}
            else if (promedio >= 6) {servicio = "Servicio aceptable";}
            else {servicio = "Se requiere mejorar el servicio";}

            System.out.println("Clientes: " + total + "  Suma: " + suma + "  Promedio: " + promedio);
            System.out.println("Satisfechos: " + satisfechos + "  Insatisfechos: " + insatisfechos);
            System.out.println("Nota más alta: " + max + "  Evaluación: " + servicio);
        }

}
