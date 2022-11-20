import java.util.Scanner;

public class Calculadora {

    //Pedir os dados diretamente em cada função
    Scanner leia = new Scanner(System.in);

    public double recebeNumeros() {
        double numeroDouble;
        while (true) {
            System.out.println("Digite um número:");
            String numero = leia.nextLine();
            try {
                numeroDouble = Double.parseDouble(numero);
                break;
            }
            catch (Exception e) {
                System.out.println("Número Inválido!");
            }
        }
        
        return numeroDouble;
    }

    public double soma() {
        return 0;
    }
    public double subtracao() {
        return 0;
    }
    public double divisao() {
        return 0;
    }
    public double multiplicacao() {
        return 0;
    }
    public double exponencial() {
        return 0;
    }
    public double raizQuadrada() {
        return 0;
    }
    public double piso() {
        return 0;
    }
    public double teto() {
        return 0;
    }
}
