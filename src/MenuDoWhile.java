package Tema3;

import java.util.Scanner;

public class MenuDoWhile {
    static void main() {
        Scanner scanner= new Scanner(System.in);
        int op=0,a=0,b=0;
        do{
            System.out.println("***Selecciona una opcion");
            System.out.println("1)Suma \n 2)Resta \n 3)Multiplicacion \n 4)Division \n 5)Salir");
            op=scanner.nextInt();
            if (op!=5){
                System.out.println("Dame el valor para a");
                a= scanner.nextInt();
                System.out.println("Dame el valor para b ");
                b= scanner.nextInt();
            }
            switch (op){
                case 1:

                    System.out.println("Suma = " +(a+b));
                    break;
                case 2:

                    System.out.println("Resta = " +(a-b));
                    break;
                case 3:
                    System.out.println("Multiplicacion = " +(a*b));
                    break;
                case 4:
                    if (b!=0){
                        System.out.println("Division = " +(a/b));
                    }else {
                        System.out.println("no se puede dividir por cero");
                    }
                    break;
            }
        }while (op!=5);
        System.out.println(" Hasta luego");
    }
}
