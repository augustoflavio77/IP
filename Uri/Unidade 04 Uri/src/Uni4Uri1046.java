import java.io.IOException;
import java.util.Scanner;

public class Uni4Uri1046{
    
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
		
int hInicial = teclado.nextInt();
int hFinal = teclado.nextInt();

if (hInicial > hFinal) { 
	System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
} else if (hFinal > hInicial) {
	System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
} else {
	System.out.println("O JOGO DUROU 24 HORA(S)");
}
teclado.close();

    }
    
}