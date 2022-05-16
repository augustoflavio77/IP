import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira seu peso (kg): ");
        double massa = teclado.nextDouble();
        System.out.println("Insira sua altura (m): ");
        double altura = teclado.nextDouble();
        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Classificação: Magreza");

        } else {
            if ((imc >= 18.5) && (imc <= 24.9)) {

                System.out.println("Classificação: Saudável");

            } else {
                if ((imc >= 25) && (imc <= 29.9)) {

                    System.out.println("Classificação: Sobrepeso");

                } else {
                    if ((imc >= 30) && (imc <= 34.9)) {

                        System.out.println("Classificação: Obesidade Grau I");

                    } else {
                        if ((imc >= 35) && (imc <= 39.9)) {

                            System.out.println("Classificação: Obesidade Grau II (Severa)");

                        } else {
                            if (imc >= 40) {

                                System.out.println("Classificação: Obesidade Grau III (Mórbida)");

                            }

                        }

                    }

                }

            }

        }

        teclado.close();
    }
}