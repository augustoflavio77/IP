import java.util.Scanner;

public class Uni03Uri1018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;
        int n100;
        int n50; 
        int n20;
        int n10;
        int n5;
        int n2;
        int n1;

        valor = teclado.nextInt();

        n100 = valor / 100;
        n50 = (valor%100) / 50;
        n20 = ((valor%100)%50) / 20;
        n10 = (((valor%100)%50)%20) / 10;
        n5 = ((((valor%100)%50)%20)%10) / 5;
        n2 = (((((valor%100)%50)%20)%10)%5) /2;
        n1 = ((((((valor%100)%50)%20)%10)%5)%2) / 1;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

        teclado.close();
        
    }
    
}