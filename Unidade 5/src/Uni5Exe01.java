import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            
            if ( i  % 2 == 0 ) {
                System.out.println( i + ": Par");
            } else {
                System.out.println( i + ": Impar");
            }
        }
       
        teclado.close();
    }

}