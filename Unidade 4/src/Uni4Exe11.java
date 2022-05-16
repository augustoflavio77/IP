import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int irmao1, irmao2, irmao3;

        System.out.println("Informe o ano de nascimento do Primeiro Irmão: ");
        irmao1 = teclado.nextInt();
        System.out.println("Informe o ano de nascimento do Segundo Irmão: ");
        irmao2 = teclado.nextInt();
        System.out.println("Informe o ano de nascimento do Terceiro Irmão: ");
        irmao3 = teclado.nextInt();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("TRIGÊMEOS");

        } else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
            System.out.println("GÊMEOS");

        } else if (irmao1 != irmao2 && irmao1 != irmao3 && irmao2 != irmao3) {
            System.out.println("APENAS IRMÃOS");
        }

        teclado.close();
    }

}