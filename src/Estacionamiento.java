package Tema3;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int AU = 20;
        final int CA = 30;
        final int MO = 10;

        int contAuto = 0;
        int contCamioneta = 0;
        int contMoto = 0;
        double totalGeneral = 0;
        int res;

        do {
            int op, h;
            double pago = 0;

            System.out.println("\n¿Tipo de vehículo? 1) Automóvil , 2) Camioneta , 3) Motocicleta");
            op = scanner.nextInt();

            System.out.println("¿Cuántas horas estuvo?");
            h = scanner.nextInt();

            switch (op) {
                case 1:
                    pago = AU * h;
                    contAuto++;
                    break;
                case 2:
                    pago = CA * h;
                    contCamioneta++;
                    break;
                case 3:
                    pago = MO * h;
                    contMoto++;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            if (op >= 1 && op <= 3) {
                System.out.println("Horas: " + h);
                System.out.println("Total a pagar : $" + pago);

                totalGeneral = totalGeneral+ pago;
            }

            System.out.println("\n¿Hay más carros? 1) Sí , 2) No");
            res = scanner.nextInt();

        } while (res == 1);
        System.out.println("Automóviles : " + contAuto);
        System.out.println("Camionetas  : " + contCamioneta);
        System.out.println("Motocicletas: " + contMoto);
        System.out.println("Total de vehículos atendidos: " + (contAuto + contCamioneta + contMoto));
        System.out.println("Dinero total a pagar (recaudado) : " + totalGeneral);

    }
}