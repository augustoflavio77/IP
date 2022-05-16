import java.util.Scanner;

public class Questao2 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe a Inicial da Forma de Pagamento: ");
    int debito;
    int pix;
    int crediário;
    
    char pagamento = teclado.next().charAt(0);
    

    switch (pagamento) {

        case 'D' :
             System.out.println();
        break;

        case 'P' :

        break;
        
        case 'C' :
        
        break;
        
        default:
        System.out.println("Opção Inválida");
        break;
    }
    
    teclado.close();
    }

}
