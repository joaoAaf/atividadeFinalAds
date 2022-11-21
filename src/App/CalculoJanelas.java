package App;

public class CalculoJanelas {
	
	Calculadora calculadora = new Calculadora();
	
	public double calculoJanelas() {
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
		double opcao = 0;
		while (opcao!=1 || opcao!=2) {
			System.out.println("O ambiente em questão é um banheiro ou depósito?");
			System.out.println("1 - Sim;");
			System.out.println("2 - Não;");
			opcao = calculadora.recebeNumero();
			if (opcao==1) {
				areaJanelaBruta = calculadora.divisao(areaAmbiente, 8);
				quantJanelas = calculadora.teto(calculadora.divisao(areaJanelaBruta, areaJanela));
			}
			else if (opcao==2) {
				areaJanelaBruta = calculadora.divisao(areaAmbiente, 6);
				quantJanelas = calculadora.teto(calculadora.divisao(areaJanelaBruta, areaJanela));
			}
			else {
				System.out.println("Opção Inválida!");
			}
		}
		return quantJanelas;
	}
	
}
