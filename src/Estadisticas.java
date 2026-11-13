package Tema3;

import java.util.Scanner;

public class Estadisticas {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int NUM=0;
        int n;
        int op,res;
        do {
            System.out.println("Ingrese un numero mayor a 0");
            n=scanner.nextInt();
            while (n<=NUM){
                System.out.println("ingrese un numero mayor a 0 : ");
                n=scanner.nextInt();
            }
            int sumadivcuatro=0;
            int totalcantcuatro=0;
            int totalcanttres=0;
            int totalambos=0;
            int cantpares=0;
            int cantimpares=0;
            int multiploscinco=0;
            for (int i=1; i <= n; i++){
                if (i%4 ==0){
                    sumadivcuatro=sumadivcuatro+i;
                    totalcantcuatro=totalcantcuatro+1;
                }
                if (i%3==0){
                    totalcanttres=totalcanttres+1;
                }
                if (i%4 ==0 && i%3 ==0){
                    totalambos=totalambos+1;
                }
                if (i%2==0){
                    cantpares=cantpares+1;
                }else{
                    cantimpares=cantimpares+1;
                }
                if (i%5==0){
                    multiploscinco=multiploscinco+1;
                }
            }
            System.out.println("1.Ver estadistica de numeros pares");
            System.out.println("2. Ver estadistica de numeros impares");
            System.out.println("3.Ver estadistica de numeros multiplos de 5");
            System.out.println("4. Ver numeros divisibles entre 3,4 y ambos");
            op= scanner.nextInt();

            switch (op){
                case 1:
                    System.out.println("Todos los numeros pares entre el 1 y " +n+ "son : " +cantpares);
                    break;
                case 2:
                    System.out.println("Todos los numeros impares entre 1 y " +n+ "son : " +cantimpares);
                    break;
                case 3:
                    System.out.println("Todos los numeros multiplos de 5 entre 1 y " +n+ "son : "+multiploscinco);
                    break;
                case 4:
                    System.out.println("Numeros divisibles entre 4 : "+totalcantcuatro);
                    System.out.println("suma de ellos mismos : " +sumadivcuatro);
                    System.out.println("Numeros divisibles entre 3 : " +totalcanttres);
                    System.out.println("Numeros divisibles entre 3 y 4 : " +totalambos);
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;

            }
            System.out.println("Desea ingresar otro numero 1)Si 2)No");
            res= scanner.nextInt();
        }while(res==1);
    }
}
