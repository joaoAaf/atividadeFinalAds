package App;

import java.util.Scanner;

public class CalculoJanelas {
	
	Scanner leia = new Scanner(System.in);
	Calculadora calculadora = new Calculadora();
	
	public double quantJanelas() {
		System.out.println("==========CALCULO QUANTIDADE DE JANELAS==========");
		System.out.println("Digite as dimensões da(s) janela(s) que deseja instalar:");
		System.out.println("Comprimento:");
		double comprimentoJanela = calculadora.recebeNumero();
		System.out.println("Altura:");
		double alturaJanela = calculadora.recebeNumero();
		System.out.println("Digite as dimenções do ambiente que deseja instalar a(s) janela(s):");
		System.out.println("Comprimento:");
		double comprimentoAmbiente = calculadora.recebeNumero();
		System.out.println("Largura:");
		double larguraAmbiente = calculadora.recebeNumero();
		double areaJanela = calculadora.multiplicacao(comprimentoJanela, alturaJanela);
		double areaAmbiente = calculadora.multiplicacao(comprimentoAmbiente, larguraAmbiente);
		double areaJanelaBruta;
		double quantJanelas = 0;
		String opcao = "";
		do {
			System.out.println("O ambiente em questão é um banheiro ou depósito?");
			System.out.println("1 - Sim;");
			System.out.println("2 - Não;");
			opcao = leia.nextLine();
			if (opcao.equals("1")) {
				areaJanelaBruta = calculadora.divisao(areaAmbiente, 8);
				quantJanelas = calculadora.teto(calculadora.divisao(areaJanelaBruta, areaJanela));
				break;
			}
			else if (opcao.equals("2")) {
				areaJanelaBruta = calculadora.divisao(areaAmbiente, 6);
				quantJanelas = calculadora.teto(calculadora.divisao(areaJanelaBruta, areaJanela));
				break;
			}
			else {
				System.out.println("Opção Inválida!");
			}
		} while (true);
		
		return quantJanelas;
	}
	
}