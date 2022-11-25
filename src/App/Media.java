package App;

public class Media {
	Calculadora celular = new Calculadora();
	public double calculaMedia(){
		System.out.println("Digite dois números para calcular a média:");
		double numeroA  = celular.recebeNumero();
		double numeroB = celular.recebeNumero();
		double soma = celular.soma(numeroA, numeroB);
		double media = celular.divisao(soma, 2);
		return media;
	}
}
