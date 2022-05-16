import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double valorPagar = 0;
        
        System.out.println("Informe as horas de chegada");
        int horasCheg = teclado.nextInt();
        System.out.println("Informe os minutos de chegada");
        double minutosCheg = teclado.nextDouble();
        System.out.println("Informe as horas de partida");
        int horasPart = teclado.nextInt();
        System.out.println("Informe os minutos de partida");
        double minutosPart = teclado.nextDouble();
        teclado.close();

        if (horasCheg > horasPart) {
            horasPart = horasPart + 24;
        }
        if (minutosCheg > minutosPart) {
            minutosPart = minutosPart + 60;
            horasPart = horasPart + 1;
        }

        int horaTotal = horasPart - horasCheg;
        System.out.println("O numero total de horas eh " + horaTotal);
        double minTot = minutosPart - minutosCheg;
        System.out.println("O numero total de minutos eh " + minTot);

        if (minTot >= 30 && minTot < 60) {
            horaTotal = horaTotal + 1;
        }
        if (horaTotal < 24) {
          
            switch (horaTotal) {
                case 0:
                    valorPagar = 5;
                    break;
                case 1:
                    valorPagar = 5;
                    break;
                case 2:
                    valorPagar = 5 + 5;
                    break;
                case 3:
                    valorPagar = 5 + 5 + 7.5;
                    break;
                case 4:
                    valorPagar = 5 + 5 + 7.5 + 7.5;
                    break;
                default:
                    valorPagar = 5 + 5 + 7.5 + 7.5 + (10 * (horaTotal - 4));
                    break;
            }
            System.out.println("O valor a ser pago é " + valorPagar);
        } else {
            System.out.println("Hora/Minuto ERRADO");
        }
    }
}