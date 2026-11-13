package Tema3;
import java.util.Scanner;
public class DiasDeLaSemana {
    static void main() {
        Scanner scsnner = new Scanner(System.in);
        int opcion;
        System.out.println("ESCRIBA UN NUMERO DEL 1 AL 7: ");
        opcion = scsnner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("OPCION NO VALIDA");
                break;
        }

    }
}
