import java.util.Scanner;

public class Uni4Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int idadeMarquinhos, idadeZezinho, idadeLuluzinha;

    System.out.println("Entrea c/ a idade do Marquinhos: ");
    idadeMarquinhos = teclado.nextInt();
    
    System.out.println("Entrea c/ a idade do Zezinho: ");
    idadeZezinho = teclado.nextInt();
    
    System.out.println("Entrea c/ a idade do Luluzinha: ");
    idadeLuluzinha = teclado.nextInt();

    if ((idadeMarquinhos < idadeZezinho) && (idadeMarquinhos < idadeLuluzinha)) {
      System.out.println("Caçula: Marquinhos");
    } else {
        if (idadeZezinho < idadeLuluzinha) {
        System.out.println("Caçula: Zezinho");
        } else {
          System.out.println("Caçula: Luluzinha");
      }
    }

    teclado.close();
  }
}