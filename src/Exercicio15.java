import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a posição do vetor " + i);
            vetorA[i] = scan.nextInt();
        }
        int quantidadeImpar = 0;
        int quantidadePar = 0;
        int resultado1;
        int resultado2;
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                quantidadePar++;
            }
            else{
                quantidadeImpar++;
            }
        }
        resultado1 = (quantidadePar * 100 )/ vetorA.length;
        resultado2 = (quantidadeImpar * 100 )/ vetorA.length;
        System.out.println("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
        System.out.println();
        System.out.println("A quantidade de numeros pares é: " + quantidadePar);
        System.out.println("A quantidade de numeros impares é: " + quantidadeImpar);
        System.out.println("A porcentagem de numeros pares é: " + resultado1 + " %");
        System.out.println("A porcentagem de numeros impares é: " + resultado2 + " %");
    }
}
