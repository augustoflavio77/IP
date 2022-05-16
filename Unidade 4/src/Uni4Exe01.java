import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int horasMes;
        int horasValor;
        int salarioTotal;
        int salarioExtra;
        
        System.out.println("Entre com as horas trabalhadas no mês: ");
        horasMes = teclado.nextInt();
        System.out.println("Entre com o valor pago por hora: ");
        horasValor = teclado.nextInt();


        salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {
            
            salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }   
        
        System.out.println("O salário total é: " + salarioTotal);

        teclado.close();
    }
}
