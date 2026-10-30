package Tema3;


import java.util.Scanner;

public class CompetenciaResistencia {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int NUM=0;
        final int TOTALRONDAS=5;
        int cantidadParticipantes;
        double distancia;
        int repetirCompetencia;
        int opcionEstadistica;
        do {
            System.out.println("Ingrese la cantidad de participantes");
            cantidadParticipantes= scanner.nextInt();
            while (cantidadParticipantes<=NUM){
                System.out.println("Debe ingresar una cantidad mayor a 0 :");
                cantidadParticipantes=scanner.nextInt();
            }
            double distanciaTotalGlobal=0;
            double mayorDistanciaTotal=0;
            int ganadorParticipante=1;
            int contRondasBajo=0;
            int contRondasMedio=0;
            int contRondasAlto=0;
            for (int participante = 1; participante <= cantidadParticipantes; participante++) {
                System.out.println(" Participante " + participante );
                double distanciaParticipanteActual = 0;

                for (int ronda = 1; ronda <= TOTALRONDAS; ronda++) {
                    System.out.print("Distancia en la ronda " + ronda + " (km): ");
                    distancia = scanner.nextDouble();

                    while (distancia < NUM) {
                        System.out.print("No puede ser negativa. Ingrese nuevamente: ");
                        distancia = scanner.nextDouble();
                    }

                    distanciaParticipanteActual = distanciaParticipanteActual + distancia;
                    distanciaTotalGlobal = distanciaTotalGlobal + distancia;
                    if (distancia<2.0){
                    contRondasBajo=contRondasBajo+1;
                    } else if (distancia>=2.0 && distancia<=4.0) {
                        contRondasMedio=contRondasMedio+1;
                    }else { contRondasAlto=contRondasAlto +1;
                    }
                }
                double promedioParticipante = distanciaParticipanteActual / TOTALRONDAS;
                System.out.println("Distancia total: " + distanciaParticipanteActual + " km");
                System.out.println("Promedio: " + promedioParticipante + " km/ronda");

                if (participante == 1 || distanciaParticipanteActual > mayorDistanciaTotal) {
                    mayorDistanciaTotal = distanciaParticipanteActual;
                    ganadorParticipante = participante;
                }
            }
            System.out.print("Seleccione una opción: ");
            System.out.println("1. Distancia total y promedio global");
            System.out.println("2. Conteo de rondas por categoría");
            System.out.println("3. Participante con mayor distancia");
            opcionEstadistica = scanner.nextInt();

            switch (opcionEstadistica) {
                case 1:
                    double promedioGlobal = distanciaTotalGlobal / (cantidadParticipantes * TOTALRONDAS);
                    System.out.println("Distancia total global: " + distanciaTotalGlobal + " km");
                    System.out.println("Promedio global: " + promedioGlobal + " km");
                    break;
                case 2:
                    System.out.println("Rondas Bajo ( <2 km): " + contRondasBajo);
                    System.out.println("Rondas Medio (2-4 km): " + contRondasMedio);
                    System.out.println("Rondas Alto (>4 km): " + contRondasAlto);
                    break;
                case 3:
                    System.out.println("Ganador: Participante " + ganadorParticipante + " con " + mayorDistanciaTotal + " km");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

                   System.out.print("¿Desea registrar otra competencia? 1) Sí, 2) No: ");
                   repetirCompetencia = scanner.nextInt();

        }while(repetirCompetencia==1);
    }
}
