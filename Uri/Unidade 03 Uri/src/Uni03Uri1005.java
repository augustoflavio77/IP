import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni03Uri1005 {

        public static void main(String[] args) {
        DecimalFormat df_5 = new DecimalFormat("0.00000");
        Scanner teclado = new Scanner (System.in);

            double A;
            double B;
            double notas;
            double MEDIA; 

            A = teclado.nextDouble();
            B = teclado.nextDouble();

            notas = 3.5 * A + 7.5 * B;
            MEDIA = notas / 11;

            System.out.println("MEDIA = " + df_5.format (MEDIA));

        teclado.close();
        }
}