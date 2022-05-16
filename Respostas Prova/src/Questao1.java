import java.util.Scanner;

public class Questao1 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nivel = "alto";
    String altura = "certa";
   
    if (nivel.equals("") && altura.equals("")) {
        System.out.println("Nivel e Altura");
    } else {
        System.out.println("Teste Altura");
    }if (altura.equals("")) {
        System.out.println("Altura Vazio");
        System.out.println("nível Vazio");
    } else {
        System.out.println("Altura Cadastrada");
    }

    System.out.println("Outro Nível");


    teclado.close();
    }
    
}