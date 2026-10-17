package Tema3;

import java.util.Scanner;

public class Medico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DESC_MAYOR = 0.15;

        int contNino = 0, contAdol = 0, contAdulto = 0, contMayor = 0;
        double totalGeneral = 0, totalDesc = 0;
        int res;
        int totalPaciente;

        do {
            int op;
            double costo, pago = 0, desc = 0;

            System.out.println("\n¿Categoría del paciente? 1) Niño(menor de 12) , 2) Adolescente(12 a 17) , 3) Adulto(18 a 59) , 4) Adulto Mayor(mayor a 60)");
            op = scanner.nextInt();

            System.out.println("¿Costo de la consulta?");
            costo = scanner.nextDouble();

            switch (op) {
                case 1:
                    contNino++;
                    pago = costo;
                    break;
                case 2:
                    contAdol++;
                    pago = costo;
                    break;
                case 3:
                    contAdulto++;
                    pago = costo;
                    break;
                case 4:
                    contMayor++;
                    desc = costo * DESC_MAYOR;
                    pago = costo - desc;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (op >= 1 && op <= 4) {
                System.out.println("Descuento aplicado: $" + desc);
                System.out.println("Total a pagar: $" + pago);

                totalGeneral = totalGeneral + pago;
                totalDesc = totalDesc + desc;
            }

            System.out.println("\n¿Hay más pacientes? 1) Sí , 2) No");
            res = scanner.nextInt();

        } while (res == 1);

        totalPaciente = contNino + contAdol + contAdulto + contMayor;

        System.out.println("Niños        : " + contNino);
        System.out.println("Adolescentes : " + contAdol);
        System.out.println("Adultos      : " + contAdulto);
        System.out.println("Adultos Mayor: " + contMayor);
        System.out.println("Total de pacientes atendidos: " + totalPaciente);
        System.out.println("Total de dinero recaudado    : $" + totalGeneral);
        System.out.println("Total de descuentos aplicados: $" + totalDesc);

        if (totalPaciente > 0) {
            System.out.println("Promedio pagado por paciente : " + (totalGeneral / totalPaciente));
        } else {
            System.out.println("Promedio pagado por paciente : 0");
        }
    }
}