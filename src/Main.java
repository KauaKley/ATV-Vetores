public class Main {
    public static void main(String[] args) {

        double tempDiaria001 = 31.3;
        double tempDiaria002 = 32.2;
        double tempDiaria003 = 33.5;
        double tempDiaria004 = 34.1;
        double tempDiaria005 = 26.3;

        double [] temperaturas = new double[365];
        temperaturas [0] = 31.3;
        temperaturas [1] = 32.2;
        temperaturas [2]  = 33.5;
        temperaturas [3]  = 34.1;
        temperaturas [4]  = 26.3;

        System.out.println("A temperatura do dia 4 é " + temperaturas [3]);
        System.out.println("O tamanho do Array é " + temperaturas.length);
        System.out.println("Valores do array é " );

        for (int i = 0; i < temperaturas.length; i++){
            System.out.println(temperaturas [i]);
        }
    }
}