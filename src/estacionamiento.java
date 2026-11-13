import java.util.Scanner;

public class estacionamiento {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        final int MOTO=10;
        final int AUTO=20;
        final int CAMIO=30;
        final double DESC=0.10;
        final double DESD=0.20;
        int tipo,hora;
        double total=0.0;
        int sub=0;
        System.out.println("Ingresa el numero al que pertenece tu vehículo");
        System.out.println("1.motocicleta");
        System.out.println("2.automovil");
        System.out.println("3.camioneta");
        tipo=scanner.nextInt();
        if (tipo>0 && tipo<=3){
            System.out.println("cuantas horas permanecio su vehículo");
            hora=scanner.nextInt();
            if (hora>0){
                if (tipo==1){
                    System.out.println("Vehículo : Motocicleta");
                    if (hora>5&& hora<=10){
                        sub=(hora*MOTO);
                        total=sub-(sub*DESC);
                        System.out.println("Descuento del 5% ");
                    } else if (hora>10) {
                        sub=(hora*MOTO);
                        total=sub-(sub*DESD);
                        System.out.println("Descuento del 20% ");
                    }else{
                        total=hora*10;
                        System.out.println("No se aplica ningun descuento ");
                    }
                    System.out.println("Tarifa : " +MOTO);
                    System.out.println("Horas : " +hora);
                    System.out.println("subtotal : " +sub);
                }
                if (tipo==2){
                    System.out.println("Vehículo : Automóvil" );
                    if (hora>5&& hora<=10){
                        sub=(hora*AUTO);
                        total=sub-(sub*DESC);
                        System.out.println("Descuento del 5% ");
                    } else if (hora>10) {
                        sub=(hora*AUTO);
                        total=sub-(sub*DESD);
                        System.out.println("Descuento del 20% ");
                    }else{
                        total=hora*20;
                        System.out.println("No se aplica ningun descuento ");
                    }
                    System.out.println("Tarifa : " +AUTO);
                    System.out.println("Horas : " +hora);
                    System.out.println("subtotal : " +sub);
                }
                if (tipo==3){
                    System.out.println("Vehículo : Camioneta ");
                    if (hora>5&& hora<=10){
                        sub=(hora*30);
                        total=sub-(sub*DESC);
                        System.out.println("Descuento del 5% ");
                    } else if (hora>10) {
                        sub=(hora*CAMIO);
                        total=sub-(sub*DESD);
                        System.out.println("Descuento del 20% ");
                    }else{
                        total=hora*CAMIO;
                        System.out.println("No se aplica ningun descuento ");
                    }
                    System.out.println("Tarifa : " +CAMIO);
                    System.out.println("Horas : " +hora);
                    System.out.println("subtotal : " +sub);
                }
                System.out.println("Total a pagar : " +total);
            }else{
                System.out.println("la cantidad de horas no es valida");
            }
        }else{
            System.out.println("Ingrese correctamente el numero al que pertenece su vehículo");
        }

    }
}
