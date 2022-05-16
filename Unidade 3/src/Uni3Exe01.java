/*
_Enunciado:
Uma imobiliária vende apenas terrenos retangulares. Faça um programa para ler as dimensões de um terreno 
e depois exibir a área do terreno.

_Análise: 
OK

_Gordura:

//_Entradas:
ler(largura)
ler(comprimento)

//_Processos:

//_Saídas:
// área do terreno
largura x comprimento

*/
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      double largura;
      double comprimento;

      // _ Entradas:
      System.out.println("Entre com a largura: ");
      largura = teclado.nextDouble();
      System.out.println("Entre com a largura: ");
      comprimento = teclado.nextDouble();

      // _ Processos:
      double area = largura * comprimento;

      // _ Sáidas:área do terreno
      
      System.out.println("A área do terreno: " + area);
      

       teclado.close();
    }
   }
