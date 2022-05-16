public class Uni5Exe04 {
    public static void main(String[] args) {
        
        double s = 0;
        double denominador = 2.0;
        double numerador = 3.0;
        double numPar = 4.0;
        for (int i = 0; i < 20; i++) {
            s = numerador / denominador;
            numerador = numerador + 2.0;
            denominador = denominador + numPar;
            numPar += 2.0;
            
        }
        System.out.println("O valor de 'S' é: " + s);
    
        }
        
    }
