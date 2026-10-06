import java.util.Scanner;

public class descuentoT {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final double NOR=0.0;
        final double FRE=0.10;
        final double VIP=0.20;
        final double DEA=0.05;
        String nom;
        int mon,tipo;
        double sub,total,d,t;
        System.out.println("Ingresa tu nombre");
        nom= scanner.nextLine();
        System.out.println("Ingrese el monto de la compra");
        mon= scanner.nextInt();
        System.out.println("Ingrese el numero de cliente que es");
        System.out.println("1.normal");
        System.out.println("2.frecuente");
        System.out.println("3.vip");
        tipo= scanner.nextInt();
        System.out.println("monto original : " + mon);
        if (tipo==1){
            if (mon>2000){
                d=mon*DEA;
                t=mon-d;
                System.out.println("Descuento aplicado del 5%");
                System.out.println("Total a pagar : " + t);
            }else {
                System.out.println("No se aplica ningun descuento");
                System.out.println("Total a pagar : " + mon);
            }
        }
        if (tipo==2){
            sub=mon*FRE;
            total=mon-sub;
            if (mon>2000){
                d=total*DEA;
                t=total-d;
                System.out.println("Descuentos aplicados del 5% y 10%");
                System.out.println("Total a pagar : " + t);
            }else{
            System.out.println("Se aplico un descuento del 10%");
            System.out.println("Total a pagar : " + total );}
        }
        if (tipo==3){
            sub=mon*VIP;
            total=mon-sub;
            if (mon>2000){
                d=total*DEA;
                t=total-d;
                System.out.println("Descuentos aplicados del 5% y 20%");
                System.out.println("Total a pagar : " +t );
            }else{
            System.out.println("Se aplico un descuento del 20%");
            System.out.println("Total a pagar : " +total );}
        }
    }
}
