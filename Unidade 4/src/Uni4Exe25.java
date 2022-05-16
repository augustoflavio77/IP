import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double soma;
        double produto;
        double diferenca;
        double divisao;

        System.out.println("Informe o número 1: ");
        double num1 = teclado.nextDouble();
        System.out.println("Informe o número 2: ");
        double num2 = teclado.nextDouble();

        System.out.println("Informe a opção: ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                diferenca = num1 - num2;
                System.out.println(diferenca);
                break;
            case 3:
                produto = num1 * num2;
                System.out.println(produto);
                break;
            case 4:
                if (num1 != 0 || num2 != 0) {
                    divisao = num1 / num2;
                    System.out.println(divisao);
                    break;
                }

            default: System.out.println("Opção Inválida");
                break;
        }

        teclado.close();
    }
}
