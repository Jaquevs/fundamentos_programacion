package Tema3;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
public class AreasFiguras {
    static void main() {
        Scanner scsnner = new Scanner(System.in);
        int op;
        int v1,v2;
        double re=0;
        double area = PI;
        System.out.println("1)CUADRADO \n 2)RECTANGULO \n 3)TRIANGULO \n 4)CIRCULO ");
        op = scsnner.nextInt();
       switch (op) {
           case 1:
               System.out.println("INGRESE VALOR DE LADO 1: ");
               v1 = scsnner.nextInt();
               re = pow(v1,2) ;
               System.out.println("EL RESULTADO ES: " + re);
               break;
           case 2:
               System.out.println("INGRESE VALOR DE LADO 1: ");
               v1 = scsnner.nextInt();
               System.out.println("INGRESE VALOR DE LADO 2: ");
               v2 = scsnner.nextInt();
               re = v1 * v2;
               System.out.println("EL RESULTADO ES: " + re);
               break;
           case 3:
               System.out.println("INGRESE VALOR DE LADO 1: ");
               v1 = scsnner.nextInt();
               System.out.println("INGRESE VALOR DE LADO 2: ");
               v2 = scsnner.nextInt();
               re = (v1 * v2)/2.0;
               System.out.println("EL RESULTADO ES: " + re);
               break;
           case 4:
               System.out.println("INGRESE VALOR DE RADIO: ");
               v1 = scsnner.nextInt();
               re = PI * pow(v1,2);
               System.out.println("EL RESULTADO ES: " + re);
               break;
           default:
               System.out.println("Valor no valido");
               break;
       }
}
}
