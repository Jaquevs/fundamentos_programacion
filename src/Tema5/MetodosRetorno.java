package Tema5;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class MetodosRetorno {

    static Scanner scanner = new Scanner(System.in);
        static void main () {
            int op;
            do {
                System.out.println("Selecciona una opcion \n 1)Cuadrado \n 2)Triangulo \n 3)Circulo \n 4)Rectangulo \n 5) salir");
                op = scanner.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Area = " + cuadrado());
                        break;
                    case 2:
                        System.out.println("Area = " + triangulo());
                        break;
                    case 3:
                        System.out.println("Area = " + circulo());
                        break;
                    case 4:
                        System.out.println("Area = " + rectangulo());
                        break;
                }
            }while (op !=5);
            System.out.println("Adios");

        }
        public static double cuadrado () {
        double l = 0;
        System.out.println("Ingresa el valor de un lado");
        l = scanner.nextDouble();
        return (l * l);
        }
        public static double triangulo(){
            double a,b;
            System.out.println("ingrese el valor de la altura");
            a= scanner.nextDouble();
            System.out.println("ingrese el valor de la base");
            b= scanner.nextDouble();
            return (a*b/2.0);
        }
        public static  double circulo(){
            double r;
            System.out.println("Ingrese el valor del radio");
            r= scanner.nextDouble();
            return  (PI*pow(r,2));
        }
        public static double rectangulo(){
            double a,b;
            System.out.println("Ingresa el valor de la altura");
            a=scanner.nextDouble();
            System.out.println("Ingresa el valor de la base ");
            b=scanner.nextDouble();
            return  (a*b);
        }

}
