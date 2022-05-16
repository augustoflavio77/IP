public class Uni5Exe03 {
    public static void main(String[] args) {
        
        double divisao;
        double soma = 0;
        double vlrInicial = 0; 

        for (double i = 1; i <= 100 ; i++) {
            divisao = 1 / i;

            soma = vlrInicial + divisao;
            vlrInicial = soma;

        }
        System.out.println(soma);

    }
}
