package Tema3;
/*
*Instituto Tecnologico de Pachuca
* Fundamentos de programacion
* VILLAVERDE SALAS JAQUELINE
* 2026-10-14
* Programa que evalua una serie de numeros si es par o impar
 */

import java.util.Scanner;

public class ParImparWhile {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int res;
        do {
            int n, contador = 5;
            System.out.println("Ingrese un número");
            n = scanner.nextInt();
            while (contador <= n) {
                if (contador % 2 == 0) {// n dividido entre dos tiene residuo cero
                    System.out.println("El numero : " + contador + " es par");
                } else {
                    System.out.println("El numero : " + contador + " es impar");
                }
                contador++;
            }
            System.out.println("¿Desea ingresar otro numero? 1)si , 2) no");
            res=scanner.nextInt();
        }while(res==1);
    }
}
