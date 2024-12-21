import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite os valores do vetor");
            vetorA[i] = scan.nextInt();
        }
        int somaMenorQuinze = 0;
        int somaMaiorQuinze = 0;
        int menorQuinze = 0;
        int quantidadeQuinze = 0;
        int media = 0;
        int maiorQuinze = 0;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] < 15){
                somaMenorQuinze += vetorA[i];
                menorQuinze++;
            }
            else if (vetorA[i] == 15) {
                quantidadeQuinze++;
            }
            else {
                somaMaiorQuinze += vetorA[i];
                maiorQuinze++;

                media = somaMaiorQuinze / maiorQuinze;
            }
        }
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        System.out.println("----------------------");
        System.out.println("Menores que 15: " + menorQuinze);
        System.out.println("Soma dos menores que 15: " + somaMenorQuinze);
        System.out.println("----------------------");
        System.out.println("Quantidade de 15: " + quantidadeQuinze);
        System.out.println("----------------------");
        System.out.println("Maiores que 15: " + maiorQuinze);
        System.out.println("Media dos maiores que 15: " + media);
    }
}
