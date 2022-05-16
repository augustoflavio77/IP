import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double b;
        double h;
        double l;
        double r;

        System.out.println("Escreva uma opção:");
        System.out.println("T: Calcular a área de um triângulo com base b e altura h");
        System.out.println("Q: Calcular a área de um quadrado de lado l");
        System.out.println("R: Calcular a área de um retângulo de base b e altura");
        System.out.println("C: Calcular a área de um círculo de raio r");

        char opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo:");
                b = teclado.nextDouble();
                h = teclado.nextDouble();

                double triangulo = b * h / 2;

                System.out.println("A área do triângulo é: " + triangulo);
                break;
            case 'Q':
                System.out.println("Digite o lado");
                l = teclado.nextDouble();

                double quadrado = l * l;
                System.out.println("A área do quadrado é " + quadrado);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retângulo:");
                b = teclado.nextDouble();
                h = teclado.nextDouble();

                double retangulo = b * h;
                System.out.println("A área do retângulo é " + retangulo);
                break;
            case 'C':
                System.out.println("Digite o raio:");
                r = teclado.nextDouble();

                double raio = Math.PI * Math.pow(r, 2);

                System.out.println("A área do círculo é: " + raio);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        teclado.close();
    }
}
