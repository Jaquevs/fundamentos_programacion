package Tema3;

import java.util.Scanner;

public class Ejemplo_For {
    static void main() {
        int iteraciones;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa el numero de iteraciones");
        iteraciones= scanner.nextInt();

        for(int i=1; i<=iteraciones; i++){//inicio del for
            System.out.println(i);

        }//fin del for
        System.out.println("Continua operacion");





    }
}