import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("X =");
        double x = teclado.nextDouble();
        System.out.println("Y =");
        double y = teclado.nextDouble();
        teclado.close();

        if ((x == 0) && (y == 0)) {

            System.out.println("Quadrante 0");

        } else {

            if ((x > 0) && (y > 0)) {

                System.out.println("Quadrante 1");

            } else {

                if ((x > 0) && (y < 0)) {

                    System.out.println("Quadrante 2");

                } else {

                    if ((x < 0) && (y < 0)) {

                        System.out.println("Quadrante 3");

                    } else {

                        if ((x < 0) && (y > 0)) {

                            System.out.println("Quadrante 4");
                        }
                    }
                }
            }
        }

    }
}