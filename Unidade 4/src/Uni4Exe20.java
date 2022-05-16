import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota 1:");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = teclado.nextDouble();
        System.out.println("Digite a nota 3:");
        double nota3 = teclado.nextDouble();
        System.out.println("Digite a nota dos Exercícios:");
        double notaExer = teclado.nextDouble();
        double mediaSoma = nota1 + nota2 * 2 + nota3 * 3 + notaExer;
        double media = mediaSoma / 7;

        if (media >= 9.0) {

            char mediA = 'A';
            System.out.println(media);
            System.out.println(mediA + " Aprovado ");

        } else {
            if ((media >= 7.5) && (media < 9.0)) {

                char mediB = 'B';
                System.out.println(media);
                System.out.println(mediB + " Aprovado ");

            } else {
                if ((media >= 6.0) && (media < 7.5)) {

                    char mediC = 'C';
                    System.out.println(media);
                    System.out.println(mediC + " Aprovado ");

                } else {
                    if ((media >= 4.0) && (media < 6.0)) {

                        char mediD = 'D';
                        System.out.println(media);
                        System.out.println(mediD + " Reprovado ");

                    } else {
                        if (media < 4.0)
                            ;

                        char mediE = 'E';
                        System.out.println(media);
                        System.out.println(mediE + " Reprovado ");

                    }

                }

            }

            teclado.close();
        }
    }

}
