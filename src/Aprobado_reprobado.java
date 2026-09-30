import java.util.Scanner;

public class Aprobado_reprobado {
    static void main() {
        Scanner scanner = new Scanner (System.in);
        String nombre;
        double cal;
        System.out.println("Escribe tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu calificacion:");
        cal= scanner.nextDouble();
        if(cal>=70){//SI EDAD ES >= 65 ENTONCES......true
            System.out.println( nombre +  " has aprobado la materia ");
        }
        else{//sino
            System.out.println(nombre + ", no has reprobado la materia ");


        }//FIN SI

    }
}