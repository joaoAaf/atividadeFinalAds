package App;

public class CalculaIMC {

	Calculadora calculadoraIMC = new Calculadora();

	public void calculaIMC() {
	
	System.out.println("Digite o seu peso: ");
	double peso = calculadoraIMC.recebeNumero();
	
	System.out.println("Digite a sua altura: ");
	double altura = calculadoraIMC.recebeNumero();
	
	double imc = calculadoraIMC.divisao(peso,calculadoraIMC.multiplicacao(altura, altura));	
	System.out.println ("Seu imc é: " + imc);
	
	
		if (imc <= 18.5) {
			System.out.println ("Voce está com baixo peso");
		}
			
		else if (imc > 18.5 && imc <= 25.0) {
		 		System.out.println ("Você está com o peso adequado");
		 }
		 		
		else if (imc > 25.0 && imc <= 30.0) {
		 		System.out.println ("Você está com sobrepeso");
		}
		else {
		 		System.out.println ("Você está com obesidade");
			
		}
		
	
}
}

		 		
		 		
		 		
		

	
	
	
	
	

