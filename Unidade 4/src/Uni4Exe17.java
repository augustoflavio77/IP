import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Renda: ");
        int renda = teclado.nextInt();
        System.out.println("Quantidades de Dependentes: ");
        int dependentes = teclado.nextInt();
        double imposto;
        teclado.close();
        if (renda > 2000 && renda <= 5000) {
            imposto = (renda * 0.05) - (dependentes * 0.02);
            System.out.println(imposto);
            System.out.println("Tá bão, mas podia estar melhor");
        } else if (renda > 5000 && renda <= 10000) {
            imposto = (renda * 0.10) - (dependentes * 0.02);
            System.out.println(imposto);
            System.out.println("Esse tá bem de vida");
        } else if (renda > 10000) {
            imposto = (renda * 0.15) - (dependentes * 0.02);
            System.out.println(imposto);
            System.out.println("Rico!?!?!?");
        } else {
            System.out.println("Eita bicho, pede um aumento ai");
        }
    }
}
