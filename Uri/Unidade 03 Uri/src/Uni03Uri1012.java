import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni03Uri1012 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       DecimalFormat df_3 = new DecimalFormat("0.000");
       
        double A;     
        double B;
        double C;
        double trinangulo;
        double circulo;
        double pi = 3.14159;
        double trapezio; 
        double quadrado;
        double retangulo;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        trinangulo = A * C / 2;
        circulo = C * C * pi;
        trapezio = (A + B) * C / 2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println("TRIANGULO: " + df_3.format(trinangulo));
        System.out.println("CIRCULO: " + df_3.format(circulo));
        System.out.println("TRAPEZIO: " + df_3.format(trapezio));
        System.out.println("QUADRADO: " + df_3.format(quadrado));
        System.out.println("RETANGULO: " + df_3.format(retangulo));

    teclado.close();
    }
    
}