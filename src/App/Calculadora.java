package App;
import java.util.Scanner;

public class Calculadora {

//Função para pedir numeros
    Scanner leia = new Scanner(System.in);

    public double recebeNumero() {
        double numeroDouble;
        while (true) {
            String numero = leia.nextLine();
            try {
                numeroDouble = Double.parseDouble(numero);
                break;
            }
            catch (Exception e) {
                System.out.println("Número Inválido!");
                System.out.println("Digite um número:");
            }
        }
        return numeroDouble;
    }

//Operações calculadora
    public double soma(double numeroA, double numeroB ) {
        return numeroA + numeroB;
    }
    public double subtracao(double numeroA, double numeroB ) {
        return numeroA - numeroB;
    }
    public double divisao(double numeroA, double numeroB) {
        while (numeroB==0) {
            System.out.println("Não existe divisão por zero!");
            System.out.println("Digite um novo divisor:");
            numeroB = recebeNumero();
        }
        double resultado = numeroA/numeroB;
        return resultado;
    }
    public double multiplicacao(double numeroA, double numeroB) {
        double resultado = numeroA*numeroB;
        return resultado;
    }
    public double exponencial(double numeroA, double numeroB) {
        return Math.pow(numeroA, numeroB);
    }
    public double raizQuadrada(double numeroA) {
        return Math.sqrt(numeroA);
    }
    public double piso(double numeroA) {
        return Math.floor(numeroA);
    }
    public double teto(double numero) {
        double resultado = Math.ceil(numero);
        return resultado;
    }
}
