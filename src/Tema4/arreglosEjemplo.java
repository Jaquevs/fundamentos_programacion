package Tema4;

import jdk.swing.interop.SwingInterOpUtils;

public class arreglosEjemplo {
    /*
    * un arreglo es una estructura de datos que permite almacenar varios elementos del
    * mismo tipo dentro de una sola variable
    *
    * */
    static void main() {

        int [] calificaciones = new int[5]; //arreglo de variables
        int [] numeros = {10,20,30,40,50};//arreglos de constantes
        System.out.println(numeros[0]);
        System.out.println(numeros[2]);
        numeros[1]=100;
        numeros[4]=200;
        System.out.println(numeros[1]);
        System.out.println(numeros[4]);

        System.out.println("RECORRIDO DE ARREGLO CON FOR");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
        System.out.println("RECORRIDO DE ARRGELO CON FOREACH");
        for( int numero: numeros){//variable del mismo tipo de nuestro arrgelo: nuestro arreglo
            System.out.println(numero);
        }//siempre y cuando tengamos que recorrer todo

        System.out.println("Suma en un arreglo");
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros [i]; //suma = suma + numeros[i];

        }

        System.out.println(suma);

    }
}
