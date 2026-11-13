package Tema4;

import java.util.Scanner;

public class ControlVentas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[3][5];

        int[] totalSucursal = new int[3];
        int[] totalDia = new int[5];
        int totalEmpresa = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Sucursal " + i + " ventas realizadas del dia " + j + ":");
                numeros[i][j] = entrada.nextInt();

                totalSucursal[i] += numeros[i][j];
                totalDia[j] += numeros[i][j];
                totalEmpresa += numeros[i][j];
            }
        }

        System.out.println("\n 😎Tabla de Ventas (Sucursales por Días)");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n💵 Total por Sucursal");
        int mayorVenta = -1;
        int sucursalMayor = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Sucursal " + i + " total: " + totalSucursal[i]);

            if (totalSucursal[i] > mayorVenta) {
                mayorVenta = totalSucursal[i];
                sucursalMayor = i;
            }
        }
        System.out.println("\n Ventas totales de la empresa: " + totalEmpresa);
        System.out.println(" Sucursal con mayores ventas: Sucursal " + sucursalMayor + " (" + mayorVenta + ")");

        System.out.println("\n Promedio de Ventas por Día ");
        for (int j = 0; j < 5; j++) {
            double promedioDia = totalDia[j] / 3.0;
            System.out.println("Día " + j + " promedio: " + promedioDia);
        }

        entrada.close();
    }
}