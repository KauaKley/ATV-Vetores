import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        int [] b = new int[5];
        b[0] = a[0];
        b[1] = a[1];
        b[2] = a[2];
        b[3] = a[3];
        b[4] = a[4];

        System.out.println("A = " + a[1]);
        System.out.println("B = " + b[1]);
        System.out.println("-----------------------");
        System.out.println("A = " + a.length);
        System.out.println("B = " + b.length);
        System.out.println("-----------------------");
        for (int i = 0; i < a.length; i++){
            System.out.println("A = " + a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("B = " + b[i]);
        }
    }
}
