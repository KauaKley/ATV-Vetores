import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição do vetor " + i);
            vetorA[i] = scan.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                soma += vetorA[i];
            }
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println();
        System.out.println("A soma dos numeros pares é: " + soma);
    }
}
