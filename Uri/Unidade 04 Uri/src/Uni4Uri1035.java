import java.io.IOException;
import java.util.Scanner;

public class Uni4Uri1035 {
    public static void main(String[] args) throws IOException  {
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        
        if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
            System.out.println("Valores aceitos"); 
        } else { 
            System.out.println("Valores nao aceitos");
        }
        

        teclado.close();
    }
}
