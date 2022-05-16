import java.util.Scanner;

public class Uni03Uri1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int segundosEntradas;
        int horas;
        int minutos;
        int segundos;

        segundosEntradas = teclado.nextInt();
        horas = segundosEntradas / 3600;
        minutos = (segundosEntradas % 3600) / 60;
        segundos = (segundosEntradas % 3600) % 60;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);

        teclado.close();
    }
    
}