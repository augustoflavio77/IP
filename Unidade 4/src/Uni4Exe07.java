import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int peso;
        double valorPagar;
        double pesoExcedido;
        double qtAdicional;
        
        peso = teclado.nextInt();
        
        System.out.println("Entre com peso da carta: ");
        valorPagar = 0;

        if (peso <= 50) {
                valorPagar = 0.45;
                
        }
        else{
            pesoExcedido = peso - 50;

            qtAdicional = (pesoExcedido / 20) + 1;

            valorPagar = 0.45f + 0.45f * qtAdicional;
            
        }

        System.out.println("Custo do selo: " + valorPagar);
        
    teclado.close();
    }
}
