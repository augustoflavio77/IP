import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        double numero;
        numero = teclado.nextDouble();
    
        if (numero != (int) numero) {
            System.out.println("O número tem casas decimais");
        }

        else {
            System.out.println("O número não tem casas decimais");
        }

    teclado.close();
    }
}
