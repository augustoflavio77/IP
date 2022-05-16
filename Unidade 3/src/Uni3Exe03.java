/*

_Enunciado:
Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento 
e exibir quantos litros ele conseguiu colocar no tanque.

_Análise: 
OK

_Gordura:
Um motorista deseja abastecer seu tanque de combustível.

//_Entradas:
ler o preço do litro da gasolina e o valor do pagamento

//_Processos:

//_Saídas:
exibir quantos litros ele conseguiu colocar no tanque.

*/

import java.util.Scanner;

public class Uni3Exe03 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        double precoLitroGasolina;
        double valorPagamento;
        double qtdLitros;
        
        // _ Entrada:
        System.out.println("informe o valor pago");
        valorPagamento = teclado.nextDouble();
        System.out.println("Informe o preço da gasolina");
        precoLitroGasolina = teclado.nextDouble();

        //_Processos: 
        qtdLitros = valorPagamento / precoLitroGasolina;
        

        //_Saídas:
        System.out.println("Quantidade de litros: " + qtdLitros);

    teclado.close();

    }
}
