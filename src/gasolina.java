package Tema3;

import java.util.Scanner;

public class gasolina {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final double DESC_CARGA=0.05;
        int contCargas=0,contConDesc=0;
        double totalLitros=0,totalAntesDesc=0,totalCobro=0;
        int res;
        do {
            double litros,precio, importe=0,desc=0,pagoFinal=0;
            System.out.println("cuantos litros cargo");
            litros= scanner.nextDouble();
            System.out.println("Ingrese el precio por litro");
            precio= scanner.nextDouble();
            if (litros>0 && precio>0){
                importe=litros*precio;
                contCargas++;
                if(litros>=40){
                    desc=importe*DESC_CARGA;
                    contConDesc++;
                }
                pagoFinal=importe-desc;
                System.out.println("Importe original : " +importe);
                System.out.println("Importe con descuento : " +desc);
                System.out.println("Total a pagar : " +pagoFinal);
                totalLitros=totalLitros+litros;
                totalAntesDesc=totalAntesDesc+importe;
                totalCobro=totalCobro+pagoFinal;

            }else {
                System.out.println("Datos no validos");
            }
            System.out.println("\n ¿Hay mas cargas? 1) si , 2) no");
            res=scanner.nextInt();

        }while(res==1);
        System.out.println("Numero total de cargas registradas : " +contCargas);
        System.out.println("Cargas que recibieronn descuento : " +contConDesc);
        System.out.println("total de litros vendidos : " +totalLitros);
        System.out.println("importe total antes de descuentos : " +totalAntesDesc);
        System.out.println("Total cobrado : " +totalCobro);
        if (contCargas>0){
            System.out.println("importe promedio por carga " +(totalCobro/contCargas));
        }else {
            System.out.println("importe promedio por carga : 0 ");
        }

    }
}
