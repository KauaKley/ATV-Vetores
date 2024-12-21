import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int [10];
        int quantidadePares = 0;
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                quantidadePares++;
            }
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println();
        System.out.println("A quantidade de numeros pares é: " + quantidadePares);
    }
}
