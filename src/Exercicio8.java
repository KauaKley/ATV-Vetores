import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //criação do vetor
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];
        //leitura dos valores
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição de A " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++){
            System.out.println("Entre com o valor da posição de B " + i);
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
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

        System.out.println("Vetor C = ");
        for (int i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
    }
}
