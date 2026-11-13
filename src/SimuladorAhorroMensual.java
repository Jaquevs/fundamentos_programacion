package Tema3;

import java.util.Scanner;

public class SimuladorAhorroMensual {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int NUM=0;
        double cantidadInicial;
        double metaAhorro;
        double ahorroMensualFijo;
        double saldoAcomulado;
        double interesesTotales;
        double interesMes;
        int opcionPlazo;
        int mesesPlazo=0;
        int mesesNecesarios=0;
        int repetir;
        do {
            System.out.println("Ingrese la cantidad inicial de dinero mayor a 0");
            cantidadInicial= scanner.nextDouble();
            while(cantidadInicial<=NUM){
                System.out.println("Ingrese una cantidad inicial mayor a 0 : ");
                cantidadInicial= scanner.nextDouble();
            }
            System.out.println("Ingrese la meta de ahorro mayor a 0 ");
            metaAhorro= scanner.nextDouble();
            while (metaAhorro<=NUM){
                System.out.println("Ingrese una meta de ahorro mayor a 0");
                metaAhorro= scanner.nextDouble();
            }
            System.out.println("Ingrese el ahorro mensual fijo mayor a 0 ");
            ahorroMensualFijo= scanner.nextDouble();
            while (ahorroMensualFijo<=NUM){
                System.out.println("Ingrese un ahorro mesual fijo mayor a 0 ");
                ahorroMensualFijo= scanner.nextDouble();
            }
            saldoAcomulado=cantidadInicial;
            interesesTotales=0;
            mesesNecesarios=0;
            System.out.println("Seleccione el plazo de simulacion :");
            System.out.println("1) 6 meses , 2) 12 meses , 3) 24 meses");
            opcionPlazo= scanner.nextInt();
            switch (opcionPlazo){
                case 1: mesesPlazo=6;
                break;
                case 2: mesesPlazo=12;
                break;
                case 3: mesesPlazo=24;
                break;
                default:
                    System.out.println("Opcion no valida, se tomara 6 meses por defecto");
                    mesesPlazo=6;
                    break;
            }
            for (int mes=1; mes<=mesesPlazo;mes++){
                interesMes=saldoAcomulado*0.01;
                interesesTotales=interesesTotales+interesMes;
                saldoAcomulado=saldoAcomulado+interesMes+ahorroMensualFijo;
                if (saldoAcomulado>=metaAhorro && mesesNecesarios==0){
                    mesesNecesarios=mes;
                }
            }
            System.out.println("Saldo final acomulado : "+saldoAcomulado);
            System.out.println("Intereses totales generados:"+interesesTotales);
            if (mesesNecesarios!=0){
                System.out.println("Meta alcanzada en el mes numero : " +mesesNecesarios);
            }else {
                System.out.println("No se logro alcanzar la meta");
            }
            System.out.println("Desea realizar otra simulacion 1)Si, 2)No");
            repetir=scanner.nextInt();
        }while (repetir==1);
    }
}
