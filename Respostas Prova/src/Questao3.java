import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a Inicial da Cor: ");
        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra);
        
        if (letra == 'V') {
            System.out.println("Verde");
        } else {
            if (letra == 'A') {
                System.out.println("Azul");
            } else {
                if (letra == 'B') {
                    System.out.println("Branco");
                } else {
                System.out.println("Tipo Incorreto");
            }
        }
    }
        teclado.close();
    }
}