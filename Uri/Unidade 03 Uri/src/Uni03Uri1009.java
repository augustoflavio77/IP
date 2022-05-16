import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni03Uri1009 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

        String pesNome;
        double salFixo;
        double vendasMes;
        double difVendas;
        double salTotal; 

        pesNome = teclado.next();
        salFixo = teclado.nextDouble();
        vendasMes = teclado.nextDouble();

        difVendas = vendasMes * 0.15;

        salTotal = salFixo + difVendas;

        System.out.println("TOTAL = R$ " + df_2.format(salTotal));

    teclado.close();
    }


}
