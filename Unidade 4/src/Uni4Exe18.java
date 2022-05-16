import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int diaVencimento = 10;

        System.out.println("Insira o dia do pagamento:");
        int diaPagamento = teclado.nextInt();
        System.out.println("Digite o valor a Pagar:");
        double valorPagar = teclado.nextDouble();
        teclado.close();

        if (diaPagamento <= diaVencimento) {

            double valorDesconto = valorPagar * 0.10;
            double vlrTotal = valorPagar - valorDesconto;

            System.out.println("Parabéns!! Ao pagar até a data de vencimento, você ganhou desconto. Você pagará apenas R$ " + vlrTotal + " agora");

        } else {
            if (diaPagamento > diaVencimento && diaPagamento <= 15) {

                System.out.println("Você pagou 5 dias após o vencimento, portanto, perde seu desconto. Você pagará R$ " + valorPagar);

            } else {
                if (diaPagamento > 15) {

                    int difDias = diaPagamento - diaVencimento;
                    double valorMulta = valorPagar * (0.02 * difDias);
                    double vlrTotal = valorPagar + valorMulta;

                    System.out.println("Você pagou após " + difDias + " dias. Portanto, pagará o valor com multa de R$ " + vlrTotal);

                }

            }

        }

    }
}
