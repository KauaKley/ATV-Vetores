import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorIdade = new int[10];

        for (int i = 0; i < vetorIdade.length; i++){
            System.out.println("Digite a idade do grupo de pessoas: ");
            vetorIdade[i] = scan.nextInt();
        }
        int maiorIdade = vetorIdade[0];
        int menorIdade = vetorIdade[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 0; i < vetorIdade.length; i++){
            if (vetorIdade[i] > maiorIdade){
                maiorIdade = vetorIdade[i];
                posicaoMaior = i;
            }
            if (vetorIdade[i] < menorIdade){
                menorIdade = vetorIdade[i];
                posicaoMenor = i;
            }
        }
        System.out.println("A maior idade é: " + maiorIdade + " e sua posição é: " + posicaoMaior);
        System.out.println("A menor idade é: " + menorIdade + " e sua posição é: " + posicaoMenor);
    }
}
