import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[15];
        double [] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com a posição " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = sqrt(vetorA[i]); //ou Math.sqrt()
        }
        System.out.println(" Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println();

        DecimalFormat decimalFormat = new DecimalFormat("###,###.###");

        System.out.println(" Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.println(decimalFormat.format(vetorB[i]));
        }
        System.out.println();
    }
}
