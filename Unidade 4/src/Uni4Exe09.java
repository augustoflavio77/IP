import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o Primeiro valor: ");
        valor1 = teclado.nextInt();
        System.out.println("Informe o Segundo valor: ");
        valor2 = teclado.nextInt();
        if (valor1 % valor2 == 0 || valor2 % valor1 ==0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }
    
    teclado.close();
    }
}
