import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuarioCal {
    static void main() {
        try {
            Scanner scanner = new Scanner(System.in);
            double num1,num2,num3,prom;
            System.out.println("ingresa tu primera calificacion");
            num1= scanner.nextDouble();
            System.out.println("ingresa tu segunda calificacion");
            num2= scanner.nextDouble();
            System.out.println("ingresa tu tercera calificacion");
            num3= scanner.nextDouble();
            prom=(num1+num2+num3)/3;
            System.out.println("promedio = " + prom);
        }catch (InputMismatchException at){
            System.out.println("Ingresa una calificacion numerica");
        }


    }
}
