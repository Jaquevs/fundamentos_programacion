import java.util.Scanner;

public class compraP {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int precio,cant,compra,envio;
        double descuento=0.0;
        double totalp,totalFinal;
        System.out.println(" Ingrese el precio del producto");
        precio= scanner.nextInt();
        System.out.println("ingrese la cantidad de productos");
        cant= scanner.nextInt();
        compra=precio*cant;
        if (compra>=1000){
            descuento=compra*0.10;

        }
        totalp=compra-descuento;
        if (totalp<= 1500) {
            envio=80;
        }else {
            envio=0;
        }
        totalFinal=totalp+envio;
        System.out.println("precio del producto : " + precio);
        System.out.println("cantidad : " +cant);
        System.out.println("Subtotal : " + compra);
        System.out.println("descuento : " + descuento);
        System.out.println("total del descuento " + totalp);
        System.out.println(" envio " + envio);
        System.out.println("total final : " + totalFinal);
    }
}
