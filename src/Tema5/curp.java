package Tema5;

import java.util.Scanner;

public class curp {

     static void main() {
        Scanner scanner = new Scanner(System.in);

        String nombre, paterno, materno, dia, mes, anio, sexo, estado, fechaCompleta;

        System.out.println("Ingresa tu primer nombre:");
        nombre = scanner.nextLine().toUpperCase().trim();
        if (nombre.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return;
        }

        System.out.println("Ingresa tu apellido paterno:");
        paterno = scanner.nextLine().toUpperCase().trim();
        if (paterno.isEmpty()) {
            System.out.println("Error: El apellido paterno no puede estar vacío.");
            return;
        }


        System.out.println("Ingresa tu apellido materno:");
        materno = scanner.nextLine().toUpperCase().trim();
        if (materno.isEmpty()) {
            System.out.println("Error: El apellido materno no puede estar vacío.");
            return;
        }

        System.out.println("Ingresa tu día de nacimiento (ej. 01):");
        dia = scanner.nextLine().trim();

        System.out.println("Ingresa tu mes de nacimiento (ej. 02):");
        mes = scanner.nextLine().trim();

        System.out.println("Ingresa los dos últimos dígitos de tu año de nacimiento (ej. 99):");
        anio = scanner.nextLine().trim();


        fechaCompleta = dia + "/" + mes + "/" + anio;

        System.out.println("Ingresa tu sexo (H o M):");
        sexo = scanner.nextLine().toUpperCase().trim();
        if (!sexo.equals("H") && !sexo.equals("M")) {
            System.out.println("Error: Sexo no válido. Debe ser H o M.");
            return;
        }

        System.out.println("Ingresa tu entidad federativa (ej. Hidalgo):");
        estado = scanner.nextLine().toUpperCase().trim();


        generarCURP(nombre, paterno, materno, fechaCompleta, sexo, estado);
    }


    public static char obtenerPrimeraLetra(String palabra) {
        return palabra.charAt(0);
    }


    public static char obtenerPrimeraVocal(String palabra) {
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                return letra;
            }
        }
        return 'X';
    }

    public static char obtenerPrimeraConsonante(String palabra) {
        for (int i = 1; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra != 'A' && letra != 'E' && letra != 'I' && letra != 'O' && letra != 'U') {
                return letra;
            }
        }
        return 'X';
    }

    public static String obtenerFecha(String fecha) {
        char dia1 = fecha.charAt(0);
        char dia2 = fecha.charAt(1);
        char mes1 = fecha.charAt(3);
        char mes2 = fecha.charAt(4);
        char anio1 = fecha.charAt(6);
        char anio2 = fecha.charAt(7);

        return "" + anio1 + anio2 + mes1 + mes2 + dia1 + dia2;
    }

    public static String obtenerClaveEstado(String estado) {
        if (estado.equals("HIDALGO")) {
            return "HG";
        } else if (estado.equals("JALISCO")) {
            return "JC";
        } else if (estado.equals("CIUDAD DE MEXICO") || estado.equals("CDMX")) {
            return "DF";
        } else if (estado.equals("ESTADO DE MEXICO")) {
            return "MC";
        } else if (estado.equals("PUEBLA")) {
            return "PL";
        } else {
            return "NE";
        }
    }


    public static void generarCURP(String nombre, String paterno, String materno, String fecha, String sexo, String estado) {

        char p1 = obtenerPrimeraLetra(paterno);
        char p2 = obtenerPrimeraVocal(paterno);
        char p3 = obtenerPrimeraLetra(materno);
        char p4 = obtenerPrimeraLetra(nombre);
        String p5_10 = obtenerFecha(fecha);
        char p11 = obtenerPrimeraLetra(sexo);
        String p12_13 = obtenerClaveEstado(estado);
        char p14 = obtenerPrimeraConsonante(paterno);
        char p15 = obtenerPrimeraConsonante(materno);
        char p16 = obtenerPrimeraConsonante(nombre);
        String p17_18 = "00";

        String curpFinal = "" + p1 + p2 + p3 + p4 + p5_10 + p11 + p12_13 + p14 + p15 + p16 + p17_18;


        System.out.println("Tus datos procesados dan la CURP: " + curpFinal);

    }
}