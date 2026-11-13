package Tema5;

import java.util.Scanner;

public class MetodosParametros {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int op=0,a,b;
        System.out.println("Ingresa una opcion \n 1)Suma \n 2) Resta \n 3)Multiplicacion \4 4)Division");
        op=scanner.nextInt();
        System.out.println("Ingresa el valor para a");
        a= scanner.nextInt();
        System.out.println("Ingresa el valor para b");
        b= scanner.nextInt();
        switch (op){
            case 1:
                suma(a,b);
                break;
            case 2:
                resta(a,b);
                break;
            case 3:
                multiplicacion(a,b);
                break;
            case 4:
                division(a,b);
                break;
            default:
                System.out.println("Elegiste una opcion no valda");
                break;
        }
    }
    public static void suma(int a, int b){//parametros
        System.out.println("Suma = " +(a+b));
    }
    public static void resta(int a, int b){//parametros
        System.out.println("Resta = " +(a-b));
    }
    public static void multiplicacion(int a, int b){//parametros
        System.out.println("Multiplicacion = " +(a*b));
    }
    public static void division(int a, int b){//parametros
        if (b==0){
            System.out.println("No se puede dividir entre cero");
        }else {
            System.out.println("Division = " +(a/b));
        }
    }
}
