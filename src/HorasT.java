import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HorasT {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        Double hora,pago,pagoex,pagone,pagoT;
        int horas, horaex,horal;
        System.out.println("Escriba su nombre");
        nombre=scanner.next();
        System.out.println(" ingrese el pago por hora");
        hora= scanner.nextDouble();
        System.out.println("cuantas horas laboro");
        horal= scanner.nextInt();
        if (horal>40){
            horas=40;
            horaex=horal-40;
            pagone=horas*hora;
            pagoex=(hora*2)*horaex;
           pagoT=pagone+pagoex;
            System.out.println("nombre : " +nombre);
            System.out.println("horas trabajadas : " +horal);
            System.out.println("pago por hora : " +hora);
            System.out.println("horas normales trabajadas : " +horas);
            System.out.println("horas extra : " +horaex);
            System.out.println("pago total : " +pagoT);


        }else {
            pagone=horal*hora;
            System.out.println("nombre : " +nombre);
            System.out.println("pago por hora : " +hora);
            System.out.println("pago total : " +pagone);
        }
    }
}
