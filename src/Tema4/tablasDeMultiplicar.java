package Tema4;

public class tablasDeMultiplicar {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("j = "+ i);
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    System.out.println(i+" * " + j + "*" +k+ " = " + (i*j*k));
                }
            }//fin for j
        }//fin for i




    }
}
