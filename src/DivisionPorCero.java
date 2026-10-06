import java.util.Scanner;

public class DivisionPorCero {
    static void main() {
        try {
            Scanner scanner = new Scanner(System.in);
            int a,b,c;// c=a/b
            System.out.println("dame el valor de a");
            a= scanner.nextInt();
            System.out.println("dame el valor de b");
            b= scanner.nextInt();
            //dividir
            c=a/b;
            System.out.println("c = " + c);
            System.out.println();
        }catch (ArithmeticException ae){
            System.out.println("no puedes dividir por cero");
        }catch (NullPointerException np){
            System.out.println("estas manejando mal un null");
        }finally {
            System.out.println(" me ejecutar siempre");
        }

    }
}
