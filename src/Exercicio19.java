import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double [] vetorNotas1 = new double[5];
        double [] vetorNotas2 = new double[vetorNotas1.length];
        double [] result = new double[vetorNotas1.length];

        for (int i = 0; i < vetorNotas1.length; i++){
            System.out.println("Digite todas as notas: ");

            vetorNotas1[i] = scan.nextDouble();
            vetorNotas2[i] = scan.nextDouble();
            result[i] = (vetorNotas1[i] + vetorNotas2[i] ) / 2;
        }

        System.out.println("Notas 1 = ");
        for (int i = 0; i < vetorNotas1.length; i++){
            System.out.println(vetorNotas1[i]);
        }

        System.out.println("Notas 2 = ");
        for (int i = 0; i < vetorNotas1.length; i++){
            System.out.println(vetorNotas2[i]);
        }

        System.out.println("Médias = ");
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

        for (int i = 0; i < vetorNotas1.length; i++) {

            if (result[i] >= 7) {
                System.out.println("Aprovada");
            } else {
                System.out.println("Reprovada");
            }
        }
    }
}
