package Tema3;

import java.util.Scanner;

public class NumerosAmigos {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int NUM=0;
        int num1,num2;
        int sumaDiv1,sumaDiv2;
        int contDiv1,contDiv2;
        int op,repetir;
        do {
            System.out.println("Ingrese el primer numero");
            num1=scanner.nextInt();
            while (num1<=NUM){
                System.out.println("Debe ingresar un numero mayor a 0 : ");
                num1= scanner.nextInt();
            }
            System.out.println("Ingrese el segundo numero");
            num2= scanner.nextInt();
            while (num2<=0){
                System.out.println("Debe ingresar un numero mayor a 0 :");
                num2=scanner.nextInt();
            }
            sumaDiv1 = 0;
            contDiv1 = 0;
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0) {
                    sumaDiv1 = sumaDiv1 + i;
                    contDiv1 = contDiv1 + 1;
                }
            }

            sumaDiv2 = 0;
            contDiv2 = 0;
            for (int i = 1; i < num2; i++) {
                if (num2 % i == 0) {
                    sumaDiv2 = sumaDiv2 + i;
                    contDiv2 = contDiv2 + 1;
                }
            }
            System.out.println("Seleccione una opcion");
            System.out.println("1.Mostrar la suma y cantidad de divisores propios de cada numero");
            System.out.println("2.Mostrar unicamente el resultado de la comparacion si son amigos o no");
            op= scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("Divisores propios de " +num1+ "Cantidad: "+contDiv1+ ",Suma: "+sumaDiv1);
                    System.out.println("Divisores propios de " +num2+ "Cantidad: "+contDiv2+ ",Suma: "+sumaDiv2);
                    break;
                case 2:
                    if (sumaDiv1 == num2 && sumaDiv2 == num1) {
                        System.out.println("Los numeros " + num1 + " y " + num2 + " Si son numeros amigos");
                    } else {
                        System.out.println("Los numeros " + num1 + " y " + num2 + " No son números amigos");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("¿Desea analizar otra pareja de numeros? 1)Si, 2)No");
            repetir=scanner.nextInt();
        }while(repetir==1);
    }
}
