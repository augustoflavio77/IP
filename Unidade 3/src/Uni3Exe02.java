/*
_Enunciado:
Uma loja de calçados está concedendo 12% de desconto nos produtos. 
Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos 
e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. 
Como resultado, o programa deverá exibir as seguintes mensagens:

//_Entradas:
preço do par de sapatos 

//_Processos:
12% de desconto 

valorDesconto
precoSapato

//_Saídas:
O valor do desconto é de R$ xxx
Opreço do par de sapatos com desconto é R$ xxx 

*/

import java.util.Scanner;

public class Uni3Exe02 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        double sapatoPreco = 0; 
        double sapatoDesconto = 0;
        double sapatoPrecoDesconto = 0;
    
        // _ Entradas
        System.out.println("Entre preço Sapato (par): ");
        sapatoPreco = teclado.nextInt();
        
        // _ Processos: 12% de desconto
        sapatoDesconto = sapatoPreco * 0.12; 
        sapatoPrecoDesconto = sapatoPreco - sapatoDesconto;

        // _ Saídas:
        System.out.println("O valor do desconto é de R$ " + sapatoDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + sapatoPrecoDesconto);

        teclado.close();
    }
}