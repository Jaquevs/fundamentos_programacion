package Tema5;
public class Metodos {
    static int CONSTANTE = 10;
    static void main() {
        System.out.println("Hola Mundo");
        float a =5.0f;//con decimales 
        float b=10.5f;
        //suma de flotantes
        suma();
        resta();
        float c=a+b+CONSTANTE;

        System.out.println("c = " + c);
    }
    public static void suma(){
        float a=6.0f;
        float b=15.0f;
        System.out.println("Resultado : " + (a+b+CONSTANTE));
    }
    public static void resta(){//metodo
        float a=6.0f;
        float b=15.0f;
        System.out.println("Resultado : " + (a-b+CONSTANTE));

    }
}
