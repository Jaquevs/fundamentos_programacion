package Tema3;

import java.util.Scanner;

public class SumaDeNumeros {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int acumulador=0;
        int x=0;
        int respuesta=0;
        int contador=0;
        do{
            System.out.println(" ingrese un numero para sumar");
            x=scanner.nextInt();
            acumulador=acumulador+x;
            // contador=contador+1;contador++
            contador++;
            System.out.println("¿Desea ingresar otro numero? \n 1)si \n 2)no");
            respuesta=scanner.nextInt();

        }while(respuesta==1);
        System.out.println("respuesta : " +acumulador);
        System.out.println(" Se sumaron = " + contador + "numeros");
    }
}
