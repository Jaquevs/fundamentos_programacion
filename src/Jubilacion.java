import java.lang.classfile.attribute.ModuleMainClassAttribute;
import java.util.Scanner;

public class Jubilacion {//algoritmo
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        final int EDAD_JUBILACION=65;
        final int MAYORIA_DE_EDAD=18;
        String nombre;
        int edad=0;
        System.out.println("Escribe tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad:");
        edad= scanner.nextInt();
        if(edad>=EDAD_JUBILACION){//SI EDAD ES >= 65 ENTONCES......true
            System.out.println( nombre +  ",Tiene "  + edad + " años y esta listo para jubilarse");
        } else if (edad>=18){
            System.out.println(nombre+ " es mayor de edad");
        }
        else{//sino
            System.out.println(nombre+" es menor de edad");
            System.out.println(nombre + ",Tiene "+edad+" años y aun no se puede jubilar");
            System.out.println("Le faltan "+(EDAD_JUBILACION-edad)+" años para jubilarse");

        }//FIN SI

    }
}//fin algoritmo