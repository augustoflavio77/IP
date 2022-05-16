import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int primeiroValor;
        int segundoValor;

        primeiroValor = teclado.nextInt();
        segundoValor = teclado.nextInt();

        if (primeiroValor > segundoValor ) {
            
            System.out.println("O maior valor é o Primeiro Valor");
        }

        else{
            System.out.println("O maior valor é o Segundo Valor");        
        }

        teclado.close();
    }    
}
