import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni03Uri1008 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    DecimalFormat df_0 = new DecimalFormat("0");

        double funcNum;
        double funcHrs;
        double vlrHrs;
        double funcSalario;

        funcNum = teclado.nextDouble();
        funcHrs = teclado.nextDouble();
        vlrHrs = teclado.nextDouble();

        funcSalario = funcHrs * vlrHrs;

        System.out.println("NUMBER = " + df_0.format(funcNum));
        System.out.println("SALARY = U$ " + df_2.format(funcSalario));

    teclado.close();
    }
    
}