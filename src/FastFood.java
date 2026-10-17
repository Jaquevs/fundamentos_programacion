package Tema3;
import java.util.Scanner;
public class FastFood {
    static void main() {
        Scanner scsnner = new Scanner(System.in);
        String op;
        System.out.println("SELECCIONA ALGO DEL MENU: \n A)HAMBURGUESA \n B)HOTDOG \n C)PIZZA");
        op = scsnner.nextLine();
        switch (op){
            case "A":
                System.out.println("ELEGISTE UNA HAMBURGUESA");
                break;
            case "B":
                System.out.println("ELEGISTE UN HOTDOG");
                break;
            case "C":
                System.out.println("ELEGISTE UNA PIZZA");
                break;
            default:
                System.out.println("OPCION NO VALIDA");
                break;
        }
    }

}
