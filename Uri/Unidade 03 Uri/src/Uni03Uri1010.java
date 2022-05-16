import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni03Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        String peca1Cod;
        double peca1Uni;
        double peca1Vlr;

        String peca2Cod;
        double peca2Uni;
        double peca2Vlr;

        double peca1Total;
        double peca2Total;
        double totalPagar;

        peca1Cod = teclado.next();
        peca1Uni = teclado.nextDouble();
        peca1Vlr = teclado.nextDouble();

        peca2Cod = teclado.next();
        peca2Uni = teclado.nextDouble();
        peca2Vlr = teclado.nextDouble();

        peca1Total = peca1Uni * peca1Vlr;

        peca2Total = peca2Uni * peca2Vlr;

        totalPagar = peca1Total + peca2Total;

        System.out.println("VALOR A PAGAR: R$ " + df_2.format(totalPagar));

    teclado.close();
    }
}
