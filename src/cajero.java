import java.util.Scanner;

public class cajero {
    static void main() {
        Scanner scanner = new Scanner (System.in );
        final int LIMITE_RETIRO=5000;
        double saldo, cant,total;
        System.out.println("ingrese su saldo disponible");
        saldo= scanner.nextDouble();
        if (saldo <=0){
            System.out.println("ingrese un saldo valido");
        }else {
            System.out.println("ingrese la cantidad que desea retirar");
            cant= scanner.nextDouble();
            if (cant<=0){
                System.out.println("ingrese una cantidad valida");
            } else if (cant> saldo) {
                System.out.println("Fondos insuficientes");
            } else if (cant>LIMITE_RETIRO) {
                System.out.println("El limite maximo para retirar es de : "  + LIMITE_RETIRO);
            }else {
                total=saldo-cant;
                System.out.println("Retiro autorizado");
                System.out.println("Efectivo entregado : " + cant);
                System.out.println(" Saldo restante : " + total);
                if (total < 500){
                    System.out.println( "Advertencia, le quedan menos de 500 pesos en su cuenta");
                }
            }
        }
    }
}
