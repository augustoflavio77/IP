import java.io.IOException;
import java.util.Scanner;

public class Uni4Uri1042 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        if (A < B && A < C) {
            System.out.println(A);
            if (B < C) {
                System.out.println(B);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(B);
            }
        } else if (B < C) {
            System.out.println(B);
            if (A < C) {
                System.out.println(A);
                System.out.println(C);
            } else {
                System.out.println(C);
                System.out.println(A);
            }
        } else {
            System.out.println(C);
            if (A < B) {
                System.out.println(A);
                System.out.println(B);
            } else {
                System.out.println(B);
                System.out.println(A);
            }
        }

        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        teclado.close();
    }

}