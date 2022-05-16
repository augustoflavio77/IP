import java.util.Scanner;

public class Uni03Uri1007 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

        int A;
        int B;
        int C;
        int D;
        int prod1;
        int prod2;
        int dif;
        
        A = teclado.nextInt(); 
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        prod1 = A * B;
        prod2 = C * D;

        dif = prod1 - prod2;

        System.out.println("DIFERENCA = " + dif);

    teclado.close();
    }
}
