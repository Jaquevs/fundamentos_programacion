package Tema5;

import java.util.Scanner;

public class cajero {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        String nombre;
        double saldo, retiro;
        System.out.println("Ingrese su nombre:");
        nombre = scanner.next();

        System.out.println("Ingrese su saldo disponible:");
        saldo = scanner.nextDouble();

        System.out.println("¿Cuánto dinero desea retirar?");
        retiro = scanner.nextDouble();
        validarRetiro(nombre, saldo, retiro);
    }
    public static void validarRetiro(String nombre, double saldo, double retiro) {
        if (retiro <= 0) {
            System.out.println("RECHAZADO: La cantidad a retirar debe ser mayor a cero.");
        }

        else if (retiro > saldo) {
            System.out.println("RECHAZADO: El monto supera el saldo disponible en su cuenta.");
        }
        else if (retiro % 50 != 0) {
            System.out.println("RECHAZADO: La cantidad solicitada debe ser múltiplo de 50.");
        }
        else {
            double saldoRestante = saldo - retiro;
            mostrarComprobante(nombre, retiro, saldoRestante);
        }
    }
    public static void mostrarComprobante(String nombre, double retiro, double saldoRestante) {
        System.out.println("\nCOMPROBANTE DE RETIRO");
        System.out.println("Cliente: " + nombre);
        System.out.println("Cantidad retirada: $" + retiro);
        System.out.println("Saldo restante: $" + saldoRestante);
    }
}