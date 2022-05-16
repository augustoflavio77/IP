import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Meses do funcionario: ");
        int meses = teclado.nextInt();
        System.out.println("Salario do funcionario: ");
        int salario = teclado.nextInt();
        teclado.close();

        if (meses <= 12) {
            System.out.println((salario * 0.05) + salario);
        }
        if (meses >= 13 && meses <= 48) {
            System.out.println((salario * 0.07) + salario);
        }
    }

}