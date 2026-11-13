import java.util.Scanner;

public class calificaciones {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        final int MINIMO_APROBATORIO=70;
        final int MINIMO_UNIDAD=60;
        int num1,num2,num3, prom;
        System.out.println("ingrese su primera calificacion");
        num1= scanner.nextInt();
        if (num1>=0 && num1<=100){
            System.out.println("ingrese su segunda calificacion");
            num2= scanner.nextInt();
            if (num2>=0 && num2<=100){
                System.out.println("ingrese su tercera calificacion");
                num3= scanner.nextInt();
                if (num3>=0 && num3<=100){
                    prom=((num1+num2+num3)/3);
                    if (prom>=70){
                        System.out.println("Esta aprobado");
                    }else {
                        System.out.println("esta reprobado");
                    }
                    System.out.println("primera calificion : " + num1);
                    System.out.println("segunda calificion : " + num2);
                    System.out.println("tercera calificion : " + num3);
                    System.out.println("promedio : " + prom);
                    if (num1<60){
                        System.out.println("Debe presentar recuperacion de la unidad 1");
                    }if (num2<60){
                        System.out.println("Debe presentar recuperacion de la unidad 2");
                    }if (num3<60){
                        System.out.println("Debe presentar recuperacion de la unidad 3");
                    }

                }
            }
        }



    }
}
