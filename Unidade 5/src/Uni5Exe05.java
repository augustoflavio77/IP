import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o número de linhas da sequencia?");
        int j = teclado.nextInt();

        int num = 8, numAtrasado = num;

        for (int i = 0; i <= j; i++) {
            if (i %2==0) {
                num += 2;
            }else{
                num = numAtrasado * 2; 
                numAtrasado *= 2;
            }
            System.out.println(num);
        }
        teclado.close();
    }
}
