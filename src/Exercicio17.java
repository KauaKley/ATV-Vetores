import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorIdade = new int[10];

        for (int i = 0; i < vetorIdade.length; i++){
            System.out.println("Digite as idades: ");
            vetorIdade[i] = scan.nextInt();
        }
        int quantidadeMaior35 = 0;

        for (int i = 0; i < vetorIdade.length; i++){
            if (vetorIdade[i] > 35){
                quantidadeMaior35++;
            }
        }
        System.out.println("Vetor de Idade = ");
        for (int i = 0; i < vetorIdade.length; i++){
            System.out.println(vetorIdade[i]);
        }
        System.out.println("A quantidade de pessoas com mais de 35 anos é: " + quantidadeMaior35);
    }
}
