package Tema3;
import java.util.Scanner;

public class Examen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PRECIOAGUA = 15;
        final int PRECIOJUGO = 22;
        final int PRECIOGALLETAS = 18;
        final int PRECIOSANDWICH = 45;
        int opcionMenu;
        int cantidadUnidades;
        int totalCompra = 0;
        double totalRecaudado = 0;
        int totalUnidadesVendidas = 0;
        do {
            System.out.println("\n Seleccione una opcion : ");
            System.out.println("1. Agua ($15)");
            System.out.println("2. Jugo ($22)");
            System.out.println("3. Galletas ($18)");
            System.out.println("4. Sándwich ($45)");
            System.out.println("5. Consultar total de la compra");
            System.out.println("6. Finalizar programa");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Ingresa la cantidad de unidades que deseas: ");
                    cantidadUnidades = scanner.nextInt();

                    while (cantidadUnidades <= 0) {
                        System.out.print(" Debe ser un número positivo mayor a 0. Ingresa de nuevo la cantidad : ");
                        cantidadUnidades = scanner.nextInt();
                    }
                    int precioProducto = 0;
                    if (opcionMenu == 1) {
                        precioProducto = PRECIOAGUA;
                    } else if (opcionMenu == 2) {
                        precioProducto = PRECIOJUGO;
                    } else if (opcionMenu == 3) {
                        precioProducto = PRECIOGALLETAS;
                    } else if (opcionMenu == 4) {
                        precioProducto = PRECIOSANDWICH;
                    }
                    int importeCompra = precioProducto * cantidadUnidades;
                    totalCompra += importeCompra;
                    totalRecaudado += importeCompra;
                    totalUnidadesVendidas += cantidadUnidades;
                    if (importeCompra < 50) {
                        System.out.println("Clasificación: Compra pequeña (Menor a $50)");
                    } else if (importeCompra >= 50 && importeCompra <= 100) {
                        System.out.println("Clasificación: Compra mediana (Entre $50 y $100)");
                    } else {
                        System.out.println("Clasificación: Compra grande (Supera los $100)");
                    }
                    break;

                case 5:
                    System.out.println("El total de tu compra actual es: $" + totalCompra);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println(" Opción no valida. Intenta de nuevo");
                    break;
            }
        } while (opcionMenu != 6);
        System.out.println("Dinero total recaudado: $" + totalRecaudado);
        System.out.println("Total de unidades vendidas: " + totalUnidadesVendidas);
    }
}