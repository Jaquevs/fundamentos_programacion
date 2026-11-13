import java.util.Scanner;

public class banco {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int COMISION= 10;
        final int LIMITE_RETIRO=5000;
        int saldo,retiro,totalS;
        int comi=0;
        System.out.println("Ingrese su saldo disponible");
        saldo=scanner.nextInt();
        if(saldo>0){
            System.out.println("Ingrese la cantidad que desee retirar");
            retiro=scanner.nextInt();
            if (retiro>0&& retiro<=saldo){
                if (retiro<LIMITE_RETIRO){
                    if (saldo>=(retiro+COMISION)){
                        totalS=saldo-retiro-COMISION;
                        System.out.println("Monto retirado : " +retiro);
                        System.out.println("Comisión de : " +COMISION);
                        System.out.println("Saldo final : " +totalS);
                    }else {System.out.println("No se puede realizar ya que se cobra una comision de : " +COMISION);}
                }else {System.out.println("El limite maximo para retirar es de : " +LIMITE_RETIRO);}
            }else {System.out.println("No se puede realizar el retiro");}
        }else {
            System.out.println("Ingrese un valor valido");
        }
    }
}
