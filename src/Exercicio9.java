import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //criação do vetor
        double [] vetorA = new double[10];
        double [] vetorB = new double[vetorA.length];
        double [] vetorC = new double[vetorA.length];
        //leitura dos valores
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição de A " + i);
            vetorA[i] = scan.nextDouble();
        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Entre com o valor da posição de B " + i);
            vetorB[i] = scan.nextDouble();
        }
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        //mostra os valores de cada vetor
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println();

        System.out.println("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.println(vetorB[i]);
        }
        System.out.println();

        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.println(decimalFormat.format(vetorC[i]));
        }
    }
}


