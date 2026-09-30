import java.util.Scanner;

public class clasificar_calificacion {
    static void main() {
        Scanner scanner = new Scanner (System.in);
        int cal;
        System.out.println("Escibe tu calificacion:");
        cal= scanner.nextInt();
        if ( cal>=0 && cal <=59){
            System.out.println(" estas reprobado");

        }else if ( cal>=60 && cal <=69){
            System.out.println(" calificacion suficiente");
        } else if ( cal>=70 && cal <=79){
            System.out.println(" calificacion bien");
        }else if ( cal>=80 && cal <=89){
            System.out.println(" calificacion muy bien");
        }else if ( cal>=90 && cal <=100){
            System.out.println(" calificacion excelente");
        }
    }
}