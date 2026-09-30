import java.util.Scanner;

public class registroAlumno {
    static void main() {
        String nombre;
        String apellido;
        int edad;
        String carrera;
        String semestre;
        double promedio;
        final String ESCUELA = "Tecnologico Nacional de Mexico";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu apellido");
        apellido = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("Escribe tu carrera");
        carrera = scanner.nextLine();
        System.out.println("Escribe tu semestre");
        semestre = scanner.nextLine();
        System.out.println("Escribe tu promedio");
        promedio = Double.parseDouble(scanner.nextLine());
        System.out.println(ESCUELA);
        System.out.println("REGISTRO DE ESTUDIANTE");
        System.out.println("Nombre:" + nombre);//IMPRIMIR NOMBRE
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad:" + edad);
        System.out.println("Carrera:" + carrera);
        System.out.println("Semestre:" + semestre);
        System.out.println("Promedio:" + promedio);

    }
}
