import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição do vetor " + i);
            vetorA[i] = scan.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 5 == 0){
                soma = soma + vetorA[i]; // ou +=
            }
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println();
        System.out.println("A soma dos valores é: " + soma);
    }
}
