package Tema2;

import java.util.Scanner;

public class examen {
    static void main() {
        String nom;
        int equi;
        final int PESO_MAXIMO=30;
        final int CARGO_LIGERO=150;
        final int CARGO_MEDIO=300;
        final int CARGO_PESADO=500;
        Scanner scsnner = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        nom= scsnner.nextLine();
        System.out.println("Peso de su equipaje");
        equi= scsnner.nextInt();
        if (equi>0&& equi<= 15){
            System.out.println("Nombre : " +nom);
            System.out.println("sin cargo adicional");
        }
        if (equi>15 && equi<=20){
            System.out.println("Nombre : " +nom);
            System.out.println("Tendra un cargo de : " +CARGO_LIGERO);
        }
        if (equi>20 && equi<= 30){
            System.out.println("Nombre : " +nom);
            System.out.println("Tendra un cargo adicional de : " +CARGO_MEDIO);
        }
        if (equi>PESO_MAXIMO){
            System.out.println("Nombre : " +nom);
            System.out.println("Mas de :"+PESO_MAXIMO+ " Cargo de : " + CARGO_PESADO + " El quipaje excede del peso permitido ");
        }
    }
}
